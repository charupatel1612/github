package javaproject;

class shape1
{
	void shape()
	{
		System.out.println("THIS IS SHAPE.");
	}
}
class Rectangle extends shape1
{
	void rec()
	{
		System.out.println("This Is Rectangular Shape.");
	}
}
class Circle extends shape1
{
	void cir()
	{
		System.out.println("This Is Circular Shape.");
	}
}
class Square extends Rectangle
{
	void Squ()
	{
		System.out.println("Square Is A Rectangle.");
	}
}
public class shape_rec_cir_squar {
	
	public static void main(String[] args) {
		
		Square s=new Square();
		s.Squ();
		s.shape();
		s.rec();
		
	}

}
