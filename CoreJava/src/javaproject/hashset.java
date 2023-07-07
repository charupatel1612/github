package javaproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashset {
	
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("Blue");
		set.add("Maron");
		set.add("Red");
		set.add("Black");
		set.add("White");
		
		System.out.println(set);
		System.out.println("\n");
		System.out.println("Append At The End:");
		set.add("Green");
		System.out.println(set);
		System.out.println("\n");
		Iterator itr=set.iterator();
		System.out.println("Iterat The ArrayList:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println("Number Of The Element:" +set.size());
		System.out.println("\n");
		
		System.out.println("Before Converting Into Array:"+set);
		System.out.print("After Coverting Into Array:");
		String[] arr=new String[set.size()];
		set.toArray(arr);
		for(String str:arr) {
			System.out.print(str+" ");
		}
		System.out.println("\n");
		System.out.println("Covert Hashset To ArrayList:");
		ArrayList<String> list=new ArrayList<String>(set);
		System.out.println(list);
		System.out.println("\n");
		
		HashSet<String> hm=new HashSet<String>();
		System.out.println("First HashSet:" +set);
		hm.add("Blue");
		hm.add("Maron");
		hm.add("White");
		hm.add("Yellow");
		System.out.println("Second HashSet:" +hm);
		set.retainAll(hm);
		System.out.println("The Element Which Are Same In Both Sets:"+set);
	}
	
	
	

}
