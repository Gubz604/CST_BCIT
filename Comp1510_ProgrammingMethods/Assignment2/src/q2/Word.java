/**
 * 
 */
package q2;

import java.util.Objects;

/**
 * This class creates a Word object that has the name of the word as well as its frequency.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Word implements Comparable<Word>{
	
	private final String word;
	private int frequency;
	
	public Word(String word) {
		this.word = word;
		frequency = 1;
	}
	
	public String getWord() {
		return word;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public void incrementFreq() {
		frequency++;
	}
	
	public String toString() {
		return word + " " + frequency + " times";
	}

	@Override
	public int compareTo(Word o) {
		return o.getFrequency() - this.frequency;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
	    
	    Word other = (Word) obj;
	    
	    return Objects.equals(word, other.word);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(word);
	}
}
