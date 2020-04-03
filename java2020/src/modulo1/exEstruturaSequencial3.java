package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1,num2,num3,num4,diferenca;
		System.out.print("Dígite um número: ");
		num1 = sc.nextDouble();
		System.out.printf("\nDígite outro número: ");
		num2 = sc.nextDouble();
		System.out.print("\nDígite um número: ");
		num3 = sc.nextDouble();
		System.out.printf("\nDígite outro número: ");
		num4 = sc.nextDouble();

		diferenca=(num1*num2-num3*num4);
		System.out.printf("\nA diferença entre o produto números %.2f e %.2f e o produto dos números %.2f e %.2f é %.2f", num1, num2, num3, num4, diferenca);
		
		sc.close();
	}

}
