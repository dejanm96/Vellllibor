package a01549172;

public class Pkw extends Fahrzeug {
	
	private int letztesService;
	
	public Pkw(String marke, String modell, int baujahr, Double grundpreis, int id, int letztesService) throws IllegalArgumentException {
		super(marke, modell, baujahr, grundpreis, id);
		this.setLetztesService(letztesService);
	}

	private static final long serialVersionUID = 1L;

	public int getJahreSeitLetztemService() {
		return 2020 - this.getLetztesService();
	}

	public int getLetztesService() {
		return letztesService;
	}

	public void setLetztesService(int letztesService) throws IllegalArgumentException{
		if(letztesService > 2020 || letztesService < this.getBaujahr()) throw new IllegalArgumentException("Letztes Service stimmt nicht!");
		this.letztesService = letztesService;
	}

	@Override
	protected int getRabatt() {
		int tmp = this.getAlter() * 5 + this.getJahreSeitLetztemService() * 2;
		if(tmp > 15) tmp = 15;
		else if (tmp < 0) tmp = 0;
		return tmp;
	}

	@Override
	public String toString() {
		return "Pkw [getAlter()=" + getAlter() + ", getPreis()=" + getPreis() + ", getMarke()=" + getMarke()
				+ ", getModell()=" + getModell() + ", getBaujahr()=" + getBaujahr() + ", getGrundpreis()="
				+ getGrundpreis() + ", getId()=" + getId() + "]";
	}
	
	

}
