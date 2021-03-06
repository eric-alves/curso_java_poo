package aplication;

import java.util.Scanner;

import entities.Conta;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Conta cc;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		String opc = sc.nextLine();
		
		if (opc.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			float saldo = sc.nextFloat();
			
			cc = new Conta(numero, nome, saldo);
		} else {
			cc = new Conta(numero, nome);
		}
		System.out.println(cc);
		
		System.out.print("Enter a deposit value: ");
		float valor = sc.nextFloat();
		cc.depositar(valor);
		System.out.println(cc);
		
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextFloat();
		cc.sacar(valor);
		System.out.println(cc);
				
		sc.close();
	}

}
