package Z10;

public class Kula extends Kolo{
	
	Kula() {
		this(1, "Kula");
	}
	
	Kula(int promien) {
		this( promien, "Kula");
	}
	
	Kula(int promien, String nazwa) {
		super(promien, nazwa);
	}
	
	@Override
	public double pole() {
		return super.pole()*4;
	}
	
	public double objetosc() {
		return pole()*promien/3;
	}
	
	void wyswietl() {
		super.wyswietl();
		System.out.println("Objetosc: " + objetosc());
	}
}
