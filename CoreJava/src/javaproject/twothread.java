package javaproject;

class test extends Thread
{
	public void run()
	{
		int i;
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.println("Thread of test class");
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class test2 extends Thread
{
	public void run()
	{
		int i;
		try 
		{
			for(i=0;i<5;i++)
			{
				System.out.println("Thread of test2 class");
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


public class twothread {
	
	public static void main(String[] args) {
		
		test t1=new test();
		test2 t2=new test2();
		t1.start();
		t2.start();
		
	}

	
}
