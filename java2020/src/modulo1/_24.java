package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class _24 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String w;
		char x;
		double y;
		int z;
		w = sc.next();
		x = sc.next().charAt(0);
		y = sc.nextDouble();
		z = sc.nextInt();
		System.out.println("Dados digitados: ");
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
