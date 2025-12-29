package day1;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType.*;

public class httpsRequest {
	String id;
	@Test(priority=1)
void getuser() {
		given()
		.when().get("http://localhost:3000/users/")
		
		.then()
		.statusCode(200)
	    // .body("name","Ajeet")		
		.log().all();
		
}
	@Test(priority=2)
	void createUser() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("name","Gautam");
		hm.put("job","Testing&qa");
		hm.put("salary","15lacs");
		id=given()
	     .contentType("application/json")
	    .body(hm)
		.when()
		.post("http://localhost:3000/users")
		.jsonPath().getString("id");
	/*	.then()
		.statusCode(201)
		.log().all();*/
	}
	@Test(priority=3,dependsOnMethods= {"createUser"})
	void updateuser() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("name","sonu");
		hm.put("job","Testing&qa");
		hm.put("salary","18lacs");
		given()
	     .contentType("application/json")
	    .body(hm)
		.when()
		.put("http://localhost:3000/users/"+id)
		
		.then()
		.statusCode(200)
		.log().all();
	}
		
	@Test(priority=4)
	void deleteuser() {
		given()
		.when()
		.delete("http://localhost:3000/users/"+id)
		.then()
		.statusCode(200).log().all();
		
	}
}
