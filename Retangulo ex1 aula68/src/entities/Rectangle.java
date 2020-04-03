package entities;

public class Rectangle {
	public double width,heigth;
	
	public double area() {
		return width*heigth;
	}
	
	public double perimiter() {
		return width+heigth+width+heigth;
	}
	
	public double diagonal() {
		return Math.sqrt(width*width + heigth*heigth);
	}
}
