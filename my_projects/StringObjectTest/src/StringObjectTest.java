
public class StringObjectTest {

	public static void main(String[] args) {
		String[] students = new String[10];
		String studentName = "Someone";
		students[0] = studentName;
		studentName = null;
		System.out.println(students[0]);

	}

}
