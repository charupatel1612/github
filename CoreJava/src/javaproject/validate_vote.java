package javaproject;

import java.util.Scanner;

public class validate_vote {
	
	public static void validate(int age) 	
	{
		if(age<18)
		{
			throw new ArithmeticException("NOT ELIGIBLE FOR VOTE");
		}
		else
		{
			System.out.println("ELIGIBLE FOR VOTE");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE:");
		int age=sc.nextInt();
		validate(age);
	}

}
