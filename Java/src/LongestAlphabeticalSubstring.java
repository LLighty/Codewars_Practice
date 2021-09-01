/**
 * Created by Liam on 1/09/2021.
 *
 Find the longest substring in alphabetical order.

 Example: the longest alphabetical substring in "asdfaaaabbbbcttavvfffffdf" is "aaaabbbbctt".

 There are tests with strings up to 10 000 characters long so your code will need to be efficient.

 The input will only consist of lowercase characters and will be at least one letter long.

 If there are multiple solutions, return the one that appears first.
 */
public class LongestAlphabeticalSubstring {
    public static String longestAlpabeticalSubstring(String text) {
        // Your code here
        int currentLongestLength = 0;
        int currentLongestStart = 0;
        int currentLongestEnd = 0;

        int startIndex = 0;
        int currentLength = 1;
        for(int i = 0; i < text.length(); i++){
            if(i + 1 < text.length()){
                if((int) text.charAt(i) <= (int) text.charAt(i+1)){
                    currentLength++;
                } else{
                    if(currentLength > currentLongestLength){
                        currentLongestLength = currentLength;
                        currentLongestStart = startIndex;
                        currentLongestEnd = startIndex + currentLength;
                    }
                    startIndex = i+1;
                    currentLength = 1;
                }
            } else {
                if(currentLength > currentLongestLength){
                    currentLongestLength = currentLength;
                    currentLongestStart = startIndex;
                    currentLongestEnd = startIndex + currentLength;
                }
            }
        }
        return text.substring(currentLongestStart, currentLongestEnd);
    }

    public static void main(String[] args) {
        System.out.println(longestAlpabeticalSubstring("a"));
    }
}
