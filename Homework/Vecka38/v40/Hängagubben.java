import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class Hängagubben {

	static ArrayList<Character> Ord = new ArrayList<Character>();
	static String spelarensSvar;
	static int spelarensVal;
	static int gissningar = 0;
	static Scanner input = new Scanner(System.in);
	static Random SlumpmässigtTal = new Random();
	static ArrayList<Character> osynligtOrd = new ArrayList<>();
	static String hemligtOrd;
	static String[] LättaOrd = { "bok", "väg", "våg", "vår", "hus", "löv" };
	static String[] MedelsvåraOrd = { "dator", "skrivbord", "parkering", "dörrmatta", "lastbil" };
	static String[] SvåraOrd = { "katalysator", "anestesisjuksköterska", "kamaxelsensor", "uroterapeut" };

	public static void main(String[] args) {
		Välkommen();
		StartaSpelet();

	}

//En metod som hälsar dig välkommen till spelet och förklarar hur det funkar 
	public static void Välkommen() {
		System.out.println("Välkommen till hängagubben!, du kommer att få välja mellan 3 olika svårhetsgrader"
				+ " Du kommer att få gissa 6 gånger vad ordet är, om du inte lyckas innan det så hängs gubben och du förorar "
				+ "Om du lyckas innan gubben hängs så vinner du och gubben överlever");
	}

//En metod som låter dig välja att antingen starta eller stänga av spelet
	public static void StartaSpelet() {
		gissningar = 0;
		System.out.println("Tryck 1 för att starta \n Tryck 2 för att avsluta:");
		while (true) {

			System.out.println("Skriv en siffra:");
			spelarensSvar = input.nextLine();

			spelarensVal = fåPositivtTalFrånSträng(spelarensSvar);

			if (spelarensVal == 1) {
				SpeletBörjar();
				break;
			} else if (spelarensVal == 2) {
				System.exit(0);
				break;
			} else if (spelarensVal == -1) {
				System.out.println("Skriv in ett tal mellan 1 och 2");
			}
		}
	}

	// En metod som låter dig välja svårhetsgrad på spelet
	public static void valAvSvårhetsgrad() {
		System.out.println("Välj en svårighetsgrad: 1 (lätt), 2 (medelsvår) eller 3 (svår).");
		int svårhetsgrad = input.nextInt();
		if (svårhetsgrad == 1) {
			hemligtOrd = LättaOrd[SlumpmässigtTal.nextInt(LättaOrd.length)];

		} else if (svårhetsgrad == 2) {
			hemligtOrd = MedelsvåraOrd[SlumpmässigtTal.nextInt(MedelsvåraOrd.length)];

		}

		else if (svårhetsgrad == 3) {
			hemligtOrd = SvåraOrd[SlumpmässigtTal.nextInt(SvåraOrd.length)];

		}
	}

//en metod som startar spelet på den svårhetsgrad du valt samt stänger av spelet om du gissat fel för många gånger 
	public static void SpeletBörjar() {
		valAvSvårhetsgrad();
		fyllListaMedBokstäver();
		fyllListaMedUnderstreck();

		while (true) {
			spelarensSvar = input.nextLine();
			if (spelarensSvar.length() == 1) {
				detÄrEnBokstav();

			} else {
				continue;
			}

			if (!finnsDetKvarUnderstreck()) {
				System.out.println("Du har vunnit!");
				StartaSpelet();
				break;
			}

			if (gissningar == 6) {
				System.out.println("Du har förlorat");
				StartaSpelet();
				break;
			}

		}
	}

//En metod som väljer ut ett randomiserat ord 
	public static void fyllListaMedBokstäver() {
		Ord.clear();
		for (int i = 0; i < hemligtOrd.length(); i++) {
			Ord.add(hemligtOrd.charAt(i));
		}

	}

	// En metod som byter ut det randomiserade ordet mot understräck
	public static void fyllListaMedUnderstreck() {
		osynligtOrd.clear();
		for (int i = 0; i < hemligtOrd.length(); i++) {
			osynligtOrd.add('_');
		}
		System.out.println(osynligtOrd);
	}
	//En metod som kontrollerar att bokstaven man gissat på finns med i ordet 
		public static void detÄrEnBokstav() {
			if (Ord.contains(spelarensSvar.charAt(0))) {
				läggTillBokstäver();
			} else {
				System.out.println("Bokstaven finns inte med i ordet!");
				gissningar++;
			}
		}
		//En metod som fyller en lista med ord 
		public static void läggTillBokstäver() {
			if (Ord.contains(spelarensSvar.charAt(0))) {
				System.out.println("Bokstav finns i ordet!");
				for (int i = 0; i < hemligtOrd.length(); i++) {
					if (spelarensSvar.charAt(0) == hemligtOrd.charAt(i)) {
						osynligtOrd.set(i, spelarensSvar.charAt(0));
					}

				}
				System.out.println(osynligtOrd);
			}
		}
		//En metod som kontrollerar att siffror inte skrivs in i stängar
		public static int fåPositivtTalFrånSträng(String sträng) {
			try {
				return Integer.parseInt(sträng);
			} catch (NumberFormatException exception) {
				return -1;
			}

		}
}
