package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2,qntd1,qntd2;
		double preco1,preco2,total;
		String produto1,produto2;

		System.out.print("Dígite o código do primeiro produto: ");
		cod1 = sc.nextInt();
		System.out.print("\nDígite o nome do primeiro produto: ");
		produto1 = sc.next();
		System.out.printf("\nDígite o preço do primeiro produto: ");
		preco1 = sc.nextDouble();
		System.out.printf("\nDígite a quantidade do primeiro produto: ");
		qntd1 = sc.nextInt();
		System.out.print("\nDígite o código do segundo produto: ");
		cod2 = sc.nextInt();
		System.out.print("\nDígite o nome do segundo produto: ");
		produto2 = sc.next();
		System.out.printf("\nDígite o preço do segundo produto: ");
		preco2 = sc.nextDouble();
		System.out.printf("\nDígite a quantidade do segundo produto: ");
		qntd2 = sc.nextInt();
		total=(qntd1*preco1)+(qntd2*preco2);
		System.out.printf("\nCódigo: %d | Produto: %s | Quantidade: %d | Preço unitário: %.2f", cod1, produto1, qntd1, preco1);
		System.out.printf("\nCódigo: %d | Produto: %s | Quantidade: %d | Preço unitário: %.2f", cod2, produto2, qntd2, preco2);
		System.out.printf("\nTotal a pagar: %.2f", total);
		
		sc.close();
	}

}