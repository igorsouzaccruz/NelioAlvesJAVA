package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double converte(double dolar, double quant) {
		return (dolar * quant * IOF) +(dolar * quant);
	}
	
}
