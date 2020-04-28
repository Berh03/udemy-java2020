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
		
		list.removeIf(Product :: staticProductPredicate);
		
		System.out.println("STATIC METHOD: ");
		for (Product p : list) {
			System.out.println(p);
		}
		
		// Non static method
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Tablet", 350.50));
		
		list.removeIf(Product :: nonStaticProductPredicate);
		
		System.out.println();
		
		System.out.println("NON STATIC METHOD: ");
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
