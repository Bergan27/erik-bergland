import java.util.Random;
import java.util.Scanner;

public class Sifferspel {

	static Scanner input = new Scanner(System.in);

	static String spelarNamn = "";

	static int sv�rhetsgrad;

	

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
	}
}

