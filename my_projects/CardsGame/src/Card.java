
class Card {
	private Suit suit;
	private Rank rank;
	
	
	public Card() {
		this(Suit.CLUB, Rank.ACE);
	}
	
	public Card(Suit suit) {
		this(suit, Rank.ACE);
	}

	public Card(Rank rank) {
		this(Suit.CLUB, rank);
	}
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public char getSuit() {
		return  suit.getChar();
	}

	public char getRank() {
		return  rank.getChar();
	}

	public void printCardInfo() {
		System.out.printf("%c %c\n", getSuit(), getRank());
	}

	public int hashCode() {
		return suit.getValue()*13+rank.getValue();
	}
	
	public boolean equals (Object obj) {
		if (obj instanceof Card) {
			Card anotherCard = (Card) obj;
			return anotherCard.hashCode() == hashCode();
		}
		else
			return false;
	}
	
	public String toString() {
		char [] value = new char[] {getSuit(), getRank()};
		return new String(value);
	}
	
}