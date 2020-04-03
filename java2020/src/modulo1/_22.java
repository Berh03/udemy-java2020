package modulo1;
import java.util.Locale;
public class _22 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int x = 0;
		double y = 10.157658;
		
		String nome = "Kakau";
		int idade = 15;
		double renda = 1499.99;
		
		System.out.println(x);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		System.out.println(y);
		System.out.println("x= "+x+"\ny= "+y);
		
		System.out.println("");
		
		System.out.printf("%s tem %d anos e ganha %.2f", nome, idade, renda);
	}

}
