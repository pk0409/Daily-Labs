package com.capgemini.lab5;
import java.util.Scanner;
public class EmployeeTester {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EmployeeTester t = new EmployeeTester();

		try {
			System.out.println("Enter salary of employee");
			int salary = scanner.nextInt();
			if(salary<=300) {
				throw new EmployeeException("Salary can not be less than 300");
			}
			else {
				System.out.println("Salary accepted");
			}
		}catch(Exception e) {
			e.printStackTrace();
			//t.getMessage();
		}

	}

}
