package com.rays.exception.handling;

public class TestLogin {
	public static void main(String[] args) throws LoginNotFoundException {
		String login = "Abhishek";
		if (login != null && login == "Abhishek") {
			System.out.println("Abhishek login done");
		} else {
			throw new LoginNotFoundException();
		}
		System.out.println("login succefull");
	}
}
