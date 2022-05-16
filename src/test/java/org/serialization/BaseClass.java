package org.serialization;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification reqSpec;
	Response response;
	
	public void headers(Headers headers)
	{
     reqSpec = RestAssured.given().headers(headers);
	}
	
	
	public void header(String key,String value)
	{
		reqSpec = RestAssured.given().header(key,value);
	}
	
	public void queryParam(String key,String value)
	{
		reqSpec = reqSpec.queryParam(key, value);
	}
	public void pathParam(String key,String value) 
	{
		reqSpec = reqSpec.pathParam(key, value);
	}
	public void body(Object body) 
	{
		reqSpec=reqSpec.body(body);
	}
	public Response methodType(String type,String endPoint) 
	{
	switch(type)
	{
	case "GET":
		response = reqSpec.get(endPoint);
		break;
	case "POST":
		response = reqSpec.get(endPoint);
		break;
	case "PUT":
		response = reqSpec.get(endPoint);
		break;
	case "DELETE":
		response = reqSpec.get(endPoint);
		break;
		default:
			break;
	}
		return response;
		}
	public ResponseBody getBody(Response response)
	{
		ResponseBody body = response.getBody();
		return body;
		}
	
	public String getBodyAsString(Response response) 
	{
		String asString = getBody(response).asString();
		return asString;
}
//	public String getBodyAsPrettyString() 
//	{
//	 String asPrettyString = response.getBody().asPrettyString();
//   return asPrettyString;
//	}
	public String getPrettyString(Response response) 
		{
			String asPrettyString = getBody(response).asPrettyString();
			System.out.println(asPrettyString);
			return asPrettyString;
	}
	public int getStatusCode(Response response) 
	{
		int statusCode = response.getStatusCode();
		return statusCode;

	}
	
}
