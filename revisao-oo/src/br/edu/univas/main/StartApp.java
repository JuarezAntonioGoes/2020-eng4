package br.edu.univas.main;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

public class StartApp {

	public static void main(String[] args) {		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setRaca("Shitzu");
		cachorro1.emitirSom();
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setRaca("Pastor Alemão");
		cachorro2.emitirSom();
		
		cachorro1 = null;
		System.gc();
		
		//cachorro1.emitirSom(); throws NullPointerException
		
		cachorro1 = cachorro2;
		
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();
		
		//Gato gato1 = new Animal(); -> not supported
		
	}
	
}
