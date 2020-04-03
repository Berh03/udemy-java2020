package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double radius,c,v;
		
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		
		c = Calculator.circunference(radius);
		
		v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n",Calculator.PI);
		
		sc.close();
		
	}
	
}
