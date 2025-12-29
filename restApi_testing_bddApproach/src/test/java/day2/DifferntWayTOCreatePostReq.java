package day2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class DifferntWayTOCreatePostReq {
@Test(priority=1)
void testPostusingHashMap() {
	HashMap data =new HashMap();
	data.put("name","ajeetagautam");
	data.put("location","Mh");
	data.put("phone","9876544321");
	String coursesarr[]= {"A","c++","java"};
	data.put("courses", coursesarr);
	
	given()
    .contentType("application/json")
   .body(data)
	.when()
	.post("http://localhost:3000/users")
	//.jsonPath().getString("id");
     .then()
     .statusCode(201)
     .body("location", equalTo("Mh"))
     .body("courses[0]", equalTo("A"))
     .body("courses[1]", equalTo("c++"))
     .body("courses[2]", equalTo("java"))
     .log().all();

}
//post request body using org json library
@Test(priority=2)
void testpostusingJsonLibrary() {
	
	JSONObject data =new JSONObject();
	data.put("name", "AJEET SINGH");
	data.put("location", "japan");
	data.put("phone", "123456");
	String classc[]= {"A","c++","java"};
	data.put("courses",classc);
	given()
    .contentType("application/json")
    .body(data.toString())
	.when()
	.post("http://localhost:3000/users")
	//.jsonPath().getString("id");
     .then()
     .statusCode(201)
     .body("location", equalTo("japan"))
     .body("courses[0]", equalTo("A"))
     .body("courses[1]", equalTo("c++"))
     .body("courses[2]", equalTo("java"))
     .log().all();
}
@Test(priority=3)
void testDelete() {
	given()
	.when()
	.delete("http://localhost:3000/users/651f")
			 .then()
			 .log().all();
}
//post request body using pojo class
@Test()
void testpostusingpojo() {
	POJO_postRequest data1= new POJO_postRequest();
	data1.setName("AjeetGAUTAM0001");
	data1.setLocation("bihar");;
	data1.setPhone("12345678");
	String classd[]= {"A","c++","java"};
	data1.setCourses(classd);
	
	given()
    .contentType("application/json")
    .body(data1)
	.when()
	.post("http://localhost:3000/users")
	//.jsonPath().getString("id");
     .then()
     .statusCode(201)
     .body("location", equalTo("japan"))
     .body("courses[0]", equalTo("A"))
     .body("courses[1]", equalTo("c++"))
     .body("courses[2]", equalTo("java"))
     .log().all();
}
void externalpostjson() {
	
	
}










}
