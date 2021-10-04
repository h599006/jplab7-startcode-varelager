package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		
		double billigst = varer[0].getPris();
		Vare billigstSted = varer[0];
		
		for (int i = 0; i < varer.length; i++) {
			if (varer[i].getPris() < billigst) {
				billigst = varer[i].getPris();
				billigstSted = varer[i];
			}
		}
		
		return billigstSted;
	}
	
	public static double totalPris(Vare[] varer) {		
		
		double sum = 0;
		
		for (int i = 0; i < varer.length; i++) {
			sum += varer[i].getPris();
		}
		
		return sum;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int[] vareNr = new int[varer.length];
		
		for (int i = 0; i < vareNr.length; i++) {
			vareNr[i] = varer[i].getVarenr();
		}
		return vareNr;

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		double[] differenser = new double[varer.length-1];
		
		
		for (int i = 0; i < differenser.length; i++) {
			differenser[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		
		return differenser;
	}
}
