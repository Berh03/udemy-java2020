package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

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
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;

		list.removeIf(pred);

		System.out.println("DECLARED LAMBDA EXPRESSION");
		for (Product p : list) {
			System.out.println(p);
		}

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Tablet", 350.50));
		// inline lambda expression
		list.removeIf(p -> p.getPrice() >= min);

		System.out.println();
		
		System.out.println("INLINE LAMBDA EXPRESSION");
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
