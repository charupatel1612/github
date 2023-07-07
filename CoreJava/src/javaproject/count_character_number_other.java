	package javaproject;

import java.util.Scanner;

public class count_character_number_other {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("ENTER ANY STRING:");
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();//for convert string to character;
		int letter=0,space=0,other=0,number=0,i;
		
		for(i=0;i<str.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				
				space++;
			}
			else if(Character.isDigit(ch[i]))
			{
				
				number++;
			}
			else
			{
				
				other++;
			}
			
		}
		System.out.println("TOTAL LETTER ARE:" +letter);
		System.out.println("TOTAL SPACE ARE:" +space);
		System.out.println("TOTAL NUMBER ARE:" +number);
		System.out.println("OTHER ARE:" +other);
		
		
	}

}
