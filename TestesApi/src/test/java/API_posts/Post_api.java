package API_posts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_api {

	@Test
	public void test_post() {

		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("userId", "1");
		json.put("name", "guilherme");
		json.put("title", "guilherme@itau.com");
		json.put("body", "Teste de Api post");
		
		request.body(json.toJSONString());
		Response response = request.post("https://jsonplaceholder.typicode.com/posts");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 201);

		System.out.println(response.getBody().asString());
		System.out.println("\nStatus Code: " + code);

	}

}
