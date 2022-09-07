package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;

public class ob2 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int poeng = Integer.parseInt(showInputDialog("Kor mange poeng fekk du"));

			String ut = "Du fikk: ";

			if ((poeng >= 90) && (poeng <= 100)) {
				ut += "A";

			} else if ((poeng >= 80) && (poeng <= 89)) {
				ut += "B";
			} else if ((poeng >= 60) && (poeng <= 79)) {
				ut += "C";
			} else if ((poeng >= 50) && (poeng <= 59)) {
				ut += "D";
			} else if ((poeng >= 40) && (poeng <= 49)) {
				ut += "E";
			} else if ((poeng > 0) && (poeng <= 39)) {
				ut += "F Du strøk";

			} else {
				ut = "Feil! Poengsum må være mellom 0 og 100, prøv igjen.";
				i = i - 1;
			}

			System.out.println(ut);

		}

	}
}
