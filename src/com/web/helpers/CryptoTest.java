package com.web.helpers;

import java.security.NoSuchAlgorithmException;

public class CryptoTest {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "abcdefg";
		String hashedPassword = Crypto.hashPassword(password);
		System.out.println("Password:" + hashedPassword);
		
		boolean result = Crypto.verifyHashedPassword(hashedPassword, password);
		System.out.println("Verify:" + result);
	}
}