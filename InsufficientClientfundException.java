package com.exceptionhandling;

public class InsufficientClientfundException extends RuntimeException {
	
	private String message;
	
	
	public InsufficientClientfundException(String message){
		super(message);
	}
}

class Account{
	private int balance = 3000;
	
	public int balance() {
		return balance;
	}
	
	public void withdraw (int amount) {
		if(amount>balance) {
			throw new InsufficientClientfundException("Insufficient balance in Account");
		}
		balance = balance - amount;
	}
	
public static void main(String[] args) {
	
	Account account = new Account();
	System.out.println("Current balance is "+ account.balance);
	account.withdraw(2000);
	System.out.println("Current balance is "+ account.balance);
}
}
