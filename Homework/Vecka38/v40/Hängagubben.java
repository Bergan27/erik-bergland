import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class H�ngagubben {
	
	
	static ArrayList<Character> Ord = new ArrayList<Character>();
	static String SpelarensSvar;
	static int SpelarensVal;
	static Scanner input = new Scanner(System.in);
	static Random Slumpm�ssigtTal = new Random();
	static char[] OsynligtOrd;
	static String HemligtOrd;
	static String[] L�ttaOrd = { "Bok", "V�g", "V�g", "H�r", "Hus", "L�v" };
	static String[] Medelsv�raOrd = { "Dator", "Skrivbord", "Parkering", "D�rrmatta", "Lastbil" };
	static String[] Sv�raOrd = { "Katalysator", "Anestesisjuksk�terska", "Kamaxelsensor", "Uroterapeut" };

	public static void main(String[] args) {
		V�lkommen();
		StartaSpelet();
		KonverteringAvOrd();
		SpeletB�rjar();

	}

	public static void V�lkommen() {
		System.out.println("V�lkommen till h�ngagubben!, du kommer att f� v�lja mellan 3 olika sv�rhetsgrader"
				+ " Du kommer att f� gissa 6 g�nger vad ordet �r, om du inte lyckas innan det s� h�ngs gubben och du f�rorar"
				+ "Om du lyckas innan gubben h�ngs s� vinner du och gubben �verlever");
	}

	public static void StartaSpelet() {

		System.out.println("Tryck 1 f�r att starta \n Tryck 2 f�r att avsluta:");

		System.out.println("Skriv en siffra:");
		SpelarensSvar = input.nextLine();

		if (SpelarensVal == 1) {
			SpeletB�rjar();
		} else if (SpelarensVal == 2) {
			System.exit(0);

		}

	}

	public static void SpeletB�rjar() {
		System.out.println("V�lj en sv�righetsgrad: 1 (l�tt), 2 (medelsv�r) eller 3 (sv�r).");
		int sv�rhetsgrad = input.nextInt();
		if (sv�rhetsgrad == 1) {
			HemligtOrd = L�ttaOrd[Slumpm�ssigtTal.nextInt(L�ttaOrd.length)];
			System.out.println(OsynligtOrd);

		} else if (sv�rhetsgrad == 2) {
			HemligtOrd = Medelsv�raOrd[Slumpm�ssigtTal.nextInt(Medelsv�raOrd.length)];
			System.out.println(OsynligtOrd);
		}

		else if (sv�rhetsgrad == 3) {
			HemligtOrd = Sv�raOrd[Slumpm�ssigtTal.nextInt(Sv�raOrd.length)];
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
