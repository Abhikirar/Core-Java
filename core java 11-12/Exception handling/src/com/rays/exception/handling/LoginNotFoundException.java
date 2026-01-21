package com.rays.exception.handling;

public class LoginNotFoundException extends Exception {
	public LoginNotFoundException() {
		super("login unsuccefull");
	}
}
