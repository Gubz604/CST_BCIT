/**
 * 
 */
package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class parses a text file and reads the file, compiles the use of all unique words and counts their frequencies in the document.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class WordCounter {
	
	private ArrayList<Word> list;
	
	public WordCounter() {
		this.list = new ArrayList<>();
	}
	
	public int parseBook(String fileName) throws FileNotFoundException {
		Scanner fileScan = new Scanner(new File(fileName));
		
		while (fileScan.hasNext()) {
			String w = fileScan.next().toLowerCase().replaceAll("[^a-z]", "");
			if (w.isEmpty()) continue;
			
			Word temp = new Word(w);
			int index = list.indexOf(temp);
			
			if (index != -1) {
				list.get(index).incrementFreq();
			} else {
				list.add(temp);
			}
			
		}
		
		fileScan.close();
		return list.size();
	}
	
	public void printTopWords(int n) {
		list.sort(null);
		
		System.out.println("The " + n + " most frequent words are:\n");
		for (int i = 0; i < n; i++) {
			Word word = list.get(i);
			System.out.println(word);
		}
	}
	
	/**
	 * Drives the prorgam.
	 * 
	 * @param args unused
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		WordCounter wc = new WordCounter();
		
		wc.parseBook("bible.txt");
		wc.printTopWords(10);
	}

}
