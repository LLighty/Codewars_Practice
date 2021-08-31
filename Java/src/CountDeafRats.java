/**
 * Created by Liam on 31/08/2021.
 */
public class CountDeafRats {
    public static int countDeafRats(final String town) {
        String townTrimmed = town.replaceAll("\\s+","");
        int deafRats = 0;
        int findPIndex = townTrimmed.indexOf('P');
        for(int i = 0; i < townTrimmed.length(); i += 2){
            if(i == findPIndex){
                if(i == townTrimmed.length()-1){
                    break;
                }
                i++;
            }
            char currentChar = townTrimmed.charAt(i);
            if(i < findPIndex){
                if(currentChar == 'O'){
                    deafRats++;
                }
            } else{
                if(currentChar == '~'){
                    deafRats++;
                }
            }
        }
        return deafRats;
    }

    public static void main(String[] args) {
        System.out.println(countDeafRats("O~~OO~~OO~~OO~P~OO~~OO~~OO~~O"));
    }
}
