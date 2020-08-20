package br.edu.univas.main;

import br.edu.univas.vo.Department;
import br.edu.univas.vo.Developer;
import br.edu.univas.vo.Employee;
import br.edu.univas.vo.Manager;

public class CompositeStartApp {

	public static void main(String[] args) {
		Employee manager = new Manager(1L, "Lucas");
		
		Employee developer1 = new Developer(20L, "Dênis");
		Employee developer2 = new Developer(21L, "Wellington");
		
		Department department2 = new Department("Test Applications");
		Employee manager2 = new Manager(2L, "Misael");
		
		Employee developer3 = new Developer(30L, "Juarez");
		Employee developer4 = new Developer(40L, "Jonanthan");
		
		Department department = new Department("Software-Development");
		department.addEmployee(manager);
		department.addEmployee(developer1);
		department.addEmployee(developer2);
		department.addEmployee(department2);
		department.addEmployee(manager2);
		department.addEmployee(developer3);
		department.addEmployee(developer4);
		
		department.printName();
		
	}
}
