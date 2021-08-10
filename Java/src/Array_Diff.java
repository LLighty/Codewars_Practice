import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Liam on 10/08/2021.
 * 
 *
 Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

 It should remove all values from list a, which are present in list b keeping their order.

 Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

 If a value is present in b, all of its occurrences must be removed from the other:

 Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

 */
public class Array_Diff {
    public static int[] arrayDiff(int[] a, int[] b) {

        HashSet<Integer> numbers = new HashSet<Integer>();
        List<Integer> answers = new ArrayList<Integer>();

        for(int i = 0; i < b.length; i++){
            numbers.add(b[i]);
        }

        for(int i = 0; i < a.length; i++){
            if(!numbers.contains(a[i])){
                answers.add(a[i]);
            }
        }

        int[] arr = answers.stream().mapToInt(i->i).toArray();

        return arr;
    }
}
