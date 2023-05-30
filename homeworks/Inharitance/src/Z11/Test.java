package Z11;

public class Test {

	public static void main(String[] args) {
		Person[] personsArr = new Person[10];
		
		for (Person p: personsArr) {
			if (Math.random()<0.5)
				p = new Student();
			else
				p = new Footballer();
			
			p.printPerson();
			System.out.println();
		}

	}

}
