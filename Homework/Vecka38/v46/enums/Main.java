package enums;

public class Main {

	public static void main (String[] args) {
		
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
		// H�r �r den f�rsta metoden d�r jag r�knar ut  hur m�nga grader celcius om det �r 50 grader fahrenheit
	}

	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		return celsius;
		// H�r �r min andra metod d�r jag r�knar ut hur m�nga grader celcius det �r om det �r -273.15 grader kelvin
	}

}

		

	
		

	
