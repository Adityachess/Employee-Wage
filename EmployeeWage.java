package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayspermnth = 20;
		int wageperhr = 20;
		int dailyhr = 8;
		int dailywage = wageperhr * dailyhr;

		System.out.println("Employee Daily Wage =" + dailywage);

		int monthlywage = dailywage * dayspermnth;

		System.out.println("Monthly Wage Of Employee is =" + monthlywage);
	}
}
