import java.util.Random;
import java.util.Scanner;

public class Sifferspel_Inl�mmning {

	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	static String spelarNamn = "";
	static int spelarSvar;
	static int sv�rhetsgrad;
	static int korrektSvar;
	static int gissningar = 0;
	static boolean sv�r = false;
	static boolean medel = false;
	static boolean l�tt = false;

	public static void main(String[] args) {
		talSpelet();

	}

	/**
	 * En metod som v�lkomnar dig till spelet, fr�gar vad du vill heta och ber�ttar
	 * ber�ttar hur spelet fungerar spelregler �r en metod f�r den text som kommer
	 * in i spelet spelarnamn �r det du som spelare valt att heta sv�rhetsgrad �r
	 * hur sv�rt du vill att spelet ska vara felhantering �r en metod som kollar att
	 * du skriver in r�tt siffor och inte bokst�ver
	 * 
	 */
	public static void talSpelet() {
		System.out.println("V�lkommen till talspelet!");
		SpelRegler();

		System.out.println("Vad vill du heta?");
		spelarNamn = input.nextLine();

		System.out.println("V�lj sv�rhetsgrad:\n 1(L�tt) \n 2(Medel) \n 3(Sv�r)");
		while (true) {
			System.out.println("Skriv in ett nummer mellan 1, spann 1-100 med 14 gissningar."
					+ " 2, spann mellan 1-150 med 10 gissningar eller 3, spann 1-200 med 6 gissningar:");
			sv�rhetsgrad = felhantering();
			if (sv�rhetsgrad == 1 || sv�rhetsgrad == 2 || sv�rhetsgrad == 3) {
				break;

			}
		}
		/**
		 * en metod som skapar ett randomiserat tal korrektsvar �r det randomiserade
		 * talet f�r varje ny runda gissnignar �r den inten som r�knar hur m�nga
		 * gissningar du gjort spelarledtr�d �r en metod som ger dig ledtr�dar
		 */
		randomiseratTal();

		while (spelarSvar != korrektSvar) {
			System.out.println("Skriv ett nummer: ");
			spelarSvar = felhantering();
			gissningar++;
			spelarLedtr�d(spelarSvar);

		}

	}

	/**
	 * en metod som kollar att du skriver in siffor och inte bokst�ver
	 * datafr�nanv�ndare �r det som du skriver in i konsollen
	 *
	 * @return
	 */
	public static int felhantering() {
		String DataFr�nAnv�ndare = "";
		while (true) {
			DataFr�nAnv�ndare = input.nextLine();
			try {
				return Integer.parseInt(DataFr�nAnv�ndare);

			} catch (Exception e) {
				System.out.println("Felaktig input skriv in siffor");

			}

		}
	}

	/**
	 * En metod som du kan v�lja fr�n att starta om spelet eller att st�nga av det
	 * resultat �r den m�ngd gissningar du gjort spelarval �r det du v�ljer mellan i
	 * denna metoden 1 eller 2 talsepelet �r metoden som startar spelet
	 * 
	 * 
	 */
	public static void Resultat() {
		while (true) {
			int spelarVal = felhantering();

			if (spelarVal == 1) {
				talSpelet();
			} else if (spelarVal == 2) {
				System.exit(0);

			}

			else {
				System.out.println("Skriv in 1 f�r att starta om");
				System.out.println("Skriv in 2 f�r att st�nga av");
			}
		}
	}

	/**
	 * en metod som ger dig en ledtr�d beroende p� om du gissat f�r h�gt eller f�r
	 * l�gt metoden st�nger ocks� av spelet efter ett antal gissningar och ger dig
	 * valet att st�nga av eller att b�rja om metoden ger dig ocks� ett medelande om
	 * du hittat talet
	 * 
	 */
	public static void spelarLedtr�d(int spelarSvar) {
		if (sv�r) {
			if (gissningar == 6) {
				System.out.println("Du har f�rlorat ");
				Resultat();
			}

		} else if (medel) {
			if (gissningar == 10) {
				System.out.println("Du har f�rlorat");
				Resultat();
			}

		} else if (l�tt) {
			if (gissningar == 14) {
				System.out.println("Du har f�rlorat");
				Resultat();
			}
		}

		if (spelarSvar > korrektSvar) {
			System.out.println("F�r h�gt gissat");
			System.out.println("Antal gissningar " + gissningar);
		} else if (spelarSvar < korrektSvar) {
			System.out.println("F�r l�gt gissat");
			System.out.println("Antal gissningar " + gissningar);
		} else if (spelarSvar == korrektSvar) {
			System.out.println("Bra jobbat " + spelarNamn + " du hittade talet!");
			System.out.println("Antal gissningar " + gissningar);
			System.out.println("Skriv in 1 f�r att starta om");
			System.out.println("Skriv in 2 f�r att st�nga av");
			Resultat();

		}

	}

	/**
	 * en metod som best�mmer spannet du gissar inom beroende p� input fr�n spelaren
	 * 
	 */
	public static void randomiseratTal() {
		if (sv�rhetsgrad == 1) {
			korrektSvar = rand.nextInt(101);
			l�tt = true;

		}

		if (sv�rhetsgrad == 2) {
			korrektSvar = rand.nextInt(151);
			medel = true;

		}
		if (sv�rhetsgrad == 3) {
			korrektSvar = rand.nextInt(201);
			sv�r = true;
		}
	}

	/**
	 * en metod som skriver ut hur spelet g�r till
	 * 
	 */
	public static void SpelRegler() {
		System.out.println("Spelet g�r ut p� att du ska gissa dig fram till ett tal p� s� f� gissningar som m�jligt,"
				+ "du kan �ndra sv�rhetsgrad som �ndras spannet du gissar inom och antalet gissningar du har");
	}

}
