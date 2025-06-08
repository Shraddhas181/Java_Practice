package net.java;

//to store multiple values of the same type in a single variable.

public class Array {
	public static void main(String[]args) {
	int[] marks= new int[3];
	marks[0]=97;
	marks[1]=98;
	marks[2]=95;
	//System.out.println(marks[0]);
	//System.out.println(marks[1]);
	//System.out.println(marks[2]);
	for(int i=0;i<3;i++) {
		System.out.println(marks[i]);
	}
	
//for-each loop
int[] numbers= {2,3,4,5};
for(int number:numbers)
{
	
System.out.println(number+" ");
}

int [] a= {6,7,8,9};

for(int i=0;i<=a.length;i++) {
	System.out.println(a[i]);
}

//We use **new** to create an object in memory — in this case, an array object.
int []x= new int[4];
x[0]=1;
x[1]=2;
x[2]=0;
x[3]=10;
 for(int s=0;s<=4;s++) 
 {
	 
	 System.out.println(x[s]);

	 
 }






	}
} 
