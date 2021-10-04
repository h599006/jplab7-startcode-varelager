package no.hvl.dat100.varelager;

public class Vare {
	
	private int varenr;
	private String navn;
	private double pris;
	
	public Vare(int varenr, String navn, double pris) {
		
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
	}
	
	public int getVarenr() {
		
		return varenr;
		
	}
	
	public void setVarenr(int varenr) {
		
		this.varenr = varenr;
	}
	
	public String getNavn() {
		
		return navn;
	}
	
	public void setNavn(String navn) {
		
		this.navn = navn;
	}
	
	public double getPris() {
		
		return pris;
	}
	
	public void setPris(double pris) {
		
		this.pris = pris;
	}
	
	public double beregnMoms() {
		double total = this.pris;
		double utenMoms = total / 1.25;
		double moms = total - utenMoms;
		
		return moms;
	}
	
	public String toString() {
		
		String print = "Vare [varenr=" + this.varenr + ", navn=" + this.navn + ", pris=" + this.pris + "]";
		
		return print;
		
	}
	
	public boolean erBilligereEnn(Vare v) {
		
		boolean billigere = false;
		if (v.pris > this.pris) {
			billigere = true;
		}
		
		return billigere;
	}
	
}
