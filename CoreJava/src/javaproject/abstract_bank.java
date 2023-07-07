package javaproject;

abstract class bank
{
	abstract void getbalance();
}
class A extends bank
{
	void getbalance()
	{
		System.out.println("Deposite $100");
	}
}
class B extends bank
{
	void getbalance()
	{
		System.out.println("Deposite $150");
	}
}
class C extends bank
{
	void getbalance() 
	{
		System.out.println("Deposite $200");
	}
}

public class abstract_bank {
	
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		C c=new C();
		a.getbalance();
		b.getbalance();
		c.getbalance();
	}

}
