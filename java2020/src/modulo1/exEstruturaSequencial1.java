package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1,num2,soma;
		System.out.print("D�gite um n�mero: ");
		num1 = sc.nextDouble();
		System.out.printf("\nD�gite outro n�mero: ");
		num2 = sc.nextDouble();
		soma=num1+num2;
		System.out.printf("\nA soma entre o n�mero %.2f e o %.2f � %.2f", num1, num2, soma);
		
		sc.close();
	}

}
