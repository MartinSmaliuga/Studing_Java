import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WszystkieZadania {

	@SuppressWarnings("finally")
	public static int[] liczZnakiSlowa(String nazwaPlikWe) throws IOException {
		int[] output = new int[3];
		
		FileReader inputStream = null;

        try {
            inputStream = new FileReader(nazwaPlikWe);

            int c;
            boolean newWord = true;
            while ((c = inputStream.read()) != -1) {
            	output[0]++;
            	if (Character.isWhitespace(c)) {
            		output[1]++;
            		if(newWord) {
            			newWord = false;
            			output[2]++;
            		}
            	}
            	else
            		newWord = true;
            }
        }
        
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            
            return output;
        }
    }
	
	public static void szukaj (String nazwaPlikWe, String nazwaPlikWy, String slowo) throws IOException {
		BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        slowo = slowo.toLowerCase();

        try {
            inputStream = new BufferedReader(new FileReader(nazwaPlikWe));
            outputStream = new PrintWriter(new FileWriter(nazwaPlikWy));

            String nextString;
            String buffer;
            int counter = 0;
            while ((nextString = inputStream.readLine()) != null) {
            	counter++;
            	buffer = nextString.toLowerCase();
            	if (buffer.contains(slowo)) {
            		nextString = counter + ": " + nextString;
            		System.out.println("Dodaje linie \"" + nextString + "\" do pliku: " + nazwaPlikWy);
            		outputStream.println(nextString);
            	}
            }
        } finally {
            if (inputStream != null)
                inputStream.close();

            if (outputStream != null)
                outputStream.close();
        }
	}
	
	public static void main(String[] args) throws IOException {
		
		File plikWe = new File("plikWe.txt");
		File plikWy = new File("plikWy.txt");
		
		if (!plikWe.exists() || !plikWy.exists()) {
			plikWe.createNewFile();
			plikWy.createNewFile();
			
			String[] data = new String[] {"Ala ma jutro egzamin z biologii.",
					  					  "Jan myje auto. Eh, jutro kolejny egzamin.",
					  					  "Nie lubię polityki."};
			
			PrintWriter writer = new PrintWriter(new FileWriter(plikWe.getName()));
			
			for (String str : data) {
				writer.println(str);
			}
			
			writer.close();
			
		}
		
		int[] output = liczZnakiSlowa(plikWe.getName());
		System.out.format("Ilosc znakow w pliku %s: %d%n", plikWe.getName(), output[0]);
		System.out.format("Ilosc bilych znakow w pliku %s: %d%n", plikWe.getName(), output[1]);
		System.out.format("Ilosc slow w pliku %s: %d%n", plikWe.getName(), output[2]);
		
		System.out.println();
		
		String slowo = "egzamin";
		System.out.println("Zaczynam szukac slowa \""+slowo+"\" w pliku: " + plikWe.getName());
		szukaj(plikWe.getName(), plikWy.getName(), slowo);
		System.out.println("Wyniki wyszukiwania sa wpisane do pliku: " + plikWy.getName());
		
	}

}
