package team21.main;

import java.util.Scanner;

/**
 * Class Abfrage creates a new console query to choose the testmode or the game.
 * The player gets access to the taken choice.
 * 
 * @author Melanie Kluck, 7370787
 *
 */
public class Abfrage {
	public static Testumgebung mkt;
	public static Startfenster mks;
	static boolean friedolin = false;

	/**
	 * Method Abfrage creates a console query whether the player wants to test or
	 * play. Incorrect entries are intercepted.
	 */
	public Abfrage() {
		int mkL = 0;

		Scanner eingabewert = new Scanner(System.in);

		while (friedolin == false) {
			System.out.print("Waehlen Sie zwischen Testumgebung (1) und Spielstarten (2) ");

			try {
				mkL = Integer.parseInt(eingabewert.next());
			} catch (NumberFormatException e) {

			}
			// Ueberpruefe Datentyp der Eingabe

			if (mkL == 1) {
				System.out.println("Testumgebung wurde ausgewaehlt");
				friedolin = true;
				mkt = new Testumgebung();
				// Starte Testumgebung, wenn die 1 eingegeben wird
			} else if (mkL == 2) {
				System.out.println("Spiel wird gestartet");
				friedolin = true;
				mks = new Startfenster();
				// Oeffne das Startfenster, wenn die 2 eingegeben wird
			} else {
				System.out.println("Keine gueltige Eingabe");
				friedolin = false;
				// Abfangen falscher Eingaben
			}
		}

	}
}