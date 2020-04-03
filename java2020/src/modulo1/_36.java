package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class _36 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int minutos=0,plano;
	double total=50;
	System.out.print("Você possui nosso plano básico: 1 para sim / 2 para não ");
	plano = sc.nextInt();
	if(plano == 1) {
		System.out.print("Quantos minutos você consumiu: ");
		minutos = sc.nextInt();
	}else {
		System.out.println("\nEntão você não gostaria de assina-lo por apenas R$50,00 \nvocê tem direito a 100 minutos de ligações e a cada minuto \nexcedido custa R$2,00");
	}
	if(plano == 1 && minutos < 100) {
		System.out.printf("Valor a pagar: R$%.2f",total);
	}else if(plano == 1 && minutos > 100) {
		total += (2*(minutos-100));
		System.out.printf("Valor a pagar: R$%.2f",total);
	}
	
	sc.close();
	}

}
