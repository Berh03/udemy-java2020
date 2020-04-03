package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1,num2,soma;
		System.out.print("Dígite um número: ");
		num1 = sc.nextDouble();
		System.out.printf("\nDígite outro número: ");
		num2 = sc.nextDouble();
		soma=num1+num2;
		System.out.printf("\nA soma entre o número %.2f e o %.2f é %.2f", num1, num2, soma);
		
		sc.close();
	}

}
