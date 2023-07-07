package javaproject;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylist {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("pink");
		list.add("purple");
		list.add("blue");
		list.add("orange");
		list.add("black");
		list.add("red");
		list.add("purple");
		
		System.out.println("Arraylist Of Colour Print Here:");
		System.out.println(list);
		System.out.println("\n");
		//System.out.println("Insert Element At First Position:" + list.add(1,"maron"));
		System.out.println("Insert Element At Second Position:");
		list.add(2,"maron");
		System.out.println(list);
		System.out.println("\n");
		System.out.println("Retrive Elemenet:" +list.get(2));
		System.out.println("\n");
		System.out.println("Set New Element:" +list.set(1,"Green"));
		System.out.println(list);
		System.out.println("\n");
		System.out.println("Remove Element At Third Position:" +list.remove(3));
		System.out.println(list);
		System.out.println("\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Index Number For Searching An Element:");
		int a=sc.nextInt();
		System.out.println("Search Elemen:"+list.get(a));
		System.out.println("\n");
		//System.out.println("Sorting List:");
		//Collections.sort(list);
		//System.out.println(list);
		System.out.println("\n");
		
		
		System.out.println("Iterator Is Here:");
		
		Iterator itr=list.iterator();//from only first to last and you can not change elements
		while(itr.hasNext())//hasnext()checks that any elements are avalable or not in arraylist
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		System.out.println("Listiterator Is Here:");
		ListIterator litr=list.listIterator();
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}	
		
		System.out.println("\n");
		List<String> sub_list=list.subList(0,3);
		System.out.println("Extract A Portion In The ArrayList:" +sub_list);
		System.out.println("\n");
		
		ArrayList<String> Newlist=new ArrayList<String>();
		Newlist.add("pink");
		Newlist.add("purple");
		Newlist.add("blue");
		Newlist.add("orange");
		Newlist.add("white");
		
		
		System.out.println("Compare Two Arraylist:");
		ArrayList<String> compare=new ArrayList<String>();
		for(String e:list)
		
			 compare.add(Newlist.contains(e) ? "Yes" : "No");
			 System.out.println(compare);
			 
		System.out.println("\n");
		System.out.println("Arraylist Before Swap:");
		System.out.println(Newlist);
		Collections.swap(Newlist, 0, 4);
		System.out.println("Arraylist After Swap:");
		System.out.println(Newlist);
		System.out.println("\n");
		
		System.out.println("Join Two Arraylist:");
		ArrayList<String> Newjoin=new ArrayList<String>();
		Newjoin.add("Tops");
		Newjoin.add("Technology");
		
		ArrayList<String> join=new ArrayList<String>();
		join.addAll(Newlist);
		join.addAll(Newjoin);
		System.out.println("After Join Two Arraylist:" +join);
		System.out.println("\n");
		
		ArrayList<String> incsize=new ArrayList<String>(2);
		incsize.add("Infosys");
		incsize.add("HCLTech");
		System.out.println("Original ArrayList:"+incsize);
		incsize.ensureCapacity(4);
		incsize.add("Tata Consultancy Services");
		incsize.add("Tech Mahindra");
		System.out.println("New ArrayList After Increasing Size:"+incsize);
		System.out.println("\n");
		incsize.set(2,"Wipro");
		System.out.println("Replace second element with 'Wipro':" +incsize);
		System.out.println("\n");
		System.out.println("Print using index of an element:"+incsize.size());
		
	}

}
