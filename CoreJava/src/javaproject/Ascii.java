package javaproject;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY CHARACTER:");
		ch=sc.next().charAt(0);
		int value=ch;
		System.out.println("ASCII VALUE OF " + ch + " IS:" + value);
		
	}
}
