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
	
	public static double kineticEnergy (double mass , double velocity ) {
		
		double kineticEnergy = (mass * Math.pow(velocity, 2 )) / 2;
		return kineticEnergy ;
		//Här är min femte medod som räknar ut den kinetiska energin för ett föremål med en hastighet
	}
	
	public static double potentialEnergy (double mass , double height) {
		
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		//Här är min sjätte metod där jag räkanar ut den potensiella energin för ett föremål
	}
	
	public static double fallSpeed (double height) {
		
		double fallSpeed = Math.sqrt(2 * g_swe * height);
		return fallSpeed;
		//Här är min sjunde metod där jag räkar ut hastigheten på ett fallande objekt
	}
	
	public static double delta (double first, double last) {
		
		double delta = (last - first);
		return delta;
		//Här är min åttånde metod där jag räknar ut det andra värdet minus det första
	}
	
	public static double volumeToMass (GasTable gas, double volume ) {
		
		double airdensity = gas.density * volume;
		return airdensity ;
		//Här är min nionde metod där jag räknar ut massan 
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		
		double massdensity = solid.density * volume;
		return massdensity;
		//Här har jag min tionde metod som räknar ut vikten från volymne och densiteten
	}
	
	public static double svtVelocity(double distance, double time) {
		
		double speed = distance / time;
		return speed;
		//Här är min elfte metod som räknar ut medelhastigheten
	}
	
	public static double svtDistance(double velocity, double time) {
		
		double distance = velocity * time;
		return distance;
		//Här är min tolfte metod som räknar ut sträckan från hastigheten och tiden
	}
	
	public static double svtTime(double velocity, double time) {
		
		double Time = velocity / time;
		return Time;
		// Metod nr 13 som räknar ut tiden från hasighet och sträcka
	}
	
	public static double work(double force, double distance) {
		
		double workAmount = force * distance;
		return workAmount;
		//16 de metoden som räknar ut storlekten på jobbet som utförs
	}
	
	public static double  heat(SolidTable solid, double mass, double deltaT) {
		
		double temp = solid.heatCapacity* mass * deltaT;
		return temp;
		// 17de metoden räknar ut temperaturen på ett föremål
	}
	
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		
		double flame = fluid.heatCapacity* mass * deltaT;
		return flame;
		//18de metoden som räknar ut mängden erergi som behövs för att värma ett föremål
	}
	
	public static double  heat(GasTable gas, double mass, double deltaT) {
		
		double burn = gas.heatCapacity * mass * deltaT;
		return burn; 
		//19de metoden som räknar ut hur mycket energi som krävs för att värma en massa till
	}
	
	public static double velocityToHeight(double velocity) {
		
		double height = (Math.pow(Math.sin(1.570796),2 )* Math.pow(velocity, 2))/ (2*g_swe);
		return height;
		//20de metoden som räknar ut hur snabbt ett föremål kommer att färdas från en höj neråt
	}
}



		

	
		

	
