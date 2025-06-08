package net.java;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int arr [] = {2,5,7,34,55,66,77,54};		
//		System.out.println("Printing 3rd number from array : "+arr[2]);
//		
//		System.out.println("Length of array : "+arr.length);
		
		int arr []=new int[10];

		System.out.println("Length of array : "+arr.length);		
		
//		for (int i=0;i<=arr.length-1;i++)
//		{
//			System.out.println(arr[i]);
//			
//		}
//		
	
		
		for(int i=0;i<=9;i++)
				{
			
			arr[i]=i;
				}
		
		arr[8]=50;

		
		int sum=0, evensum=0, oddsum=0;
		
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("value of array element at index "+i+"="+arr[i]);

			sum=sum+arr[i];
		 
				if(arr[i]%2==0) {
	
				}
				else {
					oddsum=oddsum+arr[i];
				}
				if(arr[i]%2!=0) {
					
				}
				else {
					evensum=evensum+arr[i];
				}
				
				
				
		}
		for(int i=9;i>=0;i--) {
			System.out.println(arr[i]);
		}
		System.out.println(sum);
		System.out.println("Sum of only even numbers from array :"+evensum);
		System.out.println("Sum of only odd numbers from array :"+oddsum);
		
		
		
		
	
		// Sum of only even numbers from array
		
		// Sum of only odd numbers from array		
		
		// print array in reverse order
		
		// print alternate element from array
		
		
		
		for (int i=0;i<=arr.length-1;i++)
		{
	
		if(i%2!=0) {
			System.out.println("alternate element from array :"+arr[i]);
		}
		
		}	
		
		
		System.out.println("even numbers are ::");		
		for (int i=0;i<=arr.length-1;i++)
		{
		
		if(arr[i]%2==0) {
			

			System.out.print(arr[i]+" ");
		}
		
		
		}	
		
		
		// replace array element with its double value.
		
		
		int elements []={3,6,4,2,12,24,44};
		
		// logic to double the elements
		for(int i=0;i<elements.length;i++ ) {
		 {
				elements[i]=elements[i]*2;
			}
		
		}
	
		for(int e:elements)
		{
			System.out.println("current element:"+ e);
		}

		
	}

}
