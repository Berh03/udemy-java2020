package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Declared lambda expression
		double factor = 1.1;
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);

		list.forEach(cons);

		System.out.println("DECLARED LAMBDA EXPRESSION");
		list.forEach(System.out::println);

		// inline lambda expression
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		System.out.println();

		System.out.println("INLINE LAMBDA EXPRESSION");
		list.forEach(System.out::println);
	}

}
