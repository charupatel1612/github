package javaproject;

abstract class shape
{
	abstract void rectanglearea(int length,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}
class Area extends shape
{
	final double PI=3.14;
	void rectanglearea(int length,int breadth)
	{
		System.out.println("AREA OF RECTANGLE:" + length*breadth);
	}
	void SquareArea(int side)
	{
		System.out.println("AREA OF SQUARE:" +side*side);
	}
	void CircleArea(int radius)
	{
		System.out.println("AREA OF CIRCLE:" +3.14*radius*radius);
	}
}

public class abstract_square_circle_rectangle {
	
	public static void main(String[] args) {
		
		Area a=new Area();
		a.rectanglearea(10,10);
		a.SquareArea(5);
		a.CircleArea(7);
	}

}
