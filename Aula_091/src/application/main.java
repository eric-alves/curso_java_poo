package application;

import java.util.Scanner;

import entities.Estudante;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		String nome;
		String email;
		int quarto;
		int quant;
		
		System.out.print("How many rooms will be rented? ");
		quant = sc.nextInt();
		sc.nextLine();
		
		Estudante[] quartos = new Estudante[10];
		
		for (int i = 0; i < quant; i++) {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			quarto = sc.nextInt();
			sc.nextLine();
			
			quartos[quarto] = new Estudante(nome, email);
		}
		
		for (int i = 0; i < 10; i++) {
			if (quartos[i] != null) {
				System.out.println("Rent #" + i + "\n" 
								+ "Name: " + quartos[i].getNome() + "\n" 
								+ "Email: " + quartos[i].getEmail());
			}
		}
		
		sc.close();
	}

}
