package br.edu.univas.vo;

public class Onions extends PizzaDecorator {

	public Onions() {
		super();
	}
	
	public Onions(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String description() {
		if (pizza == null) {
			return "Cebola";
		}
		return pizza.description() + " Cebola";
	}

	@Override
	public double price() {
		if (pizza == null) {
			return 1.5;
		}
		return pizza.price() + 1.5;
	}
}
