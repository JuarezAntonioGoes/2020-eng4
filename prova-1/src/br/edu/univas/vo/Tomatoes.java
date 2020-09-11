package br.edu.univas.vo;

public class Tomatoes extends PizzaDecorator {

	public Tomatoes() {	
		super();
	}
	
	public Tomatoes(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String description() {
		if (pizza == null) {
			return "Tomate";
		}
		return pizza.description() + " Tomate";
	}

	@Override
	public double price() {
		if (pizza == null) {
			return 0.5;
		}
		return pizza.price() + 0.5;
	}
}
