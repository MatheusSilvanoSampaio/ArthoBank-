package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Balance;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Insira seu nome por favor: ");
		String name = sc.nextLine();
		System.out.printf("\n Bom dia %s, insira o numero da sua conta por favor: ", name);
		int account = sc.nextInt();
		System.out.println("\n valor do depósito: ");
		double deposit = sc.nextDouble();

		double saldo = 0;
		saldo += deposit;

		Balance balance = new Balance(name, account, saldo);

		System.out.println(balance.toStringAccount());

		System.out.println("\n Deseja fazer algum movimento na conta?: ");
		char check = sc.next().charAt(0);
		if (check == 'n') {

		} 
		else if (check == 's') {
			System.out.println("\n Digite d para fazer depósito e s para saque!");
			check = sc.next().charAt(0);
			if (check == 'd') {
				System.out.println("Digite o valor do depósito: ");
				deposit = sc.nextDouble();
				balance.addDeposit(deposit);
			} 
			else if (check == 's') {
				System.out.println("Digite o valor do Saque: ");
				double withdraw = sc.nextDouble();
				balance.addWithdraw(withdraw);
			}
		}

		System.out.println("\n Dados atualizados: " + balance.toStringAccount());

		sc.close();
	}

}
