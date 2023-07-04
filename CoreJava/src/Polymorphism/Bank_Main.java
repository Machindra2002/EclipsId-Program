package Polymorphism;

public class Bank_Main {

	public static void main(String[] args) {
	
		SavingAccount s = new SavingAccount();
//		System.out.println(s.balance);
		s.BankDetail();
		System.out.println("*******************");
		s.AccountDetail();
		System.out.println("*******************");
		s.Withdraw();
		System.out.println("*******************");
		s.Deposit();
//		s.Balance_Inquery();
		
	}

}