package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double avg, sum = 0.0;
		
		System.out.print("Enter the number of heights you will insert: ");
		n = sc.nextInt();
		double[] vect = new double[n];
		for (int i=0; i<n;i++) {
			System.out.print("Enter the heigth: ");
			vect[i] = sc.nextDouble();
		}
		for (int i=0; i<n;i++) {
			sum += vect[i];
		}
		avg = sum/n;
		System.out.printf("The avarage of heigths is: %.2f",avg);
		
		sc.close();
	}

}
