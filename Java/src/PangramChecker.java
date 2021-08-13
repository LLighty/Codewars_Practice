/**
 * Created by Liam on 13/08/2021.
 *
 *
 A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

 Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class PangramChecker {

    public boolean check(String sentence){
        //code
        if(sentence.length() < 26){
            return false;
        }
        int[] occurences = new int[26];
        String lowercaseSentence = sentence.toLowerCase();
        for(int i = 0; i < lowercaseSentence.length(); i++){
            char currentLetter = lowercaseSentence.charAt(i);
            if((int) currentLetter <= 122 && (int) currentLetter >= 97){
                occurences[(int) currentLetter - 97]++;
            }
        }
        for(int i = 0; i < occurences.length; i++){
            System.out.println(occurences[i]);
            if(occurences[i] == 0){
                return false;
            }
        }
        return true;
    }
}
