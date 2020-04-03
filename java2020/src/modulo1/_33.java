package modulo1;

import java.util.Scanner;

public class _33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.printf("Quantas horas? ");
		x = sc.nextInt();
		if(x < 12) {
			System.out.println("\nBom dia");
		}
		else if(12 <= x && x <= 18) {
			System.out.println("\nBoa tarde");
		}
		else {
		System.out.println("\nBoa noite");
		}
		
		sc.close();
	}

}
