import java.util.Scanner;

public class H�ngagubben {

	static String spelarensSvar;
	static int spelarensVal;
	static int gissningar = 0;
	static Scanner input = new Scanner(System.in);
	
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
}