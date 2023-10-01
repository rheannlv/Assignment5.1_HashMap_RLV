import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/** 
 * 
 * @author RVera
 * Unsorted dictionary using hash map.
 */

public class Dictionary {
	/**
	 * Create hash map object called dictionary.
	 */
	private HashMap<Integer,String> dictionary; 
	
	/**
	 * Instantiate dictionary hash map.
	 */
	public Dictionary() {
		dictionary = new HashMap<Integer, String>();
	}//end constructor
	
	/**
	 * Loads dictionary using scanner to read text file.
	 * @throws FileNotFoundException
	 */
	public void loadDictionary() throws FileNotFoundException {
			Scanner sDic = new Scanner(new File("DictionaryWordValuePairs_tabD.txt"));
			
			while(sDic.hasNextLine()){
				String data[] = sDic.nextLine().split("\t");
				dictionary.put(data[0].hashCode(), data[1]);
		}
		sDic.close();	
	}//end loadFile
	
	/**
	 * Searches dictionary by entering key, followed by the hash code
	 * and definition.
	 * @param key, word being searched to be defined.
	 * @return gets definition key.
	 */
	public String searchDictionary(String key){
		
		System.out.print(key + ":" + " (" + hashCode() + ") ");
		
		return dictionary.get(key.hashCode());	
	}//end search
	
	/**
	 * Prints dictionary values, hash code and definition.
	 */
	public void printDictionary(){

		for(Map.Entry<Integer, String> entry : dictionary.entrySet()) {
			System.out.println( entry.getKey() + " => " + ": " + entry.getValue() );
		}
	}//end print
	
	
}//end class
