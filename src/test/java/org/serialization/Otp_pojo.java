package org.serialization;

public class Otp_pojo {
	
private String email;
private String mobile_number;


public Otp_pojo(String email, String mobile_number) {
	super();
	this.email = email;
	this.mobile_number = mobile_number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile_number() {
	return mobile_number;
}
public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}
}
