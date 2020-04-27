package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(3.0));
		myCircles.add(new Circle(5.0));
		
		System.out.println("Total area myCircles: " + String.format("%.2f", totalArea(myCircles)));
		System.out.println("Total area myShapes: " + String.format("%.2f", totalArea(myShapes)));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}