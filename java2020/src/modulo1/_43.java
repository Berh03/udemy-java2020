package modulo1;

import java.util.Scanner;

public class _43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("A soma dos n�meros digitados � "+soma);
		
		sc.close();
	}

}
