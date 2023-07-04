package Polymorphism;

import java.util.Scanner;

public class SavingAccount extends Bank {
	
	int balance= 5000;
	int withdraw=0;
	int deposit=0;
	
	public void AccountDetail() {
		int Account_No = 23456789;
		String C_name = "Machindra";
		int IFSC_Code = 45678901;
		System.out.println("Account_Number=" + Account_No +"\nCustomer_Name=" +C_name + "\nIFSC_Code=" +IFSC_Code);
	}
	
	public void Withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Withdraw Ammount");
		int amount = sc.nextInt();	
		if(balance == 0 && balance < amount) {
			System.out.println("withdraw unsucessful" + balance + "left");
		}
		else {
			balance = balance - amount;
			System.out.println("Withdraw amount is=" +amount);
			System.out.println("Available Balance is=" + balance);
		}
	}
	
	public void Deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit Ammount");
		int amount = sc.nextInt();
		deposit =  balance + amount;
		System.out.println("Deposit = " +amount);
		System.out.println("Total Balance is=" +deposit);
	}
	
	public void Balance_Inquery() {
		
		System.out.println("Balance_Inquary is =" + balance);
	}
}
