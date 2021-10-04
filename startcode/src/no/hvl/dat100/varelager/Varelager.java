package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		antall = 0;
		varer = new Vare[n];

	}
	
	public Vare[] getVarer() {
		
		return varer;

	}
	
	public boolean leggTilVare(Vare v) {
		
		boolean lagtTil = false;
		
		if (antall < varer.length) {
			varer[antall] = v;
			lagtTil = true;
			antall++;
		}
		
		
		return lagtTil;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		boolean lagtTil = false;
		
		Vare nyVare = new Vare(varenr, navn, pris);
		boolean leggeTil = leggTilVare(nyVare);
		
		if (leggeTil == true) {
			lagtTil = true;
		}
		
		return lagtTil;
	}
	
	public Vare finnVare(int varenr) {
		
		boolean funnet = false;
		int teller = 0;
		Vare verdi = varer[teller];
		
		while (!funnet && teller < varer.length) {
			if (varer[teller].getVarenr() == varenr) {
				funnet = true;
				verdi = varer[teller];
			}
			teller++;
		}
		if (funnet == false) {
			return null;
		}
		return verdi;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
		
		for (int i = 0; i < varer.length; i++) {
			System.out.println(varer[i].toString());
		}
		System.out.println(SEP);
	}
	
}
