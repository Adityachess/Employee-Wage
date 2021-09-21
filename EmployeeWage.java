package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Programme");
		
		int wageperhr=20;
		int dailyhrs=8;
		
		Random ran = new Random();
		int empCheck= ran.nextInt(2);
		System.out.println(empCheck);
		if(empCheck==0) {
			System.out.println("Employee is Present");
			
			int dailywage= wageperhr * dailyhrs;
			
			System.out.println("Employee Daily wage = "+dailywage);

		}
		else {	
			System.out.println("Employee is Absent");
		}
		
		

	}

}
