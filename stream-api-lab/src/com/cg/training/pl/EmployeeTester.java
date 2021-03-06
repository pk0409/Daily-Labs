package com.cg.training.pl;

import java.util.Map;

import com.cg.training.dao.EmployeeRepository;
import com.cg.training.service.EmployeeService;

public class EmployeeTester {
	private static EmployeeService service= new EmployeeService();
	
	public static void main(String[] args) {
		double totalSal= service.sumOfSalaries();
		System.out.println("Total salary= "+ totalSal);
		System.out.println("--------------------------------");
		Map<String,Long> map= service.getDepartments();	       
        map.forEach((dept, count) -> {
            System.out.println(dept + " -> " + count);
        });
        System.out.println("------------------------------");
        service.findSeniorMostEmp();
        System.out.println("-------------------------------");
        service.employeeServiceDuration();
        System.out.println("-------------------------------");
        service.listEmployeesWithoutDepartment().stream()
        .forEach(System.out::println);
        System.out.println("---------------------------");
        service.depWithoutEmp();
        System.out.println("---------------------------");
        service.showHireDetails();
        System.out.println("-----------------------------");
        service.employeesStartingFriday()
        .stream()
        .forEach(System.out::println);
        System.out.println("\n\n----Salary Increased----");
		service.salaryHike();
        System.out.println("---------------------------");
        System.out.println("Find employees who didn�t report to anyone");
        service.getEmployeesWithoutManager()
        .stream().forEach(System.out::println);
        System.out.println("Sort by department Id");
        service.sortByDeptId().stream().forEach(System.out::println);
        System.out.println("accept first name and last name of manager to print name of all his/her subordinates.  ");
        service.getSubordinates("Steven", "King");
	
	}

}
