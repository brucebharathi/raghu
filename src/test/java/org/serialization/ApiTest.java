package org.serialization;

import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ApiTest extends BaseClass {
	@Test(priority=1)
	public void createpet() {
		System.out.println("POST");
		header("content-Type","application/json");
		Category category=new Category(10,"pet");
		ArrayList<String> photoUrls=new ArrayList<String>();
		photoUrls.add("google");
		photoUrls.add("fb");
		photoUrls.add("amazon");
		ArrayList<Tag> tags=new ArrayList<Tag>();
		Tag t1=new Tag(12,"A");
		Tag t2=new Tag(13,"B");
		Tag t3=new Tag(14,"C");
		tags.add(t1);
		tags.add(t2);
		tags.add(t3);
		Root root =new Root(123,category,"dog",photoUrls,tags,"avilable");
		body(root);
		int petId;
		Response response = methodType("POST","https://petstore.swagger.io/v2/pet");
		 int statusCode=getStatusCode(response);
	   System.out.println(statusCode);
	Root r = response.as(Root.class);
	petId = r.getId();
	System.out.println(petId);
	}

	@Test(priority=2)
	public void modifyPetDetails() 
	{
		System.out.println("PUT");
		header("content-Type","application/json");
		Category category=new Category(10,"pet");
		ArrayList<String> photoUrls=new ArrayList<String>();
		photoUrls.add("google");
		photoUrls.add("fb");
		photoUrls.add("amazon");
		ArrayList<Tag> tags=new ArrayList<Tag>();
		Tag t1=new Tag(13,"A");
		Tag t2=new Tag(11,"B");
		Tag t3=new Tag(15,"C");
		tags.add(t1);
		tags.add(t2);
		tags.add(t3);
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(8);
		Root root=new Root(12,category,randomAlphabetic,photoUrls,tags,"sold");
		body(root);
		int petId;
		Response response = methodType("PUT","https://petstore.swagger.io/v2/pet");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		ResponseBody body = getBody(response);
		System.out.println(body);
//		ResponseBody bodyAsString=getBodyAsString(response);
		Root r=response.as(Root.class);
		petId = r.getId();
		System.out.println(petId);
		Assert.assertEquals(statusCode, 200,"verify statusCode for update pet name");
		
		
		
		
		
	}
	
	
	
	
	
}
