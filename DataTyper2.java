package hackrank;

import java.util.Scanner;

public class DataTyper2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           /**
            * declaring primitive data types with default values
            */
            int i = 4;
            double d=4.0;
            String s="WelCome ";
            /* 
             * created Scanner instance
             */
       
            Scanner scan=new Scanner(System.in);
   
            /*  reading input from system*/
            int ii=scan.nextInt();
            double dd=scan.nextDouble();
            scan.nextLine();
            String ss=scan.nextLine();
            scan.close();
            /** 
             * to print the values from scanner wtih default values 
             */
            
            System.out.println(i+ii);
            System.out.println(d+dd);
            System.out.println(s+ss);
	}

}
