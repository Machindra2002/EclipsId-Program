package Polymorphism;

public abstract class Bank {

	public abstract void AccountDetail();
	public abstract void Withdraw();
	public abstract void Deposit();
	public abstract void Balance_Inquery();
	
	public void BankDetail() {
		int b_CODE =123456;
		String B_NAME = "MAHARASHTRA";
		String Branch = "PUNE";
		System.out.println("Bank Code=" +b_CODE + "\nBank Name =" +B_NAME + "\nBranch=" +Branch);
		
	}
}
