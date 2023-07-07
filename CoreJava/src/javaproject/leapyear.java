package javaproject;

import java.util.Scanner;

public class leapyear {
	  
	public static void main()
	{
		int y;
		//System.out.print("ENTER YEAR:");
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YEAR:");
		y=sc.nextInt();
		
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("YES,IT IS A LEAP YEAR.");
		}
		else
		{
			System.out.println("NO,IT IS NOT A LEAP YEAR.");
		}
		
		
		
	}
}
