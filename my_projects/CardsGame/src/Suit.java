
enum Suit {
	CLUB    ('C'/*'\u2663'*/, 0),
	DIAMOND ('D'/*'\u2666'*/, 1),
	HEART   ('H'/*'\u2665'*/, 2),
	SPADE   ('S'/*'\u2660'*/, 3);
	
	private final char suitChar;
	private final int value;
	
	Suit (char suitChar, int value) {
		this.suitChar = suitChar;
		this.value = value;
	}
	
	public char getChar() {
		return suitChar;
	}
	
	public int getValue() {
		return value;
	}
}
