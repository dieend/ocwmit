package lab1;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

class Scrambler {

    static String reverse(String input) {
        // YOUR CODE HERE
    	CharacterIterator it = new StringCharacterIterator(input);
    	String kata = "";
    	for(char ch = it.first(); ch!=CharacterIterator.DONE; ch = it.next()){
    		kata = String.valueOf(ch) + kata;
    	}
        return kata;
    }    
    
	static String reverseWords(String input) {
        // YOUR CODE HERE
		String[] kamus;
		String kata = "";
		kamus = input.split(" ");
		for (int i = 0; i<kamus.length; i++) {
			kata = kamus[i] +" "+kata;
		}
		
		return kata;
	}

    static boolean isWordPalindrome(String input) {
        boolean isPal = true;
        String[] kamus = input.split(" ");
        for(int i = 0; i<kamus.length; i++){
        	if (!kamus[i].equals(kamus[kamus.length-i-1])) {
        		isPal = false;
        		break;
        	}
        }
        return isPal;
    }
    
	public static void main(String args[]) {
        String input, output;
        
        // reverse
        input = "Three blind mice";
        output = reverse(input);
        System.out.println("Should be: ecim dnilb eerhT");
        System.out.println("Actual is: " + output);

        input = "level madam level";
        output = reverse(input);
        System.out.println("\nShould be: level madam level");
        System.out.println("Actual is: " + output);
        
        // reverseWords
		input = "To be or not to be, that is the question.";
		output = reverseWords(input);
        System.out.println("\nShould be: question. the is that be, to not or be To");
        System.out.println("Actual is: " + output);

		input = "Stressed spelled backwards is Desserts";
		output = reverseWords(input);
        System.out.println("\nShould be: Desserts is backwards spelled Stressed");
        System.out.println("Actual is: " + output);

        // isWordPalindrome
        input = "forever eating cheese";
        boolean boolOutput = isWordPalindrome(input);
        System.out.println("\n" + input + (boolOutput ? " is " : " is not ") + "a word palindrome");

        input = "fall leaves when leaves fall";
        boolOutput = isWordPalindrome(input);
        System.out.println("\n" + input + (boolOutput ? " is " : " is not ") + "a word palindrome");
        
        input = null;
        boolOutput = isWordPalindrome(input);
        System.out.println("\n" + input + (boolOutput ? " is " : " is not ") + "a word palindrome");
        
    }

}
