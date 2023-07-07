package javaproject;

class NewThread extends Thread
{
	public void run()
	{
		Thread t;
		t=new Thread(this,"Child Thread");
		
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : " +i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
}

public class thread_extending_class {
	
	public static void main(String[] args) {
		
		NewThread m=new NewThread();
		m.start();
	}

}
