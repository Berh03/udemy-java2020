package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(2503, "Guilherme", 500.0, 0.01));
		list.add(new BusinessAccount(2958, "Logan", 1000.0, 400.0));
		list.add(new SavingsAccount(1984, "Peter", 300.0, 0.01));
		list.add(new BusinessAccount(1867, "Finn", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n",sum);
		
		System.out.println();
		
		for (Account acc : list) {
			acc.deposit(10);
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(),acc.getBalance());
		}
	}

}
