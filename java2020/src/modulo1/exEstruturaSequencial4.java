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
		System.out.print("D�gite o n�mero do funcion�rio: ");
		cod = sc.nextInt();
		System.out.printf("\nD�gite o nome do funcion�rio: ");
		nome = sc.next();
		System.out.printf("\nD�gite o valor recebido por hora: ");
		salario = sc.nextDouble();
		System.out.printf("\nD�gite a quantidade de horas trabalhadas: ");
		hora = sc.nextDouble();
		total=salario*hora;
		System.out.printf("\nC�digo: %d\nNome: %s\nSal�rio: %.2f", cod, nome, total);
		
		sc.close();
	}

}