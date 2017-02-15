import java.util.*;
import java.io.*;

public class Vocab {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner c = new Scanner(System.in);
		Random r = new Random();
		File f = new File("C:/Users/Gabe/workspace/Vocab/src/Words List");
		Scanner fileScanner = new Scanner(f);
		Scanner fileScanner2 = new Scanner(f);
		int count = 0;
		int wordCount = 0;
		while(fileScanner.hasNext()) {
			count++;
			if(count % 2 == 0) {
				wordCount++;
			} 
			String x = fileScanner.next();
		}
		
		String[] wordList = new String[wordCount];
		String[] defList = new String[wordCount];
		for(int i = 0; i < wordList.length; i++) {
			wordList[i] = fileScanner2.next();
			defList[i] = fileScanner2.next();
		}
		
		int score = 0;
		int total = 0;
		
		System.out.print("Enter anything to start or -1 to exit: ");
		String next = c.nextLine();
		Scanner console = new Scanner(System.in);
		
		if (!next.equals("-1")) {
			System.out.println("Please write the definition that corresponds to the word you see.");
			System.out.print("How many times would you like to practice? ");
			int practice = console.nextInt();
			for (int i = 0; i < practice; i++){
				int x = r.nextInt(wordList.length);
				String w = wordList[x];
				String d = defList[x];
				System.out.print(w + ": ");
				String currentGuess = c.nextLine().toLowerCase();
				
				if (currentGuess.equals(d.toLowerCase())) {
					score++;
				}
				
				total++;
			}
			
			System.out.print("You got " + score + "/" + total + " words correct");
		}

	}
}
