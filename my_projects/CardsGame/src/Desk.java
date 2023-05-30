
class Desk {
	private Card[] desk;
	
	Desk() {
		createSimpleDesk();
	}
	
	Desk(Card[] desk) {
		this.desk = desk;
	}
	
	private void createSimpleDesk() {
		this.desk = new Card[52];
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				desk[i] = new Card(suit, rank);
				i++;
			}
		}
	}
	
	public void shuffleDesk() {
		shuffleDesk(50);
	}
	
	public void shuffleDesk(int n) {
		while (n>0) {
			int i1 =(int) Math.floor(Math.random()*desk.length);
			int i2 =(int) Math.floor(Math.random()*desk.length);
			
			Card buffer = desk[i1];
			desk[i1] = desk[i2];
			desk[i2] = buffer;
			
			n--;
		}
	}
	
	public Card takeRandomCard() {
		return desk[(int) Math.floor(Math.random()*desk.length)];
	}
	
	public void printDesk() {
		for (int i = 0; i < desk.length; i++) {
			desk[i].printCardInfo();
		}
	}
	
	public int hashCode() {
		return toString().hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Desk) {
			Desk anotherCard = (Desk) obj;
			return anotherCard.hashCode() == hashCode();
		}
		else
			return false;
	}
	
	public String toString() {
		StringBuilder value = new StringBuilder();
		
		for (int i = 0; i < desk.length; i++) {
			value.append(desk[i].toString() + " ");
			
		}
		
		return value.toString().trim();
	}
}
