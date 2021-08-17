/**
 * Created by Liam on 17/08/2021.
 *
 *
 You will be given a number and you will need to return it as a string in Expanded Form. For example:

 Kata.expandedForm(12); # Should return "10 + 2"
 Kata.expandedForm(42); # Should return "40 + 2"
 Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

 NOTE: All numbers will be whole numbers greater than 0.
 */
public class NumberExpandedForm {
    public static String expandedForm(int num)
    {
        int numDigits = String.valueOf(num).length();

        String expanded = "";

        for(int i = 0; i < numDigits; i++){
            int digit = num % 10;
            if(digit != 0) {
                String addition = "";
                addition += String.valueOf(digit);
                for(int j = 0; j < i; j++){
                    addition += "0";
                }
                expanded = addition + expanded;
                if(i + 1 < numDigits){
                    expanded = " + " + expanded;
                }
            }
            num /= 10;
        }

        return expanded;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(70304));
    }
}
