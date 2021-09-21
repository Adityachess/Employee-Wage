package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Programme");
		
		Random ran = new Random();
		int empCheck= ran.nextInt(2);
		System.out.println(empCheck);
		if(empCheck==0) {
			System.out.println("Employee is Present");
		}
		else {	
			System.out.println("Employee is Absent");
		}

	}

}
