
public class Hängagubben {

	static int SpelarensVal;
	static String SpelarensSvar;

	public static void main(String[] args) {
		Välkommen();
		StartaSpelet();

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

		} else if (SpelarensVal == 2) {
			System.exit(0);

		}

	}
}
