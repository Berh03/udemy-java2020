package modulo1;

import java.util.Scanner;

public class exWhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod=0, gasolina=0, alcool=0, disel=0;

		System.out.print("Posto de Gasolina \nC�gigos ulilizados: \n1 -> �lcool \n2 -> Gasolina");
		System.out.println("\n3 -> Disel \n4 -> fim");
		System.out.print("D�gite o c�digo de combust�vel que o cliente abasteceu: ");
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
				System.out.println("C�digo inv�lido");
				break;
			}
			System.out.print("D�gite o c�digo: ");
			cod = sc.nextInt();
		}
		System.out.println("\nClientes que abasteceram: ");
		System.out.println("�lcool: " + alcool + "\nGasolina: " + gasolina);
		System.out.println("Disel: " + disel + "\nMUITO OBRIGADO!!!");

		sc.close();
	}

}
