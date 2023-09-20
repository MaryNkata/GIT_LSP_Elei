package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.net.URL;

public class WordCounter {
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader();
		String str = file.readToString("main/java/resources/words.txt");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		String[] words = str.toLowerCase().strip().split(" |\n");
		for (String word: words) {
			if (isNumeric(word)) {
				continue;
			}
			if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            else {
                wordCount.put(word, 1);
            }
		}
	
		System.out.println(wordCount);
	}
	public static boolean isNumeric(String string) {
	    
	    try {
	        int intValue = Integer.parseInt(string);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
}
