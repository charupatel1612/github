package javaproject;

import java.util.Scanner;

public class compare_string {
	
	public static void main(String[] args) {
		String s;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST STRING:");
		s=sc.next();
		System.out.println("ENTER SECOND STRING:");
		s1=sc.next();
		
		if(s.equals(s1))
		{
			System.out.println("IS STRING " +s+ " AND STRING " +s1+ " BOTH SAME? : TRUE");
		}
		else
		{
			System.out.println("IS STRING " +s+ " AND STRING " +s1+ " BOTH SAME? : FLASE");
		}
		
	}

}
