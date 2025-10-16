package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.LimiteSaqueException;

public class ProgramaPrincipal {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta ");

				System.out.print("Numero da conta: ");
				int numeroConta = sc.nextInt();
				sc.nextLine();
			
				System.out.print("Nome titular: ");
				String nomeTitular = sc.nextLine();
				
				System.out.print("Saldo inicial: ");
				Double saldoInicial = sc.nextDouble();
				
				System.out.print("Limite de Saque: ");
				Double limiteSaque = sc.nextDouble();
				
				Conta conta = new Conta(numeroConta, nomeTitular, saldoInicial, limiteSaque);
				
				System.out.println();
				
				System.out.print("Informe a quantidade que deseja sacar: ");
				Double saque = sc.nextDouble();
				
				
				try {
					
				  conta.saque(saque);
				  System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
	
				}
				
				catch (LimiteSaqueException e) {
					
					System.out.println("Erro: " + e.getMessage());
				}
				
				sc.close();
		}
}
	
