package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1,num2,num3,num4,diferenca;
		System.out.print("D�gite um n�mero: ");
		num1 = sc.nextDouble();
		System.out.printf("\nD�gite outro n�mero: ");
		num2 = sc.nextDouble();
		System.out.print("\nD�gite um n�mero: ");
		num3 = sc.nextDouble();
		System.out.printf("\nD�gite outro n�mero: ");
		num4 = sc.nextDouble();

		diferenca=(num1*num2-num3*num4);
		System.out.printf("\nA diferen�a entre o produto n�meros %.2f e %.2f e o produto dos n�meros %.2f e %.2f � %.2f", num1, num2, num3, num4, diferenca);
		
		sc.close();
	}

}
