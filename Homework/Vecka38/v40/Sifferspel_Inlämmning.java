import java.util.Random;
import java.util.Scanner;

public class Sifferspel {

	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	static String spelarNamn = "";
	static String spelarNamn = "";
	static int spelarSvar;
	static int sv�rhetsgrad;
	static int korrektSvar;
	static int gissningar = 0;
	static boolean sv�r = false;
	

	

	public static void main(String[] args) {
		talSpelet();

	}

	public static void talSpelet() {
		System.out.println("V�lkommen till talspelet!");
		SpelRegler();

		System.out.println("Vad vill du heta?");
		spelarNamn = input.nextLine();

		System.out.println("V�lj sv�rhetsgrad:\n 1(L�tt) \n 2(Medel) \n 3(Sv�r)");
		while (true) {
			System.out.println("Skriv in ett nummer mellan 1, 2 eller 3:");
			sv�rhetsgrad = felhantering();
			if (sv�rhetsgrad == 1 || sv�rhetsgrad == 2 || sv�rhetsgrad == 3) {
				break;

			}
		}

		randomiseratTal();

		while (spelarSvar != korrektSvar) {
			System.out.println("Skriv ett nummer: ");
			spelarSvar = input.nextInt();
			gissningar++;
			spelarLedtr�d(spelarSvar);

		}

	}
}
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

public static void Resultat() {
	while (true) {
		int spelarVal = felhantering();
		
		
			if (spelarVal == 1) {
				talSpelet();
			}else if(spelarVal == 2) {
				System.exit(0);
				
			}
			
			else{
				System.out.println("Skriv in 1 f�r att starta om");
				System.out.println("Skriv in 2 f�r att st�nga av");
			}
	}
}

public static void spelarLedtr�d(int spelarSvar) {
	if (sv�r) {
		if (gissningar == 6) {
			System.out.println("Du har f�rlorat ");
			Resultat();
		}
}
}
	