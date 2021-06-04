package com.learn.program;

import java.util.Scanner;
public class bridgetourch {
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
			int n,i,k;//The number of people is n, i, j, k is the loop control variable, the array stores the bridge time 
			int []a=new int [1024];
			int sum=0; //Over the total time of the bridge
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		a[i]=sc.nextInt();
		if(n==1)
		{
			System.out.println(a[1]);
			System.out.println(a[1]);
			
		}
		k=n;
		while(k>3)	// Total time 
		{
			if(a[1]+a[k-1]<2*a[2])
			sum+=a[k]+a[1]*2+a[k-1];
			else
			sum+=a[2]*2+a[1]+a[k];
			k-=2;
		}
		if(k==2)	//There are two members on the other side 
		sum+=a[2];
		else		//There are 3 members on the other side of the bank 
		sum+=a[1]+a[2]+a[3];
		System.out.println(sum);	// Output n people's bridge time
		k=n;
		while(k>3)	// Output specific program 
		{
			if(a[1]+a[k-1]<2*a[2])	// Output with a [1] pass flashlight program 
			{
				
				System.out.println(a[1]+" "+a[k]);
				System.out.println(a[1]);
				System.out.println(a[1]+" "+a[k-1]);
				System.out.println(a[1]);
			}
			else						// Output the use of a [1], a [2] to pass the flashlight
			{
			System.out.println(a[1]+" "+a[2]);
			System.out.println(a[1]);
			System.out.println(a[k]+" "+a[k-1]);
			System.out.println(a[2]);}
			k-=2;
		} 
		if(k==2)
		System.out.println(a[1]+" "+a[2]);
		else
		{
			System.out.println(a[1]+" "+a[3]);
			System.out.println(a[1]);
			System.out.println(a[1]+" "+a[2]);
		}
		
	}
	
}
