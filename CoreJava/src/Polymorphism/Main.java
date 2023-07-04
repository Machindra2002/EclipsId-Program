package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		IT i = new IT();
		i.Display();
		i.StudentDetail();
		
		System.out.println("*********************");
		
		Machanical m = new Machanical();
		m.show();
		m.StudentDetail();
		
		System.out.println("*********************");
		
		Department d = new IT();
		d.StudentDetail();
		d.CollegeDetail();
//		d.display();		
//		d.show();
		
		
	}

}
