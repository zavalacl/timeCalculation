package timeCalculation;

import java.util.Calendar;

public class timeCalculation {
 
	public static void main(String args[]) {
 
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
 
		//Set two dates to calculate
		calendar1.set(2010, 20, 11);
		calendar2.set(2000, 20, 11);
 
		//Obtains those two dates in milliseconds
		long Date1 = calendar1.getTimeInMillis();
		long Date2 = calendar2.getTimeInMillis();
 
		//Subtract one from another
		long diff = (Date1 - Date2);
		//Time conversions
		long day = 1000 * 60 * 60 *24;
		long days = (diff/day) + 1;
		long months = (days/31) + 1;
		long years =  (months/12) +1;
 
		//Prints out difference between dates
		System.out.println("Difference in days : " + days + " days");
		System.out.println("Difference in months : " + months + " months");
		System.out.println("Difference in years : " + years + " years");
 
	}
 
}