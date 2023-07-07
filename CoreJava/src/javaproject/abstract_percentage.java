package javaproject;

abstract class marks
{
	abstract void getpercentage();
}
class A1 extends marks
{
	public double Subject1,Subject2,Subject3,Subject4,sum,per;
	A1(int a, int b, int c)
	{
		Subject1=a;
		Subject2=b;
		Subject3=c; 
		System.out.println("MARKS OF A1 STUDENT:");
	}
	void getpercentage()
	{
		sum=Subject1+Subject2+Subject3;
		per=sum/300*100;
		System.out.println("PERCENTAGE OF A1:" +per);
	}
}
class B1 extends marks
{
	public double Subject1,Subject2,Subject3,Subject4,sum,per;
	B1(int a,int b,int c,int d)
	{
		Subject1=a;
		Subject2=b;
		Subject3=c; 
		Subject4=d;
		System.out.println("MARKS OF B1 STUDENT:");
	}
	void getpercentage()
	{
		sum=Subject1+Subject2+Subject3+Subject4;
		per=sum/400*100;
		System.out.println("PERCENTAGE OF B1:" +per);
		
	}
}

public class abstract_percentage {
	
	public static void main(String[] args) {
		
		A1 one=new A1(30,40,50);
		one.getpercentage();
		B1 two=new B1(30,40,50,70);
		two.getpercentage();
		
	}
}
