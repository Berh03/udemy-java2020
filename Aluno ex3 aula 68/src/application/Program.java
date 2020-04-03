package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Enter the student name: ");
		student.name = sc.nextLine();
		System.out.print("Enter the student fisrt grade: ");
		student.n1 = sc.nextDouble();
		System.out.print("Enter the student second grade: ");
		student.n2 = sc.nextDouble();
		System.out.print("Enter the student third grade: ");
		student.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n",student.total());
		
		if (student.total() >= 60) {
			System.out.println("PASS");	
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",student.finalPoints());
		}
		
		sc.close();
		
	}

}
