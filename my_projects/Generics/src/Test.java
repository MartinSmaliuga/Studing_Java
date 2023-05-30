import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
	
	//public void testBox (Box</*T extends Number - leads to error*/ Number> box) {
		/*but this method can't be used with Integer, Double and so on*/
	//}
	
	/*Wildcard '?' can be used instead to make it able to work with any subtype of Number*/
	
	public void testBox (Box<? extends Number> box) {
		box.get();
	}
	
	public static <T> int countElementsHavingProperty (Collection<T> col, UnaryPredicate<T> tester) {
		int count = 0;
			for (T elem : col) {
				if (tester.test(elem))
					count++;
			}
		return count;
	}
	
	public static <T> T[] exchangeElements (T[] arr, int fInd, int sInd) {
		if (fInd < sInd && sInd < arr.length) {
			T buffer = arr[fInd];
			arr[fInd] = arr[sInd];
			arr[sInd] = buffer;
			
		}
		
		return arr;
	}
	
	public static <T extends Comparable<T>> T maxInRange (List<? extends T> list, int begin, int end) {
		T maxElem = list.get(begin);
		
		while (begin < end) {
			if (maxElem.compareTo(list.get(begin)) < 0)
				maxElem = list.get(begin);
			
			begin++;	
		}
			
		return maxElem;
	}
	
	public static void main(String[] args) {
		List<Integer> li= Arrays.asList(1,5,4,6,7,2,3);
		li.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println(countElementsHavingProperty(li, (a) -> a%2==0));
		System.out.println(maxInRange(li, 0, li.size()));
	}

}
