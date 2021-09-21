package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Programme");
		
		int wageperhr=20;
		int parttimehrs=4;
		int dailyhrs=8;
		int fulltimewage= wageperhr * dailyhrs;
		int parttimewage=wageperhr * parttimehrs;
		
		Random ran = new Random();
		int empCheck= ran.nextInt(2);
		System.out.println(empCheck);
		if(empCheck==1) {
			System.out.println("Employee is Parttime ="+ parttimewage);
		}
		else
		System.out.println("Employee fulltime wage = "+fulltimewage);
		

	}

}
