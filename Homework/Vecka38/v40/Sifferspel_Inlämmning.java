import java.util.Random;
import java.util.Scanner;

public class Sifferspel_Inlämmning {

	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	static String spelarNamn = "";
	static int spelarSvar;
	static int svårhetsgrad;
	static int korrektSvar;
	static int gissningar = 0;
	static boolean svår = false;
	static boolean medel = false;
	static boolean lätt = false;

	public static void main(String[] args) {
		talSpelet();

	}

	/**
	 * En metod som välkomnar dig till spelet, frågar vad du vill heta och berättar
	 * berättar hur spelet fungerar spelregler är en metod för den text som kommer
	 * in i spelet spelarnamn är det du som spelare valt att heta svårhetsgrad är
	 * hur svårt du vill att spelet ska vara felhantering är en metod som kollar att
	 * du skriver in rätt siffor och inte bokstäver
	 * 
	 */
	public static void talSpelet() {
		System.out.println("Välkommen till talspelet!");
		SpelRegler();

		System.out.println("Vad vill du heta?");
		spelarNamn = input.nextLine();

		System.out.println("Välj svårhetsgrad:\n 1(Lätt) \n 2(Medel) \n 3(Svår)");
		while (true) {
			System.out.println("Skriv in ett nummer mellan 1, spann 1-100 med 14 gissningar."
					+ " 2, spann mellan 1-150 med 10 gissningar eller 3, spann 1-200 med 6 gissningar:");
			svårhetsgrad = felhantering();
			if (svårhetsgrad == 1 || svårhetsgrad == 2 || svårhetsgrad == 3) {
				break;

			}
		}
		/**
		 * en metod som skapar ett randomiserat tal korrektsvar är det randomiserade
		 * talet för varje ny runda gissnignar är den inten som räknar hur många
		 * gissningar du gjort spelarledtråd är en metod som ger dig ledtrådar
		 */
		randomiseratTal();

		while (spelarSvar != korrektSvar) {
			System.out.println("Skriv ett nummer: ");
			spelarSvar = felhantering();
			gissningar++;
			spelarLedtråd(spelarSvar);

		}

	}

	/**
	 * en metod som kollar att du skriver in siffor och inte bokstäver
	 * datafrånanvändare är det som du skriver in i konsollen
	 *
	 * @return
	 */
	public static int felhantering() {
		String DataFrånAnvändare = "";
		while (true) {
			DataFrånAnvändare = input.nextLine();
			try {
				return Integer.parseInt(DataFrånAnvändare);

			} catch (Exception e) {
				System.out.println("Felaktig input skriv in siffor");

			}

		}
	}

	/**
	 * En metod som du kan välja från att starta om spelet eller att stänga av det
	 * resultat är den mängd gissningar du gjort spelarval är det du väljer mellan i
	 * denna metoden 1 eller 2 talsepelet är metoden som startar spelet
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
				System.out.println("Skriv in 1 för att starta om");
				System.out.println("Skriv in 2 för att stänga av");
			}
		}
	}

	/**
	 * en metod som ger dig en ledtråd beroende på om du gissat för högt eller för
	 * lågt metoden stänger också av spelet efter ett antal gissningar och ger dig
	 * valet att stänga av eller att börja om metoden ger dig också ett medelande om
	 * du hittat talet
	 * 
	 */
	public static void spelarLedtråd(int spelarSvar) {
		if (svår) {
			if (gissningar == 6) {
				System.out.println("Du har förlorat ");
				Resultat();
			}

		} else if (medel) {
			if (gissningar == 10) {
				System.out.println("Du har förlorat");
				Resultat();
			}

		} else if (lätt) {
			if (gissningar == 14) {
				System.out.println("Du har förlorat");
				Resultat();
			}
		}

		if (spelarSvar > korrektSvar) {
			System.out.println("För högt gissat");
			System.out.println("Antal gissningar " + gissningar);
		} else if (spelarSvar < korrektSvar) {
			System.out.println("För lågt gissat");
			System.out.println("Antal gissningar " + gissningar);
		} else if (spelarSvar == korrektSvar) {
			System.out.println("Bra jobbat " + spelarNamn + " du hittade talet!");
			System.out.println("Antal gissningar " + gissningar);
			System.out.println("Skriv in 1 för att starta om");
			System.out.println("Skriv in 2 för att stänga av");
			Resultat();

		}

	}

	/**
	 * en metod som bestämmer spannet du gissar inom beroende på input från spelaren
	 * 
	 */
	public static void randomiseratTal() {
		if (svårhetsgrad == 1) {
			korrektSvar = rand.nextInt(101);
			lätt = true;

		}

		if (svårhetsgrad == 2) {
			korrektSvar = rand.nextInt(151);
			medel = true;

		}
		if (svårhetsgrad == 3) {
			korrektSvar = rand.nextInt(201);
			svår = true;
		}
	}

	/**
	 * en metod som skriver ut hur spelet går till
	 * 
	 */
	public static void SpelRegler() {
		System.out.println("Spelet går ut på att du ska gissa dig fram till ett tal på så få gissningar som möjligt,"
				+ "du kan ändra svårhetsgrad som ändras spannet du gissar inom och antalet gissningar du har");
	}

}
