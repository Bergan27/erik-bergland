import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class H�ngagubben {

	static ArrayList<Character> Ord = new ArrayList<Character>();
	static String spelarensSvar;
	static int spelarensVal;
	static int gissningar = 0;
	static Scanner input = new Scanner(System.in);
	static Random Slumpm�ssigtTal = new Random();
	static ArrayList<Character> osynligtOrd = new ArrayList<>();
	static String hemligtOrd;
	static String[] L�ttaOrd = { "bok", "v�g", "v�g", "v�r", "hus", "l�v" };
	static String[] Medelsv�raOrd = { "dator", "skrivbord", "parkering", "d�rrmatta", "lastbil" };
	static String[] Sv�raOrd = { "katalysator", "anestesisjuksk�terska", "kamaxelsensor", "uroterapeut" };

	public static void main(String[] args) {
		V�lkommen();
		StartaSpelet();

	}

//En metod som h�lsar dig v�lkommen till spelet och f�rklarar hur det funkar 
	public static void V�lkommen() {
		System.out.println("V�lkommen till h�ngagubben!, du kommer att f� v�lja mellan 3 olika sv�rhetsgrader"
				+ " Du kommer att f� gissa 6 g�nger vad ordet �r, om du inte lyckas innan det s� h�ngs gubben och du f�rorar "
				+ "Om du lyckas innan gubben h�ngs s� vinner du och gubben �verlever");
	}

//En metod som l�ter dig v�lja att antingen starta eller st�nga av spelet
	public static void StartaSpelet() {
		gissningar = 0;
		System.out.println("Tryck 1 f�r att starta \n Tryck 2 f�r att avsluta:");
		while (true) {

			System.out.println("Skriv en siffra:");
			spelarensSvar = input.nextLine();

			spelarensVal = f�PositivtTalFr�nStr�ng(spelarensSvar);

			if (spelarensVal == 1) {
				SpeletB�rjar();
				break;
			} else if (spelarensVal == 2) {
				System.exit(0);
				break;
			} else if (spelarensVal == -1) {
				System.out.println("Skriv in ett tal mellan 1 och 2");
			}
		}
	}

	// En metod som l�ter dig v�lja sv�rhetsgrad p� spelet
	public static void valAvSv�rhetsgrad() {
		System.out.println("V�lj en sv�righetsgrad: 1 (l�tt), 2 (medelsv�r) eller 3 (sv�r).");
		int sv�rhetsgrad = input.nextInt();
		if (sv�rhetsgrad == 1) {
			hemligtOrd = L�ttaOrd[Slumpm�ssigtTal.nextInt(L�ttaOrd.length)];

		} else if (sv�rhetsgrad == 2) {
			hemligtOrd = Medelsv�raOrd[Slumpm�ssigtTal.nextInt(Medelsv�raOrd.length)];

		}

		else if (sv�rhetsgrad == 3) {
			hemligtOrd = Sv�raOrd[Slumpm�ssigtTal.nextInt(Sv�raOrd.length)];

		}
	}

//en metod som startar spelet p� den sv�rhetsgrad du valt samt st�nger av spelet om du gissat fel f�r m�nga g�nger 
	public static void SpeletB�rjar() {
		valAvSv�rhetsgrad();
		fyllListaMedBokst�ver();
		fyllListaMedUnderstreck();

		while (true) {
			spelarensSvar = input.nextLine();
			if (spelarensSvar.length() == 1) {
				det�rEnBokstav();

			} else {
				continue;
			}

			if (!finnsDetKvarUnderstreck()) {
				System.out.println("Du har vunnit!");
				StartaSpelet();
				break;
			}

			if (gissningar == 6) {
				System.out.println("Du har f�rlorat");
				StartaSpelet();
				break;
			}

		}
	}

//En metod som v�ljer ut ett randomiserat ord 
	public static void fyllListaMedBokst�ver() {
		Ord.clear();
		for (int i = 0; i < hemligtOrd.length(); i++) {
			Ord.add(hemligtOrd.charAt(i));
		}

	}

	// En metod som byter ut det randomiserade ordet mot understr�ck
	public static void fyllListaMedUnderstreck() {
		osynligtOrd.clear();
		for (int i = 0; i < hemligtOrd.length(); i++) {
			osynligtOrd.add('_');
		}
		System.out.println(osynligtOrd);
	}
	//En metod som kontrollerar att bokstaven man gissat p� finns med i ordet 
		public static void det�rEnBokstav() {
			if (Ord.contains(spelarensSvar.charAt(0))) {
				l�ggTillBokst�ver();
			} else {
				System.out.println("Bokstaven finns inte med i ordet!");
				gissningar++;
			}
		}
		//En metod som fyller en lista med ord 
		public static void l�ggTillBokst�ver() {
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
		//En metod som kontrollerar att siffror inte skrivs in i st�ngar
		public static int f�PositivtTalFr�nStr�ng(String str�ng) {
			try {
				return Integer.parseInt(str�ng);
			} catch (NumberFormatException exception) {
				return -1;
			}

		}
}
