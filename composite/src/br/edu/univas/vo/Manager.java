package br.edu.univas.vo;

public class Manager implements Employee {

	private long id;
	private String name;
	
	public Manager(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("Manager: ID = " + this.id + " Name = " + this.name);
	}
}
