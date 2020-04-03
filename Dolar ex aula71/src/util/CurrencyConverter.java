package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double Converter(double dollar, double buy) {
		return dollar*buy * (1.0 + IOF);
	}
}
