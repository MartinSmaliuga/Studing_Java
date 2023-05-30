
enum Rank {
	TWO ('2', 0),
	THREE ('3', 1),
	FOUR ('4', 2),
	FIVE ('V', 3),
	SIX ('6', 4),
	SEVEN ('7', 5),
	EIGHT ('8', 6),
	NINE ('9', 7),
	TEN ('X', 8),
	JACK ('J', 9),
	QUEEN ('Q', 10),
	KING ('K', 11),
	ACE ('A', 12);

	private final char rankChar;
	private final int value;

	Rank (char rankChar, int value) {
		this.rankChar = rankChar;
		this.value = value;
	}

	public char getChar() {
		return rankChar;
	}
	
	public int getValue() {
		return value;
	}
}
