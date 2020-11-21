package com.capgemini.lab3;
import java.time.LocalDate;
import java.time.Period;
public class Excercise9 {
	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2012, 01, 01);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);
		System.out.println("Date:"+now);
		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
				diff.getYears(), diff.getMonths(), diff.getDays());
	}
}