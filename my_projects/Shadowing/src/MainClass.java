
public class MainClass {

	int x = 0;
	
	class InnerClass {
		int x = 1;
		
		void showShadowing (int x) {
			System.out.println("x: " + x);
			System.out.println("this.x: " + this.x);
			System.out.println("MainClass.this.x: " + MainClass.this.x);
			// System.out.println("MainClass.x: " + MainClass.x); - выёбуецца...
			
		}
		
	}
	
	public static void main(String[] args) {
		MainClass main = new MainClass();
		InnerClass innerClass = main.new InnerClass();
		innerClass.showShadowing(2);

	}

}
