package days07;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType.*;
import org.testng.annotations.Test;

public class BasicsAuthentication {
@Test(priority=1)
void testbasicsauthentaction() {
	given()
	.auth().basic("postman","password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then()
	.statusCode(200)
	.body("authenticated",equalTo(true))
	.log().all();
}
@Test(priority=2)
void testDIGESTauthentaction() {
	given()
	.auth().digest("postman","password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then()
	.statusCode(200)
	.body("authenticated",equalTo(true))
	.log().all();
}
@Test(priority=3)
void testPREEMPTITVEauthentaction() {
	given()
	.auth().preemptive().basic("postman","password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then()
	.statusCode(200)
	.body("authenticated",equalTo(true))
	.log().all();
}

@Test(priority=4)
void BearToken() {
	String bear_token="sdfghjkhgfdsfghjkhgfhj";
	
	given()
	.headers("Authorization","Bearer"+bear_token)
	
	.when()
	
	.get("https://postman-echo.com/basic-auth")
	
	.then()
	
	.statusCode(200)
	
	.log().all();
}

}




