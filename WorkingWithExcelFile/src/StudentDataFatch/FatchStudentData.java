package StudentDataFatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FatchStudentData {

	void FindStudent() {
		try {
			File f = new File("E:\\student.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String str = "";

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter roll No");
			int rno = sc.nextInt();

			while ((str = br.readLine()) != null) {
				String[] data = str.split(";");
				String[] dt = str.split("=");
				int rn = Integer.parseInt(dt[1]);

				if (rn == rno) {
					System.out.println(data[1]);
					System.out.println(data[2]);
					System.out.println(data[3]);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void display() {
		String msg = "Roll No=4;Name=Machindra;Qualificaton=BCS;Percentage=81";
		String[] data = msg.split(";");
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		String[] dt = data[0].split("=");
		int rno = Integer.parseInt(dt[1]);
//		System.out.println(rno);

	}

	public static void main(String[] args) {

		FatchStudentData fsd = new FatchStudentData();
		fsd.FindStudent();
		fsd.display();
	}

}
