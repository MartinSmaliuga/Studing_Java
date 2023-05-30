package Z10;

public class Figura {
	String nazwa;
	
	Figura() {
		this("Figura geometryczna");
	}
	
	Figura(String nazwa) {
		this.nazwa = nazwa;
	}
	
	void wyswietl() {
		System.out.println("Figura geometrczna");
	}
}
