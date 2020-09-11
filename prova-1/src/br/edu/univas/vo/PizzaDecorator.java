package br.edu.univas.vo;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza pizza;
	
	public PizzaDecorator() {
		super();
	}
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public abstract String description();

	public abstract double price();

}
