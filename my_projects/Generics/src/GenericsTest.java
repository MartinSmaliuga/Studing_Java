import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {
	
	public abstract class Media {
		
		private String randInfo;
		
		Media () {
			this("Some useless info");
		}
		
		Media(String randInfo) {
			this.randInfo = randInfo;
		}
		
		public String get() {
			return randInfo;
		}
		
		public void set(String newInfo) {
			randInfo = newInfo;
		}
		
	}
	
	public class Newspaper extends Media {
		Newspaper() {
			super("Newspaper: some useless info");
		}
	}
	
	public class Book extends Media {
		Book() {
			super("Book: some useless info");
		}
	}
	
	public class Video extends Media {
		Video() {
			super("Video: some useless info");
		}
	}
	
	public class Library <T extends Media> {
		private List<T> library;
		
		Library() {
			this.library = new ArrayList<T>();
		}
		
		Library(List<T> library) {
			this.library = library;
		}
		
		public void add(T t) {
			library.add(t);
		}
		
		public T getByIndex(int i) {
			if (i < library.size())
				return null;
			else
				return library.get(i);
		}
		
		public void showLibrary() {
			for (T t : library) {
				System.out.println(t.get());
			}
		}
		
	}

	public static void main(String[] args) {
		GenericsTest t = new GenericsTest();
		Library<Media> lib = t.new Library(Arrays.asList(t.new Newspaper(), t.new Book(), t.new Video()));
		
		lib.showLibrary();

	}

}
