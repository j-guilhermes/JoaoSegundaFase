package API_comments;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_api {

	@Test
	public void test_get() {

		RequestSpecification request = RestAssured.given();

		Response response = request.get("https://jsonplaceholder.typicode.com/comments");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 200);

		System.out.println(response.getBody().asString());
		System.out.println("\nStatus Code: " + code);

	}

	@Test
	public void test_get_404() {

		RequestSpecification request = RestAssured.given();

		Response response = request.get("https://jsonplaceholder.typicode.com/comments/1000");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 404);

		System.out.println(response.getBody().asString());
		System.out.println("\nStatus Code: " + code + "\n");

	}

}
