/**
 * Created by Liam on 9/08/2021.
 *
 * Simple Encryption #1 - Alternating Split
 * Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.

 Examples:

 encrypt("012345", 1)  =>  "135024"
 encrypt("012345", 2)  =>  "135024"  ->  "304152"
 encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

 encrypt("01234", 1)  =>  "13024"
 encrypt("01234", 2)  =>  "13024"  ->  "32104"
 encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"

 Together with the encryption function, you should also implement a decryption function which reverses the process.

 If the string S is an empty value or the integer N is not positive, return the first argument without changes.
 */

public class Simple_Encrypt_1 {
    public static String encrypt(final String text, final int n) {
        // Your code here
        if(text == null){
            return null;
        }
        String encrypted = text;

        for(int i = 0; i < n; i++){
            String start = "";
            String end = "";
            for(int j = 1; j <= encrypted.length(); j++){
                if(j % 2 == 0){
                    start += encrypted.charAt(j-1);
                } else{
                    end += encrypted.charAt(j-1);
                }
            }
            encrypted = start + end;
        }

        return encrypted;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        if(encryptedText == null){
            return null;
        }
        String decrypted = encryptedText;

        for(int i = 0; i < n; i++){
            char[] decrypt = new char[decrypted.length()];
            int currentIndex = 0;
            for(int j = (decrypted.length() / 2); j < decrypted.length(); j++){
                decrypt[currentIndex] = decrypted.charAt(j);
                currentIndex += 2;
            }
            currentIndex = 1;
            for(int j = 0; j < (decrypted.length() / 2); j++){
                decrypt[currentIndex] = decrypted.charAt(j);
                currentIndex += 2;
            }
            decrypted = String.valueOf(decrypt);
        }

        return decrypted;
    }

}
