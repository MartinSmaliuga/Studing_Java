package Z10;

public class Stozek extends Kolo{
	int wysokosc;
	
	Stozek() {
		this(1, 1, "Stozek");
	}
	
	Stozek(int wysocosc, int promien) {
		this(wysocosc, promien, "Stozek");
	}
	
	Stozek(int wysocosc, int promien, String nazwa) {
		super(promien, nazwa);
		this.wysokosc = wysocosc;
	}
	
	@Override
	public double pole() {
		return Math.PI*promien*Math.sqrt(Math.pow(wysokosc, 2) + Math.pow(promien, 2));
	}
	
	public double objetosc() {
		return super.pole()*wysokosc/3;
	}
	
	void wyswietl() {
		super.wyswietl();
		System.out.println("Objetosc: " + objetosc());
	}
}
