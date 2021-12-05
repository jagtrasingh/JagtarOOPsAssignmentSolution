package com.gl.oopsassignment.driver;

public class Main {

	public static void main(String[] args) {
		
		//Declaration of Object
		AdminDepartment objAdmin = new AdminDepartment();
		HRDepartment objHR = new HRDepartment();
		TechDepartment objTech = new TechDepartment();
		
		//Admin Department method calling
		System.out.println("Welcome to " + objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday());
		System.out.println();
		
		//HR Department method calling
		System.out.println("Welcome to " + objHR.departmentName());
		System.out.println(objHR.doActivity());
		System.out.println(objHR.getTodaysWork());
		System.out.println(objHR.getWorkDeadline());
		System.out.println(objHR.isTodayAHoliday());
		System.out.println();
		
		//HR Department method calling
		System.out.println("Welcome to " + objTech.departmentName());
		System.out.println(objTech.getTodaysWork());
		System.out.println(objTech.getWorkDeadline());
		System.out.println(objTech.getTechStackInformation());
		System.out.println(objTech.isTodayAHoliday());
	}

}
