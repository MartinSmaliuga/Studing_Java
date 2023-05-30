
public class CardsGame {
	
	public static void main(String[] args) {
		
		Desk desk1 = new Desk();
		desk1.shuffleDesk(83);
		desk1.printDesk();
		
		System.out.println();
		
		Desk desk2 = new Desk();
		desk2.shuffleDesk(83);
		desk2.printDesk();
		
		System.out.println("\n" + desk1.equals(desk2));
		
	}

}
