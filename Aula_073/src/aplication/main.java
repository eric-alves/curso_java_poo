package aplication;

import java.util.Scanner;
import services.CurrencyConverter;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cvc = new CurrencyConverter();
		
		System.out.print("What is dollar price? ");
		Float price = sc.nextFloat();
		
		System.out.print("How many dollar will be bought? ");
		Float quant = sc.nextFloat();
		
		cvc.converter(price, quant);
		
		sc.close();
	}

}
