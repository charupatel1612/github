package javaproject;

import java.util.Scanner;

public class try_catch2 {
	
	public static void main(String[] args) {
		
		
		
		try 
		{
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER A:");
			a=sc.nextInt();
			System.out.println("ENTER B:");
			b=sc.nextInt();
			c=a/b;
			System.out.println("ANS:" +c);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
