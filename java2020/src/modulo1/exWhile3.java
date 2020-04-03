package modulo1;

import java.util.Scanner;

public class exWhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod=0, gasolina=0, alcool=0, disel=0;

		System.out.print("Posto de Gasolina \nCógigos ulilizados: \n1 -> Álcool \n2 -> Gasolina");
		System.out.println("\n3 -> Disel \n4 -> fim");
		System.out.print("Dígite o código de combustível que o cliente abasteceu: ");
		cod = sc.nextInt();
		while (cod != 4) {
			switch (cod) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				disel += 1;
				break;
			default:
				System.out.println("Código inválido");
				break;
			}
			System.out.print("Dígite o código: ");
			cod = sc.nextInt();
		}
		System.out.println("\nClientes que abasteceram: ");
		System.out.println("Álcool: " + alcool + "\nGasolina: " + gasolina);
		System.out.println("Disel: " + disel + "\nMUITO OBRIGADO!!!");

		sc.close();
	}

}
