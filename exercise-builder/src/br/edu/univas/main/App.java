package br.edu.univas.main;

import br.edu.univas.vo.Vehicle;

public class App {

	public static void main(String[] args) {
		//Vehicle vehicle1 = new Vehicle("FIAT", "Palio ELX", "Prata", 4, 2017, 2016);
		Vehicle vehicle1 = new Vehicle.Builder()
				.withModel("Palio ELX")
				.withModelYear(2017)
				.withBrand("FIAT")
				.withColor("Prata")
				.withManufactureYear(2016)
				.withPort(4)
				.build();
		
		//Vehicle vehicle2 = new Vehicle("Volksvagen", "Gol", "Branco", 4, 2019, 2019);
		Vehicle vehicle2 = new Vehicle.Builder()
				.withModel("Gol")
				.withColor("Branco")
				.withModelYear(2019)
				.withBrand("Volksvagen")
				.withPort(4)
				.withManufactureYear(2019)
				.build();
		
		System.out.println("Veículo 1:");
		System.out.println(vehicle1);
		
		System.out.println("Veículo 2:");
		System.out.println(vehicle2);
	}
}
