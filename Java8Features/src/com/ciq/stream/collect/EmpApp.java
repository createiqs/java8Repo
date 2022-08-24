package com.ciq.stream.collect;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ciq.method.streams.prgms.Department;
import com.ciq.method.streams.prgms.Employee;

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

		List<Employee> employees = List.of(e1, e2, e3, e4, e5, e6);

//		employees.stream()
//		.sorted(Comparator.comparing(Employee::getName))
//		.forEach(s-> System.out.println(s));
		
		Map<String, Long> countOfEmps=employees.stream()
				.collect(Collectors.groupingBy(e-> e.getDept().getDeptName(), Collectors.counting()));
		System.out.println(countOfEmps);
		
		
		
		Map<String, Long> orderBynames = new LinkedHashMap<>();
		countOfEmps.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(fruit -> orderBynames.put(fruit.getKey(), fruit.getValue()));
		System.out.println("Emps  counted and ordered by type");
		System.out.println(orderBynames);
	}

}
