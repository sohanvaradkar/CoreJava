package com.learn.exceptionhandling;

public class ReturnStatement
{
	
	
public static void main(String[] args) 
{
	System.out.println(retunCheck());
	//retunCheck();
}
public static int retunCheck()
{
	try
	{
		//int n=20/0;
		String s="SUPRABHA";
		String s1="SUPRABHA";
		
	return 0;
	}
	catch (ArithmeticException ae) {
		System.out.println(" ArithmeticException called ");
		return 2;
	}
	catch (NullPointerException e) {
		System.out.println("NullPointerException called ");
		return 10;
	}
	catch (Exception e) {
		System.out.println("catch called ");
		return 3;
	}
	/*
	 * finally { System.out.println("finally called"); return 4; }
	 */
	//return 1;
}
}
