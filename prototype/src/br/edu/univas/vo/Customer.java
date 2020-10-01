package br.edu.univas.vo;

import java.util.List;
import java.util.stream.Collectors;

public class Customer implements Prototype {

	private int telefone;
	private String name;
	private String cpf;
	private String endereco;
	private List<String> email;
	
	public Customer(int telefone, String name, String cpf, String endereco, List<String> email) {
		super();
		this.telefone = telefone;
		this.name = name;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Customer [telefone=" + telefone + ", name=" + name + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", email=" + email + "]";
	}
	
	@Override
	public Prototype clone() {
		return new Customer(this.telefone, this.name, this.cpf, this.endereco, this.email.stream().collect(Collectors.toList()));
	}	
	
}
