
public class DataStructure {
     
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
     
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
     
    public void printEven() {
         
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void print(DataStructureIterator iterator) {
    	while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    	
    }
    
    public void print(java.util.function.Function<Integer, Boolean> iterator) {
    	for (Integer i = 0; i < SIZE; i++) {
    		if (iterator.apply(i))
    			System.out.print(arrayOfInts[i] + " ");
    		
    	}
    	
    	System.out.println();
    	
    }
    
    public static boolean isEvenIndex (Integer i) {
    	return i%2 == 0;
    	
    }
    
    public static boolean isOddIndex (Integer i) {
    	return i%2 == 1;
    	
    }
     
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
 
    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
     
    private class EvenIterator implements DataStructureIterator {
         
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
         
        public boolean hasNext() {
             
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
         
        public Integer next() {
             
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
             
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
     
    public static void main(String s[]) {
         
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.print(ds.new EvenIterator());
        
        ds.print(new DataStructureIterator() {
        	
        	private int nextIndex = 1;
        	
			@Override
			public boolean hasNext() {
				return nextIndex < SIZE;
			}

			@Override
			public Integer next() {
				Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);
				
				nextIndex += 2;
				
				return retValue;
			}
        	
        });
        
        ds.print(i -> i%2 == 0);
        ds.print(i -> i%2 == 1);
        
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
        
    }
}