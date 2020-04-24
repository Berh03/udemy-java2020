package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Bernardo", "Berh.kuhl@gmail.com");
		Client c2 = new Client("Bernardo", "Alisson.argent@gmail.com");
		
		String s1 = new String("test");
		String s2 = new String("test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		
		
	}
}
