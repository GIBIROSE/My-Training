package training.java.strings;

public class PalindromeChecking {

	private String word;  
    private  String reversedStr=""; 
    
    public PalindromeChecking(String word)
    {
    	this.word=word;
    }
    
    
    public void reverse(){
        
    System.out.println("orginal string is :"+word);
    for(int i = word.length()-1; i >= 0; i--)
    {    
        reversedStr = reversedStr + word.charAt(i);    
    }    
	System.out.println("Reverse of the string is: "+reversedStr);
    }
	
    public void isPalindrome()
    {
    	if(word.equalsIgnoreCase(reversedStr)){
    		System.out.println("String is palindrome");
    		
    	}
    	else
    	{
    		System.out.println("String is not palindrome");
    	}
    }
	
	public static void main(String[] args) {
		
		PalindromeChecking pc=new PalindromeChecking("Java");
		pc.reverse();
		pc.isPalindrome();
		
		
		PalindromeChecking pc1=new PalindromeChecking("Malayalam");
		pc1.reverse();
		pc1.isPalindrome();
	}

}
