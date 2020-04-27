package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Bernardo");
		cookies.put("email", "Bernardo@gmail.com");
		cookies.put("phone", "(11)91547-1872");

		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		cookies.put("phone", "4807-1476");
		
		System.out.println();
		System.out.println("OVERWRITTEN PHONE COOKIE: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println();
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		System.out.println();
		System.out.println("Phone number: " + cookies.get("phone"));
		
		System.out.println();
		System.out.println("Size: " + cookies.size());
		
		cookies.remove("email");
		
		System.out.println();
		System.out.println("REMOVE EMAIL: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		System.out.println();
		System.out.println("E-mail: " + cookies.get("email"));
	}

}
