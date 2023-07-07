package javaproject;

class thread1 implements Runnable
{

	public void run() {
		
		int i;
		try 
		{
			
			for(i=0;i<5;i++)
			{
				System.out.println("Thread1 Is Running");
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
class thread2 implements Runnable
{

	
	public void run() {
		
		int i;
		try 
		{
			
			for(i=0;i<5;i++)
			{
				System.out.println("Thread2 Is Running");
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}

public class twothreadbyrunnable {
	
	public static void main(String[] args) {
		
		thread1 bullet=new thread1();
		Thread gun=new Thread(bullet);
		thread2 bullet2=new thread2();
		Thread gun2=new Thread(bullet2);
		gun.start();
		gun2.start();
	}

}
