import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Hängagubben {
	
	
	static ArrayList<Character> Ord = new ArrayList<Character>();
	static String SpelarensSvar;
	static int SpelarensVal;
	static Scanner input = new Scanner(System.in);
	static Random SlumpmässigtTal = new Random();
	static char[] OsynligtOrd;
	static String HemligtOrd;
	static String[] LättaOrd = { "Bok", "Väg", "Våg", "Hår", "Hus", "Löv" };
	static String[] MedelsvåraOrd = { "Dator", "Skrivbord", "Parkering", "Dörrmatta", "Lastbil" };
	static String[] SvåraOrd = { "Katalysator", "Anestesisjuksköterska", "Kamaxelsensor", "Uroterapeut" };

	public static void main(String[] args) {
		Välkommen();
		StartaSpelet();
		KonverteringAvOrd();
		SpeletBörjar();

	}

	public static void Välkommen() {
		System.out.println("Välkommen till hängagubben!, du kommer att få välja mellan 3 olika svårhetsgrader"
				+ " Du kommer att få gissa 6 gånger vad ordet är, om du inte lyckas innan det så hängs gubben och du förorar"
				+ "Om du lyckas innan gubben hängs så vinner du och gubben överlever");
	}

	public static void StartaSpelet() {

		System.out.println("Tryck 1 för att starta \n Tryck 2 för att avsluta:");

		System.out.println("Skriv en siffra:");
		SpelarensSvar = input.nextLine();

		if (SpelarensVal == 1) {
			SpeletBörjar();
		} else if (SpelarensVal == 2) {
			System.exit(0);

		}

	}

	public static void SpeletBörjar() {
		System.out.println("Välj en svårighetsgrad: 1 (lätt), 2 (medelsvår) eller 3 (svår).");
		int svårhetsgrad = input.nextInt();
		if (svårhetsgrad == 1) {
			HemligtOrd = LättaOrd[SlumpmässigtTal.nextInt(LättaOrd.length)];
			System.out.println(OsynligtOrd);

		} else if (svårhetsgrad == 2) {
			HemligtOrd = MedelsvåraOrd[SlumpmässigtTal.nextInt(MedelsvåraOrd.length)];
			System.out.println(OsynligtOrd);
		}

		else if (svårhetsgrad == 3) {
			HemligtOrd = SvåraOrd[SlumpmässigtTal.nextInt(SvåraOrd.length)];
			System.out.println(OsynligtOrd);
		}
	}

	public static void KonverteringAvOrd() {
		for (int i = 0; i<HemligtOrd.length(); i++) {
			Ord.add('_');
		}
	}
	public static void KontrollerarBokstav() {
		if(HemligtOrd.contains(SpelarensSvar.charAt(0))){
			
			for(int i = 0; i < HemligtOrd.length(); i++); {
				
				OsynligtOrd.set(i , SpelarensSvar.charAt(0));
			}
		}
	}
	
	
}
