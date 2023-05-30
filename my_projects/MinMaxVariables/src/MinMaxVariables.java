
public class MinMaxVariables {
    public static void main(String args[]) {

        byte smallestByte = Byte.MIN_VALUE;
        byte largestByte = Byte.MAX_VALUE;
        short smallestShort = Short.MIN_VALUE;
        short largestShort = Short.MAX_VALUE;
        int smallestInteger = Integer.MIN_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long smallestLong = Long.MIN_VALUE;
        long largestLong = Long.MAX_VALUE;

        float smallestFloat = Float.MIN_VALUE;
        float largestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;
        double largestDouble = Double.MIN_VALUE;

        System.out.println("The smallest and the largest byte values: \n"
        				   + smallestByte + " " +
                           + largestByte + "\n");
        System.out.println("The smallest and the largest short values: \n"
        				   + smallestShort + " " +
        				   + largestShort + "\n");
        System.out.println("The smallest and the largest integer values: \n"
        				   + smallestInteger + " " +
        				   + largestInteger + "\n");
        System.out.println("The smallest and the largest long values: \n"
				   		   + smallestLong + " " +
				   		   + largestLong + "\n");
        System.out.println("The smallest and the largest float values: \n"
				   		   + smallestFloat + " " +
				   		   + largestFloat + "\n");
        System.out.println("The smallest and the largest double values: \n"
				   		   + smallestDouble + " " +
				   		   + largestDouble + "\n");
        
    }
}