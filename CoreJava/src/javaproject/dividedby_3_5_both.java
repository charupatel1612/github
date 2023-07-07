package javaproject;

public class dividedby_3_5_both {
	
	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println("NUMBER WHICH IS DIVISABLE BY 3:" +i);
			}
		}
		System.out.println();
		for(i=1;i<=100;i++)
		{
			 if(i%5==0)
			{
				System.out.println("NUMBER WHICH IS DIVISABLE BY 5:" +i);
			}	
		}
		System.out.println();
		for(i=1;i<=100;i++)
		{
			
			 if(i%3==0 && i%5==0)
			{
				System.out.println("NUMBER WHICH IS DIVISABLE BY 3 AND 5:" +i);
			}
		}
	}

}
