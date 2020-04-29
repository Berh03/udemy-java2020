package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		// Static method
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(Product::staticPriceUpdate);

		System.out.println("STATIC METHOD: ");
		list.forEach(System.out::println);

		// Non static method

		list.forEach(Product::nonStaticPriceUpdate);

		System.out.println();
		System.out.println("NON STATIC METHOD: ");
		list.forEach(System.out::println);

	}

}
