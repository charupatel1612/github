package javaproject;

class parent
{
	 void show()
	{
		System.out.println("THIS IS THE PARENT CLASS.");
		//System.out.println("METHOD OF PARENT CLASS BY OBJECT OF PARENT CLASS:");
	}
	
}
class child extends parent
{
	void show()
	{
		super.show();
		System.out.println("THIS IS THE CHILD CLASS.");
	}
	
}

public class parent_child {
	
	public static void main(String[] args) {
		
		parent p=new parent();
		System.out.println("METHOD OF PARENT CLASS BY OBJECT OF PARENT CLASS.");
		p.show();
		
		child c=new child();
		System.out.println("METHOD OF CHILD CLASS BY OBJECT OF CHILD CLASS.");
		c.show();
		
		System.out.println("METHOD OF PARENT CLASS BY OBJECT OF CHILD CLASS.");
		
		
		
		
	}

}
