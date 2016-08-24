package hackrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
//    	double d=10.5;
//    	System.out.println(Math.round(d));
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
     
      double tip=mealCost*(tipPercent)/100.0;
      double tax=mealCost*(taxPercent)/100.0;
      System.out.println(mealCost);
      System.out.println(tip);
      System.out.println(tax);
        	
        
      // cast the result of the rounding operation to an int and save it as totalCost 
      //int totalCost = (int) Math.round(/*numberToRoundHere*/); 
        double totalCost = (double) (mealCost+tip+tax);
        System.out.println(totalCost);
      int cost=(int) Math.round(totalCost);
        // Print your result
    System.out.println("The total meal cost is "+cost+" dollars.");
    
    }
}