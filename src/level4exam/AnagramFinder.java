package level4exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AnagramFinder {
	public static void main(String[] args) {
		ArrayList<Character> letters = new ArrayList<Character>();
		String word = JOptionPane.showInputDialog("Enter word to find anagrams of it.");
		ArrayList<String> anagrams = anagram(word);
		for(int i = 0; i < anagrams.size(); i++) {
			System.out.println(anagrams.get(i));
		}
	}
	
	public static ArrayList<String> anagram(String word) {
		ArrayList<String> anagrams = new ArrayList<String>();
		
		int wordSize = word.length();
		char[] wordArray = word.toCharArray();
		
		try{
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader("wordlist.txt"));
			while((line = br.readLine()) != null) {
				char[] lineArray = line.toCharArray();
				
				
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
		return anagrams;
	}
} 
