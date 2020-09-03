package br.edu.univas.dao.factory;

public class FactoryProvider {

	public static AbstractFactory getFactory(int option) {
		if (option == 1) {
			return new XmlFactory();
		} else if (option == 2) {
			return new RdbFactory();
		}
		return null;
	}
	
}
