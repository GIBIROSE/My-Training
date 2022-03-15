package training.java.strings;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String line = "MyWorld";
	    int vowels = 0;
	    int consonants = 0;

	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i)
	    {
	      char ch = line.charAt(i);

	      
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	      {
	        vowels++;
	      }
	      else
	      {
	    	  consonants++;
	      }

	}
	    System.out.println("Count of vowels :"+vowels);
	    System.out.println("Count of Consonants :"+consonants);
	    

}}
