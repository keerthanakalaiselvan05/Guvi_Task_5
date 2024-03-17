package com.guvi.task5.localdate;
import java.time.LocalDate;
import java.time.Period;
public class Localdate {

	public static void main(String[] args) {

		//obtains an instance of LocalDate from a year, month and date  
		LocalDate dob = LocalDate.of(2001, 9, 02);  
		//Getting the current date   
		LocalDate curDate = LocalDate.now();  
		//calculates the difference between two dates  
		Period period = Period.between(dob, curDate);  
		System.out.println("Your age is : "+ period.getYears()+" years, "+period.getMonths()+" months, "+" and " +period.getDays()+" days ");;  

	}

}

/*
Output:

Your age is : 22 years, 6 months,  and 15 days 
*/