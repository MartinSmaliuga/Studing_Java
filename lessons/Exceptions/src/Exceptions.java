
import java.util.Scanner;

class IncorrectNumberException extends Throwable {}

public class Exceptions {
	
	private static void printMonth (int month) throws IncorrectNumberException {
		
		if (month < 1 || month > 12)
			throw new IncorrectNumberException();
		
		String monthAsString = "";
		
		switch (month) {
			case 1:
				monthAsString = "January";
				break;
			case 2:
				monthAsString = "Febrary";
				break;
			case 3:
				monthAsString = "March";
				break;
			case 4:
				monthAsString = "April";
				break;
			case 5:
				monthAsString = "May";
				break;
			case 6:
				monthAsString = "June";
				break;
			case 7:
				monthAsString = "July";
				break;
			case 8:
				monthAsString = "August";
				break;
			case 9:
				monthAsString = "September";
				break;
			case 10:
				monthAsString = "October";
				break;
			case 11:
				monthAsString = "November";
				break;
			case 12:
				monthAsString = "December";
				break;
		}
		
		System.out.println("The " + month + " month is: " + monthAsString);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		sc.close();
		
		try {
			printMonth(month);
		}
		catch(IncorrectNumberException ex) {
			System.out.println("Please, write number bigger then 0 and less then 13");
		}

	}

}
