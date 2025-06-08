package net.java;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hello world");
		
		for(int i=1;i<=100;i++) 
		{
		   if((i>10 &&  i<20)||(i>40 && i<60) ) 
		   
		   {
			   if(i%2!=0) 
			   {
				   System.out.println("Inside if condition for checking % 2 operation");
			   
			   continue;
			   }
		   }
			
			System.out.println(i);
		}

	}

}




