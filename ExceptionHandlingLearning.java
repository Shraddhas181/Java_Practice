package exception;

public class ExceptionHandlingLearning {

	
	
	public static void main(String[] args) {
		
		System.out.println();
		
		System.out.println();
		Level1 l1=new Level1();
		
		try
		{
		l1.methodlevel1("shraddha");
		
		}
		
		catch(NullPointerException e)
		{
			System.out.println(" catch of main method");
			
		}
		
		System.out.println(" last line in main method");
		
		
	}
}
