package com.exceptionhandling;
//Exception handling -->

public class Example {
	
	public static void main(String[] args) {
		
		System.out.println("this is line 1st ");
		System.out.println("this is line 2st ");
		try {
			int a=10/0;
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("this is line 3st ");
		System.out.println("this is line 4st ");
	}

}
