package API_posts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_api {

	@Test
	public void test_post() {

		RequestSpecification request = RestAssured.given();

		Response response = request.delete("https://jsonplaceholder.typicode.com/posts/2");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 200);

		System.out.println(response.getBody().asString());
		System.out.println("\nStatus Code: " + code);

	}

}
