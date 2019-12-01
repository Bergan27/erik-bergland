package enums;

public class Main {
	 
	static double G = (6.67408 * Math.pow(10, -11)) ;    //Gravitationskonstanten.
	static double R  = (8.3145) ; 						// Alm�nna gaskonstanten.
	static double p0 = (1000)  ; 						// lufttrycket vid havsytan.
	static double c = (2.99792458)  ; 					// Ljusets hastighet i vakum.
	static double g_swe = (9.82) ; 						//Tyngdaccelerationen f�r Sverige. 		
	
	// Egen fr�ga 1 / Hur m�nga newtonmeter (NM) motsvarar 5J (Joule)?
	// Egen fr�ga 2 / Hur m�nga N i vikt motsvarar 92kg?
	// Egen fr�ga 3 / Hur stor hastighet motsvarar 25m/s i km/h?
	
	public static void main(String [] args) {
		
		System.out.println(fahrenheitToCelsius(50));              //1
		System.out.println(kelvinToCelsius(0));                   //2
		System.out.println(fluidPreassure(FluidTable.WATER,10));  //3
		System.out.println(pressureUnderWater(10));               //4
		System.out.println(kineticEnergy(2,2));                   //5
		System.out.println(potentialEnergy(2,5));                 //6
		System.out.println(fallSpeed(2.5));                       //7
		System.out.println(delta(5,1));                           //8
		System.out.println(fMass(FluidTable.WATER,1));            //9
		System.out.println(volumeToMass(GasTable.AIR,1));         //10
		System.out.println(volumeToMass(SolidTable.IRON,1));      //11
		System.out.println(svtVelocity(10,5));                    //12
		System.out.println(svtDistance(10,5));                    //13
		System.out.println(svtTime(10,2));                        //14
		System.out.println(work(50,10));                          //15
		System.out.println(power(1000,2));                        //16
		System.out.println(heat(SolidTable.IRON,1,2));            //17
		System.out.println(heat(FluidTable.WATER,1,10));          //18
		System.out.println(heat(GasTable.AIR,1,1));               //19
		System.out.println(velocityToHeight(9.82));               //20
		System.out.println(volumeToMass(SolidTable.IRON,6));      //Fr�ga 1
		System.out.println(svtDistance(2.7,3000));                //Fr�ga 2
		System.out.println(heat(FluidTable.WATER,4,78));          //Fr�ga 3
		System.out.println(fluidPreassure(FluidTable.WATER,75));  //Fr�ga 4
		System.out.println(velocityToHeight(16.67));              //Fr�ga 5
		System.out.println(power(work(force(735, acceleration     //Fr�ga 6
			(kMpHConvert(100),4.8)),distance(4.8, acceleration
			(kMpHConvert(100),4.8))), 4.8));
		System.out.println(bounceCount(12, 1));					  //Fr�ga 7
		System.out.println(joule(5));
		System.out.println(newton(92));
		System.out.println(haste(25));
		System.out.println(mechanicalEnergy(27,42));
		System.out.println(brakeDistance(0.3,100));
	}
	

	/**
	 * 
	 * @param fahrenheit = A form of measuring degrees or heat/cold 
	 * @return
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
		// 1 En metod som g�r om grader fahrenheit till grader celcius.
	}
	/**
	 * 
	 * @param kelvin = A form of measuring degrees or heat/cold 
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin) {
		
		double celsius = (kelvin - 273.15);
		return celsius;
		// 2 En metod som g�r om grader kelvin till grader celcius.
	}
	/**
	 * 
	 * @param fluid = The specific fluid and its capabilities 
	 * @param deep = The depth of the measuring in meters (M)
	 * @return
	 */
	public static double fluidPreassure(FluidTable fluid, double deep) {
		
		double fluidPressure = fluid.density * 	g_swe * deep;
		return fluidPressure;
		// 3 En metod som r�knar ut v�tsketrycket i en v�tska vid ett visst djup.
	}
	/**
	 * 
	 * @param deep = The depth of the measuring in meters (M)
	 * @return
	 */
	public static double pressureUnderWater(double deep){
		
		double pressureUnderWater = FluidTable.WATER.density * g_swe * deep;
		return pressureUnderWater;
		// 4 En metod som r�knar ut v�tsketrycket i vatten vid ett visst djup.
	}
	/**
	 * 
	 * @param mass = The mass off the object
	 * @param velocity  = The speed of the object measured in (km/h)
	 * @return
	 */
	public static double kineticEnergy (double mass , double velocity ) {
		
		double kineticEnergy = (mass * Math.pow(velocity, 2 )) / 2;
		return kineticEnergy ;
		//5 En metod som r�knar ut kinetisk energi med hj�lp av massa och hastighet.
	}
	/**
	 * 
	 * @param mass = The mass off the object
	 * @param height = The height of the measuring in meters (M)
	 * @return
	 */
	public static double potentialEnergy (double mass , double height) {
		
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		//6 En metod som r�knar ut potentiell energi med hj�lp av massa och h�jd.
	}
	/**
	 * 
	 * @param height = The height of the measuring in meters (M)
	 * @return
	 */
	public static double fallSpeed (double height) {
		
		double fallSpeed = Math.sqrt(2 * g_swe * height);
		return fallSpeed;
		//7 En metod som r�knar ut hur h�g hastighet man kommer upp i som man sl�pper ett f�rem�l fr�n en viss h�jd.
	}
	/**
	 * 
	 * @param first = The first value 
	 * @param last = The second value 
	 * @return
	 */
	public static double delta (double first, double last) {
		
		double delta = (last - first);
		return delta;
		//8 En metod som r�knar ut skillnad mellan tv� givna v�rden.
	}
	/**
	 * 
	 * @param fluid = The fluid
	 * @param volume = The volume
	 * @return
	 */
	
