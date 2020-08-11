package br.edu.univas.main;

import br.edu.univas.adapter.MoveableAdapter;
import br.edu.univas.adapter.MoveableAdapterImpl;
import br.edu.univas.vo.Ferrari;
import br.edu.univas.vo.Moveable;

public class AdapterStartApp {

	public static void main(String[] args) {
		Moveable car1 = new Ferrari();
		
		System.out.println("Max Speed: " + car1.getMaxSpeed() + " MPH");
		
		MoveableAdapter adapter = new MoveableAdapterImpl(car1);
		
		System.out.println("Max Speed: " + adapter.getMaxSpeed() + " KM/H");
	}
	
}
