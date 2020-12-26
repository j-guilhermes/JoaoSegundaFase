package API_comments;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_api {

	@Test
	public void test_post() {

		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("name", "guilherme");
		json.put("email", "guilherme@itau.com");
		json.put("body", "Teste de Api put");

		request.body(json.toJSONString());
		Response response = request.put("https://jsonplaceholder.typicode.com/comments/90");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 200);

		System.out.println(response.getBody().asString());
		System.out.println("\nStatus Code: " + code);

	}

}
