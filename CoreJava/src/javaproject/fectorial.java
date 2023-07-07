package javaproject;

import java.util.Scanner;

public class fectorial {
	
	public static void main(String[] args) {
		
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +n+ " is:: " +fact);
		
		
	}

}
