package enums;

public class Main {
	 
	static double G = (6.67408 * Math.pow(10, -11)) ;    //Gravitationskonstanten.
	static double R  = (8.3145) ; 						// Almänna gaskonstanten.
	static double p0 = (1000)  ; 						// lufttrycket vid havsytan.
	static double c = (2.99792458)  ; 					// Ljusets hastighet i vakum.
	static double g_swe = (9.82) ; 						//Tyngdaccelerationen för Sverige.

	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPreassure(FluidTable.WATER,10));
		System.out.println(pressureUnderWater(10));
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
		// Här är den första metoden där jag räknar ut  hur många grader celcius om det är 50 grader fahrenheit
	}

	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		return celsius;
		// Här är min andra metod där jag räknar ut hur många grader celcius det är om det är -273.15 grader kelvin
	}
	
	public static double fluidPreassure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density * 	g_swe * deep;
		return fluidPressure;
		// Här är min tredje metod där jag räknar ut trycket under vatten på 10 meters djup
	}
	
	public static double pressureUnderWater(double deep){
		double pressureUnderWater = FluidTable.WATER.density * g_swe * deep;
		return pressureUnderWater;
		// Här är min fjärde metod som räknar ut trycket under vattnet på 10 meters djup

	
	}

}

		

	
		

	
