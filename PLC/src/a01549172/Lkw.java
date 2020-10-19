package a01549172;

public class Lkw extends Fahrzeug{

	public Lkw(String marke, String modell, int baujahr, Double grundpreis, int id) throws IllegalArgumentException {
		super(marke, modell, baujahr, grundpreis, id);
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected int getRabatt() {
		int tmp = this.getAlter() * 5;
		if(tmp > 20) tmp = 20;
		else if (tmp < 0) tmp = 0;
		return tmp;
	}

}
