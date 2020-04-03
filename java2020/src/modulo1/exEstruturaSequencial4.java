package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class exEstruturaSequencial4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod;
		double salario,hora,total;
		String nome;
		System.out.print("Dígite o número do funcionário: ");
		cod = sc.nextInt();
		System.out.printf("\nDígite o nome do funcionário: ");
		nome = sc.next();
		System.out.printf("\nDígite o valor recebido por hora: ");
		salario = sc.nextDouble();
		System.out.printf("\nDígite a quantidade de horas trabalhadas: ");
		hora = sc.nextDouble();
		total=salario*hora;
		System.out.printf("\nCódigo: %d\nNome: %s\nSalário: %.2f", cod, nome, total);
		
		sc.close();
	}

}