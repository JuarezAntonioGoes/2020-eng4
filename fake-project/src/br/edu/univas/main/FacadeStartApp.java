package br.edu.univas.main;

import java.util.List;

import br.edu.univas.controller.Menu;
import br.edu.univas.controller.MenuImpl;

public class FacadeStartApp {
	
	public static void main(String[] args) {
//		VegetalMenu vegetalMenu = new VegetalMenu();
//		List<String> vegetables = vegetalMenu.getItems();
//		
//		System.out.println("Vegetables:");
//		vegetables.forEach(System.out::println);
//		
//		MeatMenu meatMenu = new MeatMenu();
//		List<String> meats = meatMenu.getItems();
//		
//		System.out.println("Meats");
//		meats.forEach(System.out::println);
		
		Menu menu = new MenuImpl();
		List<String> vegetables = menu.getVegetableItems();
		
		System.out.println("Vegetables:");
		vegetables.forEach(System.out::println);
		
		List<String> meats = menu.getMeatItems();
		System.out.println("Meats:");
		meats.forEach(System.out::println);
	}
	
}
