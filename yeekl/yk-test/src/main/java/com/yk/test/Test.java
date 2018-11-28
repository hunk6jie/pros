package com.yk.test;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;


public class Test {

	
	public static void main(String[] args) {
		String[] strArr = {"01", "02"};
		
//		Enumeration<?> arr = strArr;
	}
	
	
	public static void t1(HttpServletRequest request)
	{
		Enumeration<?> arr = request.getAttributeNames();
	}
}
