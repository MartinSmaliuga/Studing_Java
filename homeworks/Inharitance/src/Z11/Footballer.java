package Z11;

import java.time.LocalDate;

public class Footballer extends Person {
	String position;
	String club;
	int numberOfGoals;
	Footballer() {
		super();
		setDefault();
	}
	
	Footballer(String name, String surname, LocalDate birthday) {
		super(name, surname, birthday);
		setDefault();
	}
	
	Footballer(String name, String surname, LocalDate birthday, String position, String club, int numberOfGoals) {
		super(name, surname, birthday);
		this.position = position;
		this.club = club;
		this.numberOfGoals = numberOfGoals;
	}
	
	private void setDefault() {
		position = "unknown";
		club = "unknown";
		numberOfGoals = 0;
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println("Club: " + club +
						   "\nPosition: " + position +
						   "\nNumber of goals: " + numberOfGoals);
	}
	
	public void addGoal() {
		numberOfGoals++;
	}
	
}
