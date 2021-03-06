package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id;
		String nome;
		float salario;
		int quant;
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		quant = sc.nextInt();
		sc.nextLine();
				
		for (int i = 0; i < quant; i++) {
			System.out.print("id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Salario: ");
			salario = sc.nextFloat();
			sc.nextLine();
			
			Funcionario func = new Funcionario(id, nome, salario);
			funcionarios.add(func);
		}
		
		for (Funcionario f : funcionarios) {
			System.out.println(f.toString());
		}
		
		sc.close();
	}

}
