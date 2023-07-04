package nestedclass;

class ABC {
	public void Show1() {
		System.out.println("Abc Class");
	}

	class XYZ {
		public void Show2() {
			System.out.println("XYZ Class");
		}

		class PQR {
			public void Show3() {
				System.out.println("PQR Class");
			}
		}
	}
}

public class FourClass {

	public static void main(String[] args) {

		ABC a = new ABC();
		a.Show1();
//		a.Show2();
//		a.Show3();

		ABC.XYZ x = a.new XYZ();
		x.Show2();
//		x.Show3();
//		x.Show1();

		ABC.XYZ.PQR p = x.new PQR();
		p.Show3();
//		p.Show2();
//		p.Show1();

	}

}
