package javaproject;

import java.util.Scanner;

class Print_Number
{
	int s,a;
	void printn(int x)
	{
		System.out.println("VALUE OF INTEGER NUMBER:" +x);
	}
	void printn(double x)
	{
		System.out.println("VALUE OF DOUBLE NUMBER:" +x);
	}
	void printn(float x)
	{
		System.out.println("VALUE OF DOUBLE NUMBER:" +x);
	}
	
}
public class print_various_number {

	public static void main(String[] args) {
		
		Print_Number p=new Print_Number();
		p.printn(10);
		p.printn(100.0);
		p.printn(10.10);
	}
}
