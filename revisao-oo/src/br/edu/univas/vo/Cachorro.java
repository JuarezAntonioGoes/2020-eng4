package br.edu.univas.vo;

public class Cachorro extends Animal implements Pet {

	@Override
	public void emitirSom() {
		System.out.println("Au au");
	}

	@Override
	public void brincar() {
		System.out.println("Playing...");
	}
	
	
	
}
