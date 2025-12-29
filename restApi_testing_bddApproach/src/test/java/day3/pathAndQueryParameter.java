package day3;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType.*;
public class pathAndQueryParameter {
@Test
	void testpathAndQueryParameter() {
		given()
		.pathParam("mypath","users")
		.queryParam("page", 2)
		.queryParams("id",5)
		.when()
		.get("https://reqres.in/api/{mypath}")
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
