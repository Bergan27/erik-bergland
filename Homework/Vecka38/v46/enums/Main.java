package enums;

public class Main {
	 
	static double G = (6.67408 * Math.pow(10, -11)) ;    //Gravitationskonstanten.
	static double R  = (8.3145) ; 						// Alm�nna gaskonstanten.
	static double p0 = (1000)  ; 						// lufttrycket vid havsytan.
	static double c = (2.99792458)  ; 					// Ljusets hastighet i vakum.
	static double g_swe = (9.82) ; 						//Tyngdaccelerationen f�r Sverige.

	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPreassure(FluidTable.WATER,10));
		System.out.println(pressureUnderWater(10));
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
	
	public static double fluidPreassure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density * 	g_swe * deep;
		return fluidPressure;
		// H�r �r min tredje metod d�r jag r�knar ut trycket under vatten p� 10 meters djup
	}
	
	public static double pressureUnderWater(double deep){
		double pressureUnderWater = FluidTable.WATER.density * g_swe * deep;
		return pressureUnderWater;
		// H�r �r min fj�rde metod som r�knar ut trycket under vattnet p� 10 meters djup

	
	}

}

		

	
		

	
