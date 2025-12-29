package day3;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType.*;
import io.restassured.response.Response;
public class CookiesDemo {

	@Test(priority=1)
	void testcookies() {
		given()
		
		.when()
		.get("https://www.google.com/")
		.then()
		.cookie("AEC", "AaJma5vh1V3Q227FxEfpfxdFi6BaW2GR60v3XtlKbHtCqFBAqY7bhLoimiM")
		.log().all();
	}
	@Test(priority=2)
	void testcookiesinfo() {
		
		Response res=given()
		.when()
		.get("https://www.google.com/");
		
		// single cookie info
	String cookie_value=	res.getCookie("AEC");
	System.out.println("the value of cookie is:::"+cookie_value);
Map<String ,String >cookies_value=	res.getCookies();
for(String k:cookies_value.keySet()) {
	
	String cookie_val =res.getCookie(k);
	System.out.println(k+"             "+cookie_val);
}

	
//System.out.println(cookies_value.keySet());


	}
}
