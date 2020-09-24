package br.edu.univas.main;

import br.edu.univas.vo.BankAccount;

public class BuilderStartApp {

	public static void main(String[] args) {
//		BankAccount account1 = new BankAccount(1234, "Juarez", "996", 600, 2.57);
		

		BankAccount account1 = new BankAccount.Builder()
				.withAccountNumber(1234)
				.withOwner("Juarez")
				.withBranch("996")
				.withBalance(600)
				.withInterestRate(2.57)
				.build();
		
		System.out.println("Conta 1:");
		System.out.println(account1.getOwner());
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getBranch());
		System.out.println(account1.getBalance());
		System.out.println(account1.getInterestRate());
	}
	
}
