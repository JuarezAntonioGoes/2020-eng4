package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Customer;

public class PrototypeStartApp {

	public static void main(String[] args) {
		List<String> emails = new ArrayList<>();
		emails.add("joao.pe.de.feijao@gmail.com");
		emails.add("joao.da.silva@gmail.com");
		
		Customer c1 = new Customer(34215484, "João", "99999999999",
			"Rua X nº 3 Bairro Y CEP: 3788876 Bairro Z", emails);
		
//		Customer c2 = new Customer(c.getTelefone(), c.getName(), c.getCpf(), c.getEndereco(), c.getEmail());
//		System.out.println(c2);
		
		Customer c2 = (Customer) c1.clone();
		c2.setName("Rodrigo");
		c2.getEmail().add("rodrigo@gmail.com");
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
}
