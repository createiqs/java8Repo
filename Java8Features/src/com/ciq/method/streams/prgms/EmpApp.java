package com.ciq.method.streams.prgms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmpApp {

	public static void main(String[] args) {
		Department dept1 = new Department(100, "HR", "HYD_TS");
		Department dept2 = new Department(101, "SE", "PN_MH");
		Department dept3 = new Department(102, "TL", "CHE_TN");
		Department dept5 = new Department(104, "TL", "CHE_TN");
		Department dept4 = new Department(103, "SSE", "BAG_KA");

		Employee e1 = new Employee(200, "shan", 52000.00, dept2);
		Employee e2 = new Employee(201, "anil", 25000.00, dept2);
		Employee e3 = new Employee(203, "mohan", 35000.00, dept1);
		Employee e4 = new Employee(202, "sai", 55000.00, dept5);
		Employee e5 = new Employee(204, "vani", 45000.00, dept4);
		Employee e6 = new Employee(206, "ram", 47000.00, dept2);
		

		List<Employee> employees = List.of(e1, e2, e3, e4, e5,e6  );
		
	System.out.println( employees.stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary)).getMax());
		
//		List<Employee> emps=new ArrayList<>();
//		Employee e7 = new Employee(205, "akbar", 45000.00, dept3);
//		Employee e8 = new Employee(207, "amar", 47000.00, dept3);
//		emps.add(e7);
//		emps.add(e8);
//		employees.stream().
//		filter(p -> p.getDept().getDeptName().equalsIgnoreCase("tl") && p.getSalary()<50000.00)
//		.forEach(s -> System.out.println(s));
//		employees.stream()
		//.filter(ed-> ed.getSalary()>25000.00)
//		.forEach(emps::add);
		
//		System.out.println(emps);
		

	}

}
