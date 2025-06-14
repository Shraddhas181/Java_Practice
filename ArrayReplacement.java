package net.java;

public class ArrayReplacement {
	
	// Multiple methods with same name but with the different parameters;
	
public static void main(String[]args) {
	
	int arr[]= {2,4,5,6,7,8};
	System.out.println("start");
	replacearry(arr);
}
public static void replacearry(int[]inputArray) {
	for(int i=0;i<inputArray.length;i++) {
		 inputArray[i]= inputArray[i]*3;
		 
	}
	for(int a=0;a<inputArray.length;a++) {
		System.out.println(inputArray[a]);
	}
	
}
}
