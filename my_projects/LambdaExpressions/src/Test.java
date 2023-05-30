import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
	
	interface CheckPerson { // used by option #3 and #4
		public boolean check (Person p);
		
	}
	
	class AgeChecker implements CheckPerson { //used by option #3
		public boolean check (Person p) {
			return p.getAge() >= 18 && p.getAge() <= 27;
			
		}
		
	}
	
	public static void printPersonsOlderThan(ArrayList<Person> pList, int age) { // #1 option
		for (Person p : pList)
			if (p.getAge() >= age)
				p.printPerson();
		
	}
	
	public static void printPersonsWithinAgeRange(ArrayList<Person> pList, int minAge, int maxAge) { // #2 option
		for (Person p : pList)
			if (p.getAge() >= minAge && p.getAge() <= maxAge)
				p.printPerson();
		
	}
	
	public static void printPersonsAccordingCriteria(ArrayList<Person> pList, CheckPerson check) { // #3, #4 and #5 option
		for (Person p : pList)
			if (check.check(p))
				p.printPerson();
		
	}
	
	public static void printPersonsUsingPredicate(ArrayList<Person> pList, Predicate<Person> checker) { // #6 option
		for (Person p : pList)
			if (checker.test(p))
				p.printPerson();
		
	}
	
	public static void printPersonsUsingPredicate(ArrayList<Person> pList, Predicate<Person> checker, Consumer<Person> executor) { // #7 option: more built in functions for god of built in functions!!!
		for (Person p : pList)
			if (checker.test(p))
				executor.accept(p);
		
	}
	
	public static void printPersonsUsingPredicate(ArrayList<Person> pList, Predicate<Person> checker, Consumer<Person> executor, Function<Person, Integer> returner) { // #7 option: more built in functions for god of built in functions!!!
		for (Person p : pList)
			if (checker.test(p)) {
				System.out.println("Age: " + returner.apply(p));
				executor.accept(p);
				
			}	
		
	}
	
	public static <X, Y> void processElements(Iterable<X> collection, // #8 option: only interfaces and generics!
									   Predicate<X> tester,
									   Consumer<X> executor,
									   Function<X, Y> returner) {
		for (X p : collection)
			if (tester.test(p)) {
				System.out.println("Age: " + returner.apply(p));
				executor.accept(p);
				
			}	
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		ArrayList<Person> pList = new ArrayList<Person>();
		
		for (int i = 0; i < 8; i++)
			pList.add(new Person());
		
		printPersonsOlderThan(pList, 18); // use of #1 option
		
		printPersonsWithinAgeRange(pList, 18, 27); // use of #2 option
		
		printPersonsAccordingCriteria(pList, test.new AgeChecker()); // use of #3 option
		
		printPersonsAccordingCriteria(pList,
				new CheckPerson() { // #4 option: using method of option #3 with anonymous class
					public boolean check (Person p) {
						return p.getAge() >= 18 && p.getAge() <= 27;
				
					}
			
				});
		
		printPersonsAccordingCriteria(pList, // #5 option: using method of option #3 with lambda expression
				(Person p) -> p.getAge() >= 18 && p.getAge() <= 27);
		
		printPersonsUsingPredicate(pList, // #6 option: reduce the amount of code by using built in Java functions 
				(Person p) -> p.getAge() >= 18 && p.getAge() <= 27);
		
		printPersonsUsingPredicate(pList, // #7 option
				(Person p) -> p.getAge() >= 18 && p.getAge()<=27,
				(Person p) -> p.printPerson());
		
		printPersonsUsingPredicate(pList, // #7 option
				(Person p) -> p.getAge() >= 18 && p.getAge()<=27,
				(Person p) -> p.printPerson(),
				(Person p) -> p.getAge());
		
		processElements(pList, // #8 option
				(Person p) -> p.getAge() >= 18 && p.getAge() <= 27,
				(Person p) -> p.printPerson(),
				(Person p) -> p.getAge());
		
		pList.stream()
			.filter(p -> p.getAge() >= 18 && p.getAge() <= 27)
			.forEach(p -> {
				System.out.println("Age: " + p.getAge());
				p.printPerson();
			});
		
	}

}