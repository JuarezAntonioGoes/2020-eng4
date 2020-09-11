package br.edu.univas.vo;

public class Cheese extends PizzaDecorator {

	public Cheese() {
		super();
	}
	
	public Cheese(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String description() {
		if (pizza == null) {
			return "Queijo";
		}
		return pizza.description() + " Queijo";
	}

	@Override
	public double price() {
		if (pizza == null) {
			return 2.5;
		}
		return pizza.price() + 2.5;
	}

}
