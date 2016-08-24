package hackrank;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class Person {
	private int age;

	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		this.age = initialAge;
		if (initialAge> 0) {
			age=initialAge;
			}
		else{
			age = 0;
			System.out.println("Age is not valid, setting age to 0..");
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the
		//age=0;
		if (age<13){
			System.out.println("You are young.."+age);
			
			
		}
		else if(age>=13 && age<18){
			System.out.println("You are a teenager.."+age);
		}
		else System.out.println("You are old.."+age);
		// correct statement:
		//System.out.println(/* Insert correct print statement here */);
	}

	public void yearPasses() {
		// Increment this person's age.
		this.age=+1;

	}



public static void main (String args[]){
		Person person=new Person(4);
		person.amIOld();
		person.yearPasses();
	}
}