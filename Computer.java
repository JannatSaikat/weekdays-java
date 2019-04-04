package newpackage;

public class Computer {

	int year = 2019;
	String model;
	String disp = "newdis";
	static String keys = "56 Keys";
	
	public Computer() {
		
	}

	public Computer(int year) {
		this.year = year;
		System.out.println(year);
	}
	
}