	public static double fMass (FluidTable fluid, double volume) {
		
		double fMass = fluid.density* volume;
		return fMass;
		//9 En metod som g�r om en viss volym av v�tska till en massa.
	}
	/**
	 * 
	 * @param gas = The gas and its capabilities
	 * @param volume = The volume of the object measured in liters (L)
	 * @return
	 */
	public static double volumeToMass (GasTable gas, double volume ) {
		
		double airdensity = gas.density * volume;
		return airdensity;
	}
		//10 En metod som g�r om en viss volym av gas till en massa.
	/**
	 * 
	 * @param solid = The material and its capabilities 
	 * @param volume = The volume of the object measured in liters (L)
	 * @return
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		double massdensity = solid.density * volume;
		return massdensity;
		//11 En metod som g�r om en viss volym av materia till en massa.
	}
	/**
	 * 
	 * @param distance = The distance measured in meters (M)
	 * @param time = The time spawn measured in seconds (S)
	 * @return
	 */
	public static double svtVelocity(double distance, double time) {
		
		double speed = distance / time;
		return speed;
		//12 En metod som r�knar ut medelhastigheten med hj�lp av str�cka och tid
	}
	/**
	 * 
	 * @param velocity = The speed of the object measured in (km/h)
	 * @param time = The time spawn measured in seconds (S)
	 * @return
	 */
	public static double svtDistance(double velocity, double time) {
		
		double distance = velocity * time;
		return distance;
		//13 En metod som r�knar ut str�cka med hj�lp av hastighet och tid.
	}
	/**
	 * 
	 * @param velocity = The speed of the object
	 * @param time = The time spawn measured in seconds (S)
	 * @return
	 */
	public static double svtTime(double velocity, double time) {
		
		double Time = velocity / time;
		return Time;
		//14 En metod som r�knar ut tid f�r hj�lp av str�cka och hastighet.
	}

