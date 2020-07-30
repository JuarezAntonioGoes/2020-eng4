package br.edu.univas.vo;

public interface Pet {

	void brincar();
	
	default void correr() {
		System.out.println("Running...");
	}
	
}
