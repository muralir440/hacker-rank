package hackrank;

import java.util.Scanner;

public class DataType1 {

	public static void main (String args[]){
		System.out.println("Start");
		int i=4;
		double d=4.0;
		String s="HAckerRank ";
	
		//System.out.println(i);
		Scanner scan=new Scanner(System.in);
		//System.out.println(i);
 /* Declare second integer, double, and String variables. */

		int ii;
		double dd;
		String ss;
		 
/* Read and save an integer, double, and String to your variables.*/
		 ii=scan.nextInt();
		 dd=scan.nextDouble();
		 ss=scan.nextLine();
		String s2=scan.nextLine();
  /* Print the sum of both integer variables on a new line. */
		System.out.println(i+ii);
		System.out.println(d+dd);
		System.out.println(s+s2);
	}
}
