package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

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

		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		System.out.println("STATIC METHOD: ");
		names.forEach(System.out::println);

		// Non static method

		List<String> namesNonStatic = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

		System.out.println();
		System.out.println("NON STATIC METHOD: ");
		namesNonStatic.forEach(System.out::println);

	}

}
