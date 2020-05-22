import java.util.Scanner;

public class Hängagubben {

	static String spelarensSvar;
	static int spelarensVal;
	static int gissningar = 0;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Välkommen();
		StartaSpelet();

	}

//En metod som hälsar dig välkommen till spelet och förklarar hur det funkar 
	public static void Välkommen() {
		System.out.println("Välkommen till hängagubben!, du kommer att få välja mellan 3 olika svårhetsgrader"
				+ " Du kommer att få gissa 6 gånger vad ordet är, om du inte lyckas innan det så hängs gubben och du förorar "
				+ "Om du lyckas innan gubben hängs så vinner du och gubben överlever");
	}



//En metod som låter dig välja att antingen starta eller stänga av spelet
	public static void StartaSpelet() {
		gissningar = 0;
		System.out.println("Tryck 1 för att starta \n Tryck 2 för att avsluta:");
		while (true) {

			System.out.println("Skriv en siffra:");
			spelarensSvar = input.nextLine();

			spelarensVal = fåPositivtTalFrånSträng(spelarensSvar);

			if (spelarensVal == 1) {
				SpeletBörjar();
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