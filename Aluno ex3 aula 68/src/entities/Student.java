package entities;

public class Student {
	public String name;
	public double n1,n2,n3;
	
	public double total() {
		return n1 + n2 + n3;
	}
	
	public double finalPoints() {
		if (total() < 60) {
			return 60 - total(); 
		}else {
			return 0.0;
		}
	}
}
