package com.Bridgeblabz;

public class Dailyempwage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Dailywage");
		int IS_FULL_TIME = 1;
		int Wage_per_HR = 20;
		int empHrs, empwage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empwage = empHrs * Wage_per_HR;
		System.out.println(empwage);
	}
}    

	


