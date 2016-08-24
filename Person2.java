package hackrank;

public class Person2 {
    private int age;	
  
    public Person2(int initialAge) {
        if(initialAge < 0){ // initial age is invalid
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{ // set age to valid initial age
            this.age = initialAge;
        }
	}

	public void amIOld() {
  		// Set correct statement to print
        String result = "";
        if(age >= 18){
            result = "You are old.";
        }
        else if(age >=13){
            result = "You are a teenager.";
        }
        else{
            result = "You are young.";
        }
        System.out.println(result);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
	}
	public static void main (String args[]){
		Person2 person2=new Person2(4);
		person2.amIOld();
		person2.yearPasses();
	}
}

