/**
 * Created by Liam on 14/08/2021.
 *
 *
 *
 Longest Palindrome

 Find the length of the longest substring in the given string s that is the same in reverse.

 As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7.

 If the length of the input string is 0, the return value must be 0.
 Example:

 "a" -> 1
 "aab" -> 2
 "abcde" -> 1
 "zzbaabcd" -> 4
 "" -> 0

 */
public class Palindromes {

    public static int longestPalindrome(final String s) {
        int longestPalindrome = 0;

        for(int i = 0; i < s.length(); i++){
            //System.out.println(s.substring(0,1));
            for(int j = i+1; j <= s.length(); j++){
                StringBuilder substring = new StringBuilder(s.substring(i, j));
                if(substring.toString().equals(substring.reverse().toString())){
                    if(substring.length() > longestPalindrome) {
                        longestPalindrome = substring.length();
                    }
                }
            }
        }

        return longestPalindrome; //your code here
    }
}
