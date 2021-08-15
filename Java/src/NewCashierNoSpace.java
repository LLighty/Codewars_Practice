/**
 * Created by Liam on 15/08/2021.
 *
 Some new cashiers started to work at your restaurant.

 They are good at taking orders, but they don't know how to capitalize words, or use a space bar!

 All the orders they create look something like this:

 "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"

 The kitchen staff are threatening to quit, because of how difficult it is to read the orders.

 Their preference is to get the orders as a nice clean string with spaces and capitals like so:

 "Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke"

 The kitchen staff expect the items to be in the same order as they appear in the menu.

 The menu items are fairly simple, there is no overlap in the names of the items:

 1. Burger
 2. Fries
 3. Chicken
 4. Pizza
 5. Sandwich
 6. Onionrings
 7. Milkshake
 8. Coke
 */
public class NewCashierNoSpace {
    static String[] items = {
            "burger",
            "fries",
            "chicken",
            "pizza",
            "sandwich",
            "onionrings",
            "milkshake",
            "coke"
    };

    static String[] addItems = {
            "Burger ",
            "Fries ",
            "Chicken ",
            "Pizza ",
            "Sandwich ",
            "Onionrings ",
            "Milkshake ",
            "Coke "
    };

    public static String getOrder(String input) {
        int[] itemQuantity = new int[8];
        int index = 0;

        StringBuilder  sb = new StringBuilder ();

        while(index < input.length()){
            int itemIndex = -1;
            if(input.charAt(index) == 'c'){
                if(input.charAt(index+1) == 'o'){
                    itemIndex = 7;
                } else {
                    itemIndex = 2;
                }
            } else{
                itemIndex = getIndex(input.charAt(index));
            }
            itemQuantity[itemIndex]++;
            index += items[itemIndex].length();
        }

        for(int i = 0; i < itemQuantity.length; i++){
            for(int j = itemQuantity[i]; j > 0; j--){
                sb.append(addItems[i]);
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static int getIndex(char firstLetter){
        for(int i = 0; i < items.length; i++){
            if(items[i].charAt(0) == firstLetter){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
    }
}
