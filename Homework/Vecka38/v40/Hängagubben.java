
public class H�ngagubben {

	static int SpelarensVal;
	static String SpelarensSvar;

	public static void main(String[] args) {
		V�lkommen();
		StartaSpelet();

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

		} else if (SpelarensVal == 2) {
			System.exit(0);

		}

	}
}
