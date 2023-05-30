
public class WorkFlowControlStatementTest {

	public static void main(String[] args) {
		int n = 3;
		/*
		code base:
		
		if (aNumber >= 0)
    		if (aNumber == 0)
        		System.out.println("first string");
		else 
    		System.out.println("second string");
		System.out.println("third string"); 
		*/
		if(n >= 0) {
			if(n==0) {
				System.out.println("n == 0");
			}
			else {
				System.out.println("n > 0");
			}
		}
		System.out.println("Outside of if");
		
	}

}
