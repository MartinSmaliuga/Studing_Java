
public class DataStructure {

	private Integer size;
	private Integer[] arrOfInts;
	
	public DataStructure() {
		this(16);
		
	}
	
	public DataStructure(Integer size) {
		this.size = size;
		arrOfInts = new Integer[size];
		
		for (int i = 0; i < size; i++) {
			arrOfInts[i] = i;
			
		}
		
	}
	
	public void printEven () {
		CustomeIterator iterator = new CustomeIterator( 0, 2);
		
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println();
		
	}
	
	public void printOdd () {
		CustomeIterator iterator = new CustomeIterator( 1, 2);
		
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println();
		
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer> {}
	
	private class CustomeIterator implements DataStructureIterator {
		private int currentIndex;
		private int step;
		
		public CustomeIterator () {
			this(0, 1);
			
		}
		
		public CustomeIterator (int startIndex) {
			this(startIndex, 1);
			
		}
		
		public CustomeIterator (int startIndex, int step) {
			currentIndex = startIndex;
			this.step = step;
			
		}
		
		public boolean hasNext() {
			return currentIndex<size;
			
		}
		
		public Integer next() {
			Integer retValue = arrOfInts[currentIndex];
			
			currentIndex += step;
			return retValue;
			
		}
		
	}
	
	public static void main(String[] args) {
		DataStructure ds = new DataStructure(28);
		
		ds.printEven();
		ds.printOdd();

	}

}
