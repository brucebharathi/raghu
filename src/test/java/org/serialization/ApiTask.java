package org.serialization;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;



public class ApiTask extends BaseClass{
	@Test
	public void Otp() {
		List<Header> headers=new ArrayList<Header>();
		Header h1=new Header("accept","application/json");
		Header h2=new Header("content-Type","application/json");
		headers.add(h1);
		headers.add(h2);
		Headers h = new Headers(headers);
		headers(h);
		Otp_pojo op=new Otp_pojo("6383224124","bharathistalin31@gmail.com");
		body(op);
		Response response = methodType("POST","https://velsbusinessclub.vlcare.com/api/sendOtp");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String prettyString=getPrettyString(response);
		System.out.println(prettyString);
	}

}
