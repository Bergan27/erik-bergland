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
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(5,1));
		System.out.println(volumeToMass(GasTable.AIR,1));
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
	
	public static double kineticEnergy (double mass , double velocity ) {
		
		double kineticEnergy = (mass * Math.pow(velocity, 2 )) / 2;
		return kineticEnergy ;
		//H�r �r min femte medod som r�knar ut den kinetiska energin f�r ett f�rem�l med en hastighet
	}
	
	public static double potentialEnergy (double mass , double height) {
		
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		//H�r �r min sj�tte metod d�r jag r�kanar ut den potensiella energin f�r ett f�rem�l
	}
	
	public static double fallSpeed (double height) {
		
		double fallSpeed = Math.sqrt(2 * g_swe * height);
		return fallSpeed;
		//H�r �r min sjunde metod d�r jag r�kar ut hastigheten p� ett fallande objekt
	}
	
	public static double delta (double first, double last) {
		
		double delta = (last - first);
		return delta;
		//H�r �r min �tt�nde metod d�r jag r�knar ut det andra v�rdet minus det f�rsta
	}
	
	public static double volumeToMass (GasTable gas, double volume ) {
		
		double airdensity = gas.density * volume;
		return airdensity ;
	}
}

		

	
		

	
