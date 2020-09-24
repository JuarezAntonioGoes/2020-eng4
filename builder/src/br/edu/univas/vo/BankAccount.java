package br.edu.univas.vo;

public class BankAccount {

	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;
	
	private BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public static class Builder {
		
		private long accountNumber;
		private String owner;
		private String branch;
		private double balance;
		private double interestRate;
		
		public Builder withAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}
		
		public Builder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Builder withBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder withBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public Builder withInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(accountNumber, owner, 
					branch, balance, interestRate);
		}
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
