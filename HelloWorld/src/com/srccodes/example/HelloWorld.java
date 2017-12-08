package com.srccodes.example;

public class HelloWorld {

	public static byte FIND_FLAG = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Javatips.net       ";
		str.trim();
		
		System.out.println(new Integer(10));
		
		HelloWorld.CALL_METHOD("hello");
		HelloWorld.CallHello();
	}

	public static void CALL_METHOD(String INPUT_PARAMETER) {
	    System.out.println(INPUT_PARAMETER);
	}

	public static void CallHello() {
	    System.out.println("Hello PMD World!");
	}
}
