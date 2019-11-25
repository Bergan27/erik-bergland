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
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.WATER,1,10));
		System.out.println(heat(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
	
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
		//H�r �r min nionde metod d�r jag r�knar ut massan 
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		
		double massdensity = solid.density * volume;
		return massdensity;
		//H�r har jag min tionde metod som r�knar ut vikten fr�n volymne och densiteten
	}
	
	public static double svtVelocity(double distance, double time) {
		
		double speed = distance / time;
		return speed;
		//H�r �r min elfte metod som r�knar ut medelhastigheten
	}
	
	public static double svtDistance(double velocity, double time) {
		
		double distance = velocity * time;
		return distance;
		//H�r �r min tolfte metod som r�knar ut str�ckan fr�n hastigheten och tiden
	}
	
	public static double svtTime(double velocity, double time) {
		
		double Time = velocity / time;
		return Time;
		// Metod nr 13 som r�knar ut tiden fr�n hasighet och str�cka
	}
	
	public static double work(double force, double distance) {
		
		double workAmount = force * distance;
		return workAmount;
		//16 de metoden som r�knar ut storlekten p� jobbet som utf�rs
	}
	
	public static double  heat(SolidTable solid, double mass, double deltaT) {
		
		double temp = solid.heatCapacity* mass * deltaT;
		return temp;
		// 17de metoden r�knar ut temperaturen p� ett f�rem�l
	}
	
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		
		double flame = fluid.heatCapacity* mass * deltaT;
		return flame;
		//18de metoden som r�knar ut m�ngden erergi som beh�vs f�r att v�rma ett f�rem�l
	}
	
	public static double  heat(GasTable gas, double mass, double deltaT) {
		
		double burn = gas.heatCapacity * mass * deltaT;
		return burn; 
		//19de metoden som r�knar ut hur mycket energi som kr�vs f�r att v�rma en massa till
	}
	
	public static double velocityToHeight(double velocity) {
		
		double height = (Math.pow(Math.sin(1.570796),2 )* Math.pow(velocity, 2))/ (2*g_swe);
		return height;
		//20de metoden som r�knar ut hur snabbt ett f�rem�l kommer att f�rdas fr�n en h�j ner�t
	}
}



		

	
		

	
