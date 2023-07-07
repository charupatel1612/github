package javaproject;

import java.util.Scanner;

public class variable {
			
			public static void main(String[] args) 
			{
				int a,b,c;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter a:");
				a=sc.nextInt();
				System.out.print("Enter b:");
				b=sc.nextInt();
				c=a+b;
				System.out.println("Addition:" +c);
			
			}
}
