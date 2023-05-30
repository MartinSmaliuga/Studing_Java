
import java.util.Iterator;

class DataStructure {
		private int size;
		private Integer[] arrOfInts;
		
		DataStructure () {
			this(8);
			
		}
		
		DataStructure (int size) {
			this.size = size;
			arrOfInts = new Integer[size];
			
			int i = 0;
			
			while (i<size)
				arrOfInts[i] = i++;
			
		}
		
		public void showArr () {
			for (int i : arrOfInts) {
				System.out.println("arrOfInts[" + i + "] = " + i);
				
			}
			
			System.out.println();
			
		}
		
		public void showOdd () {
			Iterator<Integer> iterator = new Iterator<Integer>() { // using an anonimous class
				int index = 0;
				
				public boolean hasNext() {
					return index<size;
					
				}
				
				public Integer next() {
					Integer returnValue = arrOfInts[index];
					
					index+=2;
					
					return returnValue;
					
				}
				
			};
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			}
			
			System.out.println();
			
		}
	
	public static void main(String[] args) {
		DataStructure dt = new DataStructure(32);
		
		dt.showArr();
		dt.showOdd();
		
	}

}
