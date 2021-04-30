package com.learn.program;
// Java Program to print Fibonacci
// series in reverse order
import java.io.*;

class GFG {
	
	static void reverseFibonacci(int n)
	{
		int a[] = new int[n];
	
		// assigning first and second elements
		a[0] = 0;
		a[1] = 1;
	
		for (int i = 2; i < n; i++)
		{
	
			// storing sum in the
			// preceding location
			a[i] = a[i - 2] + a[i - 1];
			System.out.println(a[i]);
		}
	System.out.println("called");
		for (int i = n - 1; i >= 0; i--)
		{
	
			// printing array in
			// reverse order
			System.out.print(a[i] +" ");
		}
	}
	
	private static void displ(Integer s) {
		System.out.println("Object called");

	}
	private static void displ(String s) {
		System.out.println("string called");

	}
	// Driver function
	public static void main(String[] args)
	{
		int n = 5;
		//reverseFibonacci(n);
		displ(null);
	
	}
}

// This code is contributed by vt_m.
