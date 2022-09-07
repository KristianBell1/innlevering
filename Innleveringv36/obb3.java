package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;


public class obb3 {
	
	public static void main(String[] args) {
	int n =	Integer.parseInt(showInputDialog("Skriv inn tall her"));
	
	int x = 1;
	
	int a = n;
	
	while (n > 1) {
		x *= n;
		n--;
		
	}
	System.out.println(a + "!=" +x);
	}

}
