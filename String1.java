package hackrank;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

		String A=scan.next();
		String B=scan.next();
	
		int sum=A.length()+B.length();
		System.out.println(sum);
		System.out.println(A.compareTo(B)>0?"Yes":"No");
	}

}
