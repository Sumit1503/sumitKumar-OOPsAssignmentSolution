package in.oops_assignment.driver;

import in.oops_assignment.models.AdminDepartment;
import in.oops_assignment.models.HrDepartment;
import in.oops_assignment.models.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		// creating objects of Admin, Hr and Tech department respectively		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		
		// showing functionalities of AdminDepartment
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayHoliday());
		
		// to make a line gap
		System.out.println();
		
		
		// showing functionalities of HrDepartment
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayHoliday());
		
		// to make a line gap
		System.out.println();
		

		// showing functionalities of TechDepartment
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayHoliday());


	}

}
