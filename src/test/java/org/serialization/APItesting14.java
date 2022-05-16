package org.serialization;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
	
public class APItesting14 {

	RequestSpecification reqSpec;
@Test
	public void getUserDetail() {
		reqSpec = RestAssured.given();
		Category category = new Category(10,"pet");
	ArrayList<String> photoUrls=new ArrayList<String>();
	
	photoUrls.add("google");
	photoUrls.add("fb");
	photoUrls.add("amazon");
	ArrayList<Tag> tags= new ArrayList<Tag>();
	Tag t1=new Tag(12,"a");
	Tag t2=new Tag(13,"b");
	Tag t3=new Tag(14,"c");
	tags.add(t1);
	tags.add(t2);
	tags.add(t3);
	Root root=new Root(123, category ,"Dog",photoUrls,tags,"available");
//	reqSpec = reqSpec.body(root);
//	Response response = reqSpec.post("https://petstore.swagger.io/v2/pet");
//	Root r = response.as(Root.class);
//	System.out.println(r.getId());
//	System.out.println(r.getName());
//	System.out.println(r.getStatus());
//	System.out.println(r.getCategory().getId());
//	System.out.println(r.getCategory().getName());
//	ArrayList<Tag> tags2 = r.getTags();
//	for (Tag tag : tags2) {
//		System.out.println(tag.getId());
//		System.out.println(tag.getName());
//	}
//	ArrayList<String> photoUrls2 = r.getPhotoUrls();
//	System.out.println(photoUrls2);
//	
	
	
//	int statusCode = response.statusCode();	
//	System.out.println(statusCode);
//	ResponseBody body = response.getBody();
//	System.out.println(body);
//	String asPrettyString = body.asPrettyString();
//	System.out.println(asPrettyString);
	}




}
