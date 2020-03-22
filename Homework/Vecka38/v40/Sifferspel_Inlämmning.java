import java.util.Random;
import java.util.Scanner;

public class Sifferspel {

	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	static String spelarNamn = "";
	static String spelarNamn = "";
	static int spelarSvar;
	static int svårhetsgrad;
	static int korrektSvar;
	static int gissningar = 0;
	

	

	public static void main(String[] args) {
		talSpelet();

	}

	public static void talSpelet() {
		System.out.println("Välkommen till talspelet!");
		SpelRegler();

		System.out.println("Vad vill du heta?");
		spelarNamn = input.nextLine();

		System.out.println("Välj svårhetsgrad:\n 1(Lätt) \n 2(Medel) \n 3(Svår)");
		while (true) {
			System.out.println("Skriv in ett nummer mellan 1, 2 eller 3:");
			svårhetsgrad = felhantering();
			if (svårhetsgrad == 1 || svårhetsgrad == 2 || svårhetsgrad == 3) {
				break;

			}
		}

		randomiseratTal();

		while (spelarSvar != korrektSvar) {
			System.out.println("Skriv ett nummer: ");
			spelarSvar = input.nextInt();
			gissningar++;
			spelarLedtråd(spelarSvar);

		}

	}
}
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


