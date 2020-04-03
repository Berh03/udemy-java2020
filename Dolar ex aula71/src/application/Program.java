package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollar,buy,total;
		
		System.out.print("What is the dollar price? ");
		dollar = sc.nextDouble();
		System.out.print("How many dollars will be bougth? ");
		buy = sc.nextDouble();
		
		total = CurrencyConverter.Converter(dollar, buy);
		
		System.out.printf("Amount to be  paid in reais: %.2f",total);
		
		sc.close();
	}

}
