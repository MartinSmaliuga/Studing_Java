package Z10;

public class Walec extends Kolo {
	int wysokosc;
	
	Walec() {
		this(1, 1, "Walec");
	}
	
	Walec(int wysocosc, int promien) {
		this(wysocosc, promien, "Walec");
	}
	
	Walec(int wysocosc, int promien, String nazwa) {
		super(promien, nazwa);
		this.wysokosc = wysocosc;
	}
	
	@Override
	public double pole() {
		return 2*Math.PI*promien*wysokosc;
	}
	
	public double objetosc() {
		return super.pole()*wysokosc;
	}
	
	void wyswietl() {
		super.wyswietl();
		System.out.println("Objetosc: " + objetosc());
	}
}
