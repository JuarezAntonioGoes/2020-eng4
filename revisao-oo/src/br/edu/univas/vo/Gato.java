package br.edu.univas.vo;

public class Gato extends Animal implements Pet {
	
	public void emitirSom() {
		System.out.println("Miau");
	}

	@Override
	public void brincar() {
		System.out.println("Playing...");
	}

}
