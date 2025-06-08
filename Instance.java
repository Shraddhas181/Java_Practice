package net.java;

class Student{
	String name;
	int age;
	
	void display() {
		System.out.println("Name: "+ name + " , Age ");
	}
}

public class Instance {
	
	public static void main(String[]args) {
		Student s1= new Student();
		s1.name="Rahi";
		s1.age=17;
		
		Student s2= new Student	();
		s2.name="snehit";
		s2.age=23;
				
		s1.display();
		s2.display();

// OR operator
		int a=18;
		int b=20;
		
		System.out.println(a|b);
		
		for(int s=50;s<=100;s++) {
			if((s>=50 && s%2!=0) || (s>70 && s%2!=0)) {
				if(s%2!=0) {
					continue;
				}
				System.out.println(s);
			}
		}
			
		
		
	}
}

