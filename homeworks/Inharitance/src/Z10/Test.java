package Z10;

public class Test {

	public static void main(String[] args) {
		Figura[] figArr = new Figura[10];
		
		for (int i = 0; i < figArr.length; i++) {
			switch ((int)Math.floor(Math.random()*5)) {
				case 0:
					figArr[i] = new Figura();
					break;
				case 1:
					figArr[i] = new Kolo();
					break;
				case 2:
					figArr[i] = new Walec();
					break;
				case 3:
					figArr[i] = new Stozek();
					break;
				case 4:
					figArr[i] = new Kula();
					break;
			}
			
			figArr[i].wyswietl();
			System.out.println();
			
		}

	}

}
