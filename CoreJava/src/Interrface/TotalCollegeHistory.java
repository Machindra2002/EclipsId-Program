package Interrface;

public class TotalCollegeHistory extends SihagadCollege  implements College1, College2 {
	
	public void MII() {
		System.out.println("Total Student in MIT College is 2000");
	}
	public void MCA_Student() {
		System.out.println("Total MCA Student in MIT College is 200");
	}

	public void VIT() {
		System.out.println("Total Student in VIT College is 2500");
	}
	public void MCS_Student() {
		System.out.println("Total MCS Student in VIT College is 80");
	}

	public void MCA_MCS_Student() {
		System.out.println("Total MCA_MCS Student in Sighdad College is 300");
	}
	
	public void History() {
		System.out.println("Total college history completed");
	}
}
