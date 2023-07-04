package Interrface;

public class Xyz implements I1, I2 {
	
	@Override
	public void Add() {
		int a = 10 , b=20,c=a + b;
		System.out.println("Addition =" +c);
	}
	
	@Override
	public void Sub() {
		int a = 10 , b=20,c=a - b;
		System.out.println("Substraction =" +c);
	}
	
	@Override
	public void Mult() {
		int a = 10 , b=20,c=a * b;
		System.out.println("Multiplication =" +c);
	}
	
	public void Display() {
		System.out.println("Interface Class Completed..");
	}

}
