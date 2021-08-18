/**
 * Created by Liam on 18/08/2021.
 *
 *
 Mothers arranged a dance party for the children in school. At that party, there are only mothers and their children. All are having great fun on the dance floor when suddenly all the lights went out. It's a dark night and no one can see each other. But you were flying nearby and you can see in the dark and have ability to teleport people anywhere you want.
 Legend:
 -Uppercase letters stands for mothers, lowercase stand for their children, i.e. "A" mother's children are "aaaa".
 -Function input: String contains only letters, uppercase letters are unique.
 Task:
 Place all people in alphabetical order where Mothers are followed by their children, i.e. "aAbaBb" => "AaaBbb".
 */
public class WhereIsMyParent {
    static String findChildren(final String text) {
        if(text.length() == 0){
            return "";
        }

        int[] motherChildren = new int[52];

        for(int i = 0; i < text.length(); i++){
            int character = (int) text.charAt(i);
            if(character > 90){
                character = character - 32;
                motherChildren[(((character-65) * 2))+1]++;
            } else{
                motherChildren[(((character-65) * 2))]++;
            }
            System.out.println();
        }

        StringBuilder sb = new StringBuilder();
        int currentCharacter = 65;
        int iterationCount = 0;
        for(int i = 0; i < motherChildren.length; i++){
            for(int j = 0; j < motherChildren[i]; j++){
                if(i % 2 == 0){
                    sb.append((char) currentCharacter);
                } else {
                    sb.append((char) (currentCharacter + 32));
                }
            }
            iterationCount++;
            if(iterationCount == 2){
                currentCharacter++;
                iterationCount = 0;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(findChildren("abBACD"));
    }
}
