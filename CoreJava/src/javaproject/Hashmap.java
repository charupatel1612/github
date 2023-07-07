package javaproject;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap hash=new HashMap();
		hash.put(101,"shyam");
		hash.put(102,"charu");
		hash.put(103,"shreena");
		hash.put(104,"neha");
		hash.put(105,"mishka");
		
		
		System.out.println("Print The Key And Value Both:" +hash);
		System.out.println("\n");
		System.out.println("Number Of Key And Value:" +hash.size());
		System.out.println("\n");
		if(hash.isEmpty()==true)
		{
			System.out.println("Yes It Is Empty");
		}
		else
		{
			System.out.println("No It Is Not Empty");
		}
		System.out.println("\n");
		System.out.println("Collection View Of The Values Is:"+hash.values());
		System.out.println("\n");
		if(hash.containsKey(106))
		{
			System.out.println("Yes,HashMap Contains This Key.");
		}
		else
		{
			System.out.println("No,HashMap Does Not Contains This Key.");
		}
	}

}
