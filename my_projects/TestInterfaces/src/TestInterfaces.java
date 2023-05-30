
import java.lang.CharSequence;

public class TestInterfaces implements CharSequence {
	char[] cs;
	
	TestInterfaces () {
		cs = new char[16];
		
	}
	
	TestInterfaces (char[] cs) {
		this.cs = cs;
		
	}
	
	public int length() {
		return cs.length;
	}

	public char charAt(int index) {
		return cs[index];
	}

	public CharSequence subSequence(int start, int end) {
		TestInterfaces rtrn;
		int length = end - start;
		
		if (length > 0) {
			rtrn = new TestInterfaces(new char[length]); 
			for (int i = 0; i<length; i++)
				rtrn.cs[i] = cs[start+i];
			
		}
		else
			rtrn = new TestInterfaces();
		
		return rtrn;
	}

	public static void main(String[] args) {
		

	}

}
