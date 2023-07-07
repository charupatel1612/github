package javaproject;

class area1
{
	void area(int length,int breadth)
	{
		System.out.println("AREA OF RECTANGLE IS: "+ length*breadth);
	}
	void area(int side)
	{
		System.out.println("AREA OF RECTANGLE IS: "+ side*side);
	}
}

public class area_of_rec_squar {
	
public static void main(String[] args) {
		
		area1 a=new area1();
		a.area(10,10);
		a.area(4);
	}

}
