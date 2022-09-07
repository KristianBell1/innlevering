package innlevering1;


import static javax.swing.JOptionPane.*;

public class ob1 {
	public static void main(String[] args) {
		int bruttolønn = Integer.parseInt(showInputDialog("Skrive inn bruttolønn"));
		
		int trinn1 = 164101;
		int trinn2 = 230951;
		int trinn3 = 580651;
		int trinn4 = 934051;
		
		double trinn1sats = 0.0093;
		double trinn2sats = 0.0241;
		double trinn3sats = 0.1152;
		double trinn4sats = 0.1452;
		
		int skatt = 0;
		
		if ((bruttolønn >= trinn1) && (bruttolønn < trinn2)) {
			skatt += (bruttolønn);
		} if ((bruttolønn >= trinn2) && (bruttolønn < trinn3)) {
			skatt += (bruttolønn)*trinn2sats;
		} if ((bruttolønn >= trinn3) && (bruttolønn < trinn4)) {
			skatt += (bruttolønn)*trinn3sats;
		} if (bruttolønn >= trinn4)  {
			skatt += (bruttolønn)*trinn4sats;
		}
		
		int nettoinntekter = bruttolønn - skatt;
		
		System.out.println("bruttolønn" + bruttolønn + "kr");
		System.out.println("skatt" + skatt + "kr");
		System.out.println("Nettoinntekter" + nettoinntekter + "kr");
		
	}
	
	

}