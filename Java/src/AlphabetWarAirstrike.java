/**
 * Created by Liam on 31/08/2021.
 */
public class AlphabetWarAirstrike {
    public static String alphabetWar(String fight){
        String afterFight = fight.replaceAll(".[*]+.|.[*]|[*].", "_");
        System.out.println(afterFight);
        int leftScore = 0;
        int rightScore = 0;

        for(int i = 0; i < afterFight.length(); i++){
            char checking = afterFight.charAt(i);
            switch(checking){
                case 'w':
                    leftScore += 4;
                    break;
                case 'p':
                    leftScore += 3;
                    break;
                case 'b':
                    leftScore += 2;
                    break;
                case 's':
                    leftScore += 1;
                    break;
                case 'm':
                    rightScore += 4;
                    break;
                case 'q':
                    rightScore += 3;
                    break;
                case 'd':
                    rightScore += 2;
                    break;
                case 'z':
                    rightScore += 1;
                    break;
                default:
                    continue;
            }
        }

        if(leftScore > rightScore){
            return "Left side wins!";
        }

        if(rightScore > leftScore){
            return "Right side wins!";
        }

        return "Let's fight again!";
    }

    public static void main(String[] args) {
        System.out.println(AlphabetWarAirstrike.alphabetWar("qvyvo*rd*dt**lryp*"));
    }
}
