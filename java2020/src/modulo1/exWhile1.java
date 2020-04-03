package modulo1;

import java.util.Scanner;

public class exWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha;
		
		System.out.print("Dígite o pin de segurança: ");
		senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.print("Tente novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

		sc.close();
	}

}
