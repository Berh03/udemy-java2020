package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio,pi=3.14159,area;
		System.out.print("D�gite o raio de um c�rculo: ");
		raio = sc.nextDouble();
		area=pi*(Math.pow(raio,raio));
		System.out.printf("\nA �rea do c�rculo � %.4f", area);
		
		sc.close();
	}

}
