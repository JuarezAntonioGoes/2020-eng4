package br.edu.univas.vo;

public class Developer implements Employee {

	private long id;
	private String name;
	
	public Developer(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("Developer: ID = " + this.id + " Name = " + this.name);
	}
}
