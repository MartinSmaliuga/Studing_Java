
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zegar {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please write 4 numbers:");
			String input = sc.nextLine();
			sc.close();
			List<Integer> numbers = parseInput(input);
			
			numbers.sort((a,b) -> a.compareTo(b));
			
			System.out.println(searchMaxTime(numbers));
			
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		}

	}
	
	private static List<Integer> parseInput(String input) throws Exception {
		
		List<Integer> arr = new ArrayList<>();
		
		if (input.matches("[^0-9]"))
			throw new Exception("Error: characters that are not digits were detected!");
		
		if (input.length() < 4)
			throw new Exception("Error: not enough numbers were found!");
		
		if (input.length() > 4)
			throw new Exception("Error: too many numbers were found!");
	
		for (int i = 0; i < 4; i++)
			arr.add(Character.getNumericValue(input.charAt(i)));
			
		return arr;
		
	}
	
	private static String searchMaxTime (List<Integer> numbers){
		String maxTime;
		
		maxTime = searchForValidDigit(numbers, 2);
		
		if (maxTime.isEmpty())
			maxTime = "It is not posible to compose a valid time from the entered characters!";
		else
			maxTime = "The latest time able to compose from entered digits is: " + maxTime.substring(0, 2) + ":" + maxTime.substring(2);
		
		return maxTime;
		
	}
	
	private static String searchForValidDigit (List<Integer> numbers, int upperLimit) {
		if (numbers.size() == 1)
				return numbers.get(0).toString();
		else {
			Integer validDigit = upperLimit;
			
			while (validDigit!=-1) {
				if (numbers.contains(validDigit)) {
					int nextUpperLimit;
					
					switch(upperLimit) {
						case 2:
							nextUpperLimit = validDigit == 2 ? 3 : 9;
							break;
						case 5:
							nextUpperLimit = 9;
							break;
						default:
							nextUpperLimit = 5;
							break;
					
					}
					numbers.remove(validDigit);
					numbers.add(0, validDigit);
					
					String output = searchForValidDigit(numbers.subList(1, numbers.size()), nextUpperLimit);
					
					if (!output.isEmpty())
						return validDigit.toString()+output;
					
				}
				
				validDigit--;
				
			}
			
			return "";
			
		}
		
	}
	
}
