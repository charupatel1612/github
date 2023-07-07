package javaproject;

public class nested_try_catch {
	
	public static void main(String[] args) {
		
		
		try
		{
				try 
				{
					int a[]= {10,20,30};
					System.out.println(a[6]);
				}
				catch (ArrayIndexOutOfBoundsException e) 
				{
					System.out.println(e);
				}
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
