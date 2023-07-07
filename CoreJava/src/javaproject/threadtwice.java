package javaproject;

class twice extends Thread
{

	@Override
	public void run() {
		
		System.out.println("Thread Is Running Two Times");
	}
	
}	

public class threadtwice {
	
	public static void main(String[] args) {
		
		twice t1=new twice();
		twice t2=new twice();
		t1.start();
		t2.start();
		
		
	}

}
