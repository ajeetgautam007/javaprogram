package day3;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class HeaderDemo {
	@Test
	void testheader() {
		
	
Response res =given()
.when().get("https://www.google.com/");
Headers myheaders=res.getHeaders();

for(Header hd :myheaders) {
	System.out.println(hd.getName()+"   "+hd.getValue());
}


}
}
