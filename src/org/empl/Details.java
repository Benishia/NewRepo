package org.empl;

import java.util.Scanner;

public class Details {
	

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter Employee Name:");
		String empName=s.nextLine();
		System.out.println("Employee Name:"+empName);
		
		System.out.println("Enter employee id:");
		byte empId=s.nextByte();
		System.out.println("Employee Id:"+empId);
		
		System.out.println("Enter Employee EmailId:");
		String empEmail=s.next();
		System.out.println("Employee EmailId:"+empEmail);
		
		System.out.println("Enter Employee Phone number");
	    long empPhoneno=s.nextLong();
		System.out.println("Employee Phone number:"+empPhoneno);
		
		System.out.println("Enter Employee Salary:");
		double empSalary=s.nextDouble();
		System.out.println("Employee Salary:"+empSalary);
		
		System.out.println("Enter Employee Gender:");
		String empGender=s.next();
		System.out.println("Employee Gender:"+empGender);
		
		System.out.println("Enter Employee City:");
		String empCity=s.nextLine();
		System.out.println("Employee City:"+empCity);
		
		System.out.println("Enter Employee :");
		String empC=s.nextLine();
		System.out.println("Employee City:"+empC);
		
		s.close();
	}

}
