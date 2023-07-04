package nestedclass;

class Outer {
	public void Display() {
		System.out.println("I am outer class");
	}

	class Inner {
		public void Show() {
			System.out.println("I am inner class");
		}
	}
}

public class MainClass {

	public static void main(String[] args) {

		Outer o = new Outer();
		o.Display();
//		o.Show();  //directly no call

		Outer.Inner i = o.new Inner();
		i.Show();
//		i.Display(); // not allowed
		
	}

}
