package javaproject;

import java.util.Scanner;

public class nestedifelse{
	
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A:");
		a=sc.nextInt();
		System.out.println("ENTER B:");
		b=sc.nextInt();	
		System.out.println("ENTER C:");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
		
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
	}
}
