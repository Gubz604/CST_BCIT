package ca.bcit.comp1510.lab08;
import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1582
 * @author blink
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.  
        // throw exception if parameters are not a valid date
    	if (!isDateValid(theDay, theMonth, theYear)) {
    		throw new IllegalArgumentException("You done goofed up and your date is not valid bud!");
    	}
    	
    	day = theDay;
    	month = theMonth;
    	year = theYear;
    }
    
    public static boolean isMonthValid(int m) {
    	if (m >= 1 && m <= 12) return true;
    	else return false;
    }
    
    public static boolean isYearValid(int year) {
        if (year > 1582 && year < 2999) return true;
        else return false;
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        else if (year % 4 == 0 && year % 100 != 0) return true;
        else return false;
    }
    
    public static int daysInMonth(int month, boolean isLeapYear) {
        switch (month) {
        case 1:
        	return 31;
        case 2:
        	if (isLeapYear) {
        		return 29;
        	} else {
        		return 28;
        	}
        case 3:
        	return 31;
        case 4: 
        	return 30;
        case 5:
        	return 31;
        case 6:
        	return 30;
        case 7:
        	return 31;
        case 8:
        	return 31;
        case 9:
        	return 30;
        case 10:
        	return 31;
        case 11:
        	return 30;
        case 12:
        	return 31;
        }
        return 31;
    }
    
    public static boolean isDateValid(int day, int month, int year) {
        if (day < 1 || day > daysInMonth(month, isLeapYear(year))) return false;
        else if (!isMonthValid(month)) return false;
        else if (!isYearValid(year)) return false;
        else return true;
    }
    
    public static void main(String[] args) { 
        //date read in from user
        int month, day, year;
        //true if parts of input from user is valid
        boolean monthValid, yearValid, dayValid;  
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        System.out.println("Enter the integer values for month, day, and year");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        //Use the methods to check to see if month is valid
        //Use the methods to check to see if year is valid
        //Use the methods to determine whether it's a leap year
        //Use the methods to determine number of days in month
        //Use the methods to see if day is valid
        //Use the methods to determine whether date is valid
        //   and print appropriate message
        //Create a Date object with month, day, year
        Date date1 = new Date(day, month, year);
    } 
} 