	/**
	 * 
	 * @param force = The force that is measured in newton (N)
	 * @param distance = The distance measured in meters (M)
	 * @return
	 */
	public static double work(double force, double distance) {
		
		double workAmount = force * distance;
		return workAmount;
		//15 En metod som r�knar ut arbete med hj�lp av kraft och str�cka.
	}
	/**
	 * 
	 * @param work = The amount of work
	 * @param time = The amount of time in sec
	 * @return
	 */
	public static double power(double work, double time) {
		
		double powerAmount = work / time;
		return powerAmount;
		//16 En metod som r�knar ut effekt med hj�lp av arbete och tid.
	}
	/**
	 * 
	 * @param solid = The material and its capabilities 
	 * @param mass = The mass off the object
	 * @param deltaT = The change in temperature
	 * @return
	 */
	public static double  heat(SolidTable solid, double mass, double deltaT) {
		
		double temp = solid.heatCapacity* mass * deltaT;
		return temp;
	    //17 En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma ett visst material ett angivet antal grader.
	}
	/**
	 * 
	 * @param fluid = The specific fluid being used
	 * @param mass = The mass of the object
	 * @param deltaT = The change in temperature
	 * @return = The amount of energy required
	 */
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		
		double flame = fluid.heatCapacity* mass * deltaT;
		return flame;
		//18 En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss massa v�tska ett angivet antal grader.
	}
	/**
	 * 
	 * @param gas = The specific gas 
	 * @param mass = Mass of the object
	 * @param deltaT = The change in time
	 * @return = The amount of energy required
	 */
	public static double  heat(GasTable gas, double mass, double deltaT) {
		
		double burn = gas.heatCapacity * mass * deltaT;
		return burn; 
		//19de En metod som r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss massa gas ett angivet antal grader.
	}
	/**
	 * 
	 * @param velocity = The speed of the object
	 * @return
	 */
	public static double velocityToHeight(double velocity) {
		
		double height = (Math.pow(Math.sin(1.570796),2 )* Math.pow(velocity, 2))/ (2*g_swe);
		return height;
		//20 En metod som r�knar ut hur h�gt ett f�rem�l med en viss hastighet upp�t kommer.
	}
	/**
	 * 
	 * @param time = The time measured in seconds
	 * @return acceleration = The change in speed over time
	 */
	public static double acceleration(double work, double time) {
		double acceleration = work / time;
		return acceleration;
       // Fr�ga 6 / Egen metod 1 som r�kar ut accelarationen
	}
	/**
	 *  
	 * @param kMpH =  Kilometers per hour 
	 * @return 
	 */
	public static double kMpHConvert(double kMpH) {
		double velocityMpS = kMpH / 3.6;
		return velocityMpS;
		//Fr�ga 6 / Egen metod 2 som r�knar ut hastigeten i meter per sekund
	}
	/**
	 * 
   	 * @param acceleration = The change in speed divided my time
	 * @param mass = The mass of the object
	 * @return 
	 */
	public static double force(double acceleration, double mass) {
		double force = acceleration * mass;
		return force;
		//Fr�ga 6 / Egen metod 3 som r�knar ut kraften f�r acceleartionen
	}
	/**
	 * 
	 * @param time = The change in time
	 * @param acceleration = The change in speed divided my time
	 * @return 
	 */
	public static double distance(double time, double acceleration) {
		double distance = (acceleration * Math.pow(time, 2)) / 2;
		return distance;
		//Fr�ga 6 / Egen metod 4 som r�knar ut str�ckan
	}
	/**
	 *
	 * @param height = The height
	 * @param mass = The mass of the object
	 * @return 
	 */
	public static double bounceCount(double height, double mass) {
		double potentialEnergy = mass * g_swe * height;
		int bounceCount = 0;
		double i = height;

		while (i >= 0.5) {
			potentialEnergy *= 0.99;
			i = potentialEnergy / g_swe;
			bounceCount++;
		}
			return bounceCount;
			//Fr�ga 7 / Egen metod 5som r�knar ut antal studs en kula p� 1kg g�r innan den inte kommer �ver 0.5m �ver marken d� den tappar 1% av sin energi
	}
	/**
	 * 
	 * @param newtonM = Newtonmeters
	 * @return
	 */
	public static double joule(double newtonM) {
		double joule = newtonM;
		return joule;
		//Egen metod 6 / fr�ga 1 som konverterar nm till j
    }
	/**
	 * 
	 * @param kg = The mass in Kilos
	 * @return
	 */
	public static double newton(double kg) {
		double weight = kg * g_swe;
		return weight;
		//Egen metod 7 / fr�ga 2
	}
	/**
	 * 
	 * @param meterpersecond = Meters the object travels per second
	 * @return
	 */
	public static double haste(double meterpersecond) {
		double rate = meterpersecond * 3.6;
		return rate;
		//Egen metod 8 / fr�ga 3 som r�knar ut km/h fr�n m/s
	}
	/**
	 * 
	 * @param kineticenergy = The kineticEnergy of the object
	 * @param modeEnergy = The modeEnergy of the object
	 * @return
	 */
	public static double mechanicalEnergy(double kineticenergy, double modeEnergy) {
		double mEnergy = kineticenergy + modeEnergy;
		return mEnergy;
		//Egen metod 9
	}
	/**
	 * 
	 * @param brakeForce = The force that is applyed to the tire by the brakes
	 * @param distance = The distance the object travels
	 * @return
	 */
	public static double brakeDistance(double brakeForce, double distance) {
		double tires = distance * brakeForce;
		return tires;
		//Egen metod 10
	}
	
}


		

	
		

	
