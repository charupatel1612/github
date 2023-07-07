package javaproject;

import java.util.Scanner;

public class sumaverage {
	
	//int i,n=0;sum=0;
	public static void main(String[] args) {
		int i,n=0,sum=0;
		double avg;
		
			System.out.println("ENTER ANY FIVE NUMBER:");
			
		for(i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			//System.out.println("ENTER ANY FIVE NUMBER:");
			n=sc.nextInt();
			sum=n+sum;
			
		}
		avg=sum/5;
		System.out.println("SUM OF FIVE NUMBER IS: " +sum+ " AND AVERAGE IS:" +avg);
		
	}

}