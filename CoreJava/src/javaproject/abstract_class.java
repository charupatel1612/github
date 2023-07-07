package javaproject;

abstract class parents
{
	abstract void message();
	
}
class sub1 extends parents
{
	 void message()
	{
		System.out.println("THIS IS FIRST SUBCLASS");
	}
}
class sub2 extends parents
{
	public void message()
	{
		System.out.println("THIS IS SECOND SUBCLASS");
	}
}

public class abstract_class {
	
	public static void main(String[] args) {
		
		sub1 s1=new sub1();
		s1.message();
		sub2 s2=new sub2();
		s2.message();
	}
	
}
