/**
 * Created by Liam on 23/08/2021.
 *
 Complete the solution so that the function will break up camel casing, using a space between words.
 Example

 "camelCasing"  =>  "camel Casing"
 "identifier"   =>  "identifier"
 ""             =>  ""

 */
public class BreakcamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("[A-Z]", " $0");
    }
}
