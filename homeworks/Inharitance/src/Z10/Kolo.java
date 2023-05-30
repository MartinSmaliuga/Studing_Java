package Z10;

public class Kolo extends Figura {
	int promien;
	
	Kolo() {
		this(1, "Kolo");
	}
	
	Kolo(int promien) {
		this(promien, "Kolo");
	}
	
	Kolo(int promien, String nazwa) {
		super(nazwa);
		this.promien = promien;
	}
	
	double pole() {
		return Math.PI * Math.pow(promien, 2);
	}
	
	@Override
	void wyswietl() {
		super.wyswietl();
		System.out.println(nazwa + "\nPole: " + pole());
	}
	
}
