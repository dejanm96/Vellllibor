package a01549172;

import java.io.Serializable;

public abstract class Fahrzeug implements Serializable{

	private static final long serialVersionUID = 1L;
	private String marke;
	private String modell;
	private int Baujahr;
	private Double grundpreis;
	private int id;
	
	public Fahrzeug(String marke, String modell, int baujahr, Double grundpreis, int id) throws IllegalArgumentException {
		this.setMarke(marke);
		this.setModell(modell);
		this.setBaujahr(baujahr);
		this.setGrundpreis(grundpreis);
		this.setId(id);
	}
	
	public int getAlter() {
		return 2020 - getBaujahr();
	}
	
	public Double getPreis() {
		return getGrundpreis() - (getGrundpreis() * (getRabatt()/100.0));
	}
	
	protected abstract int getRabatt();

	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public int getBaujahr() {
		return Baujahr;
	}
	public void setBaujahr(int baujahr) throws IllegalArgumentException {
		if(baujahr > 2020) throw new IllegalArgumentException("Baujahr stimmt nicht!");
		else
		Baujahr = baujahr;
	}
	public Double getGrundpreis() {
		return grundpreis;
	}
	public void setGrundpreis(Double grundpreis) throws IllegalArgumentException {
		if(grundpreis < 0.0) throw new IllegalArgumentException("Preis kann nicht kleiner 0 sein!");
		else
		this.grundpreis = grundpreis;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
