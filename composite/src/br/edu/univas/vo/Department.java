package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {

	private String name;
	private List<Employee> employees;
	
	public Department(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}
	
	@Override
	public void printName() {
		System.out.println("Department: " + this.name);
		employees.forEach(Employee::printName);
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	public void remove(Employee employee) {
		this.employees.remove(employee);
	}
	
}
