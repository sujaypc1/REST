package getRequest;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponsecode()
	{
		
		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22");
         
		int code = resp.getStatusCode();
		
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}
	
	public void testbody()
	{
		
		//Response resp = RestAssred.get("http://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22")
         
		String data=get("http://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22").asString();
		System.out.println("Data is "+data);
		
		long time=get().getTime();
		System.out.println("Time is "+time);
		
		

	}


}