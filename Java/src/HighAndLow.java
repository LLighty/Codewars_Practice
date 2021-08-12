/**
 * Created by Liam on 12/08/2021.
 *
 In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

 Example:

 highAndLow("1 2 3 4 5")  // return "5 1"
 highAndLow("1 2 -3 4 5") // return "5 -3"
 highAndLow("1 9 3 4 -5") // return "9 -5"

 Notes:

 All numbers are valid Int32, no need to validate them.
 There will always be at least one number in the input string.
 Output string must be two numbers separated by a single space, and highest number is first.

 */
public class HighAndLow {
    public static String highAndLow(String numbers) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String nums[] = numbers.split(" ");

        for(int i = 0; i < nums.length; i++){
            int number = Integer.parseInt(nums[i]);
            if(number > highest){
                highest = number;
            }
            if(number < lowest){
                lowest = number;
            }
        }

        return highest + " " + lowest;
    }
}
