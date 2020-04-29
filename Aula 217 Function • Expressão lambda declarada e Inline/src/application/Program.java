package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

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
		Function<Product,String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList());

		System.out.println("DECLARED LAMBDA EXPRESSION");
		names.forEach(System.out::println);

		// inline lambda expression
		List<String> namesInlineLambda = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		System.out.println();

		System.out.println("INLINE LAMBDA EXPRESSION");
		namesInlineLambda.forEach(System.out::println);
	}

}
