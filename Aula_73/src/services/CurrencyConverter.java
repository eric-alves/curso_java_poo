package services;

public class CurrencyConverter {
	public void converter(Float price, Float quant) {
		System.out.printf("Amount to be paid in reais = %.2f", price * quant * 1.06);
	}
}
