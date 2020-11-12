package br.edu.univas.controller;

import java.util.List;

public class MenuImpl implements Menu {
	
	private MeatMenu meat;
	private VegetalMenu vegetal;
	
	public MenuImpl() {
		meat = new MeatMenu();
		vegetal = new VegetalMenu();
	}

	@Override
	public List<String> getMeatItems() {
		return meat.getItems();
	}
	
	@Override
	public List<String> getVegetableItems() {
		return vegetal.getItems();
	}
	
}
