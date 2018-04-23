/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Apr 2018
 * This program uses recursion to reverse a string
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStr {
	
	private String sentence = "";
	private String reverse = "";
	
	ReverseStr() {
		//Default constructor
		
		//get the string to reverse
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		
		System.out.println("Enter a sentence:");
		try {
			//Get user input
			sentence = reader.readLine();
		} catch (IOException noInput) {
			noInput.printStackTrace();
		}
		
		reverseSentence(sentence);
	}
	
	public void reverseSentence(String unprocessed) {
		//Reverse the sentence
		String subString;
		Character lastChar;
		
		if(unprocessed.length() > 0) {
			subString = unprocessed.substring(0, unprocessed.length() - 1);
			lastChar = unprocessed.charAt(unprocessed.length() - 1);
			reverse += lastChar;
			
			System.out.println(subString + " -> " + reverse);
			
			reverseSentence(subString);
		}
	}
	
	public String getSentence() { return sentence; } //Getter
	
	public String getReverse() { return reverse; } //Getter
	
	public static void main(String[] args) {
		//Instantiate a ReverseStr object
		ReverseStr reverser = new ReverseStr();
		
		System.out.println("Original: " + reverser.getSentence());
		System.out.println("Reversed: " + reverser.getReverse());
	}
}