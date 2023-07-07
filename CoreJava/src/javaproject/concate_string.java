package javaproject;

import java.util.Scanner;

public class concate_string {

	public static void main(String[] args) {
		
		String str1;
		String str2;
		String str3;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST STRING:");
		str1=sc.next();
		System.out.println("ENTER SECOND STRING:");
		str2=sc.next();
		
		str3=str1.concat(str2);
		System.out.println("CONCATE THE STRINGS: " + str3);
		
	}
}
