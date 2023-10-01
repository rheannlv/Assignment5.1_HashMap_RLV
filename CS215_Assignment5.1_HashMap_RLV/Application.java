import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Initialize dictionary object named words.
		Dictionary words = new Dictionary();
		
		//Testing loadDictionary.
		words.loadDictionary();
		
		//Testing five words using searchDictionary.
		System.out.println(words.searchDictionary("fandangle"));
		System.out.println(words.searchDictionary("cicisbeo"));
		System.out.println(words.searchDictionary("cordwainer"));
		System.out.println(words.searchDictionary("carl"));
		System.out.println(words.searchDictionary("sippet"));
		
		System.out.println();
		
		//Testing printDictionary.
		words.printDictionary();
		
	
	}//end main

}//end class
