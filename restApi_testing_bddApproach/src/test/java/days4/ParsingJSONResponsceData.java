package days4;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import org.testng.annotations.Test;

public class ParsingJSONResponsceData {
@Test(priority=1)
void testJsonResponsce() {
// approach 1
/*	
	given()
	.contentType("ContentType.JSON")
	
	.when()
	.get("http://localhost:3000/users/")
	.then()
	Assert.assertEquals(res.header("Content-Type"),"application/json");
	.body("name",equalTo("AJEET SINGH"))
	.log().all();
	*/



	Response res= given()
	.contentType("ContentType.JSON")
	
	.when()
	.get("http://localhost:3000/users/");
Assert.assertEquals(res.getStatusCode(),200);//validation

Assert.assertEquals(res.header("Content-Type"),"application/json");

		String name=res.jsonPath().get("name.title");
Assert.assertEquals(name,"AJEET SINGH");


















}




}
