/*
 * Krishnakanth
 */

package com.learning;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
	
	public static void main(String[] args)  {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the month you were born(1 to 12):");
	int month = sc.nextInt();
	System.out.println("enter the date of month you were born");
	int date = sc.nextInt();
	System.out.println("enter the year you born(4 digits)");
	int year = sc.nextInt();
	System.out.println("your DOB is:"+month+"-"+date+"-"+year);
	
	Date d = new Date();
	SimpleDateFormat s=new SimpleDateFormat("mm-dd-yyyy");
	System.out.println("Today Date is: "+s.format(d));

	Calendar g = Calendar.getInstance();
	int years = g.get(Calendar.YEAR) - year;
	System.out.println("your age is: "+ years+" years ");
	
	 
	}
	
	
}