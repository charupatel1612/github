package javaproject;

public class multi_try_catch {
	
	public static void main(String[] args) {
		
		try 
		{
			int a=100,b=0,c,arr;
			c=a/b;
			System.out.println(c);
			
		} 
			catch (ArithmeticException e)
			{
				System.out.println(e);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		
		
	}

} 
