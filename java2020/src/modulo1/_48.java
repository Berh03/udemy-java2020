package modulo1;

import java.util.Scanner;

public class _48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0,N,x;
		System.out.print("D�gite a quantidade de vezes que deseja somar os numeros digitados futuramente: ");
		N=sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("\nD�gite um numero para ser somado: ");
			x=sc.nextInt();
			soma += x;
		}
		System.out.printf("\nSoma dos numetos digitados �: %d",soma);
		
		sc.close();
	}

}
