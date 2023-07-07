package javaproject;

class Newthread implements Runnable
{
	Thread t;
	public Newthread()
	{
		t=new Thread(this,"Child Thread");
		t.setPriority(7);
		t.start();
	}
	public void run() {
		
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
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

public class thread_implement_runnable {
	
	public static void main(String[] args) {
		
		new Newthread();
		
	}

}



