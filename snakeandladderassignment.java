import java.util.Random;
import java.util.Scanner;

public class snakeandladderassignment {
    public static void main(String[] args) {
        int player = 0; int comp = 0;
        int currentplay = 0;
        int diceval = 0;

        Scanner s = new Scanner(System.in);
        String ply;
        System.out.println(currentplay == 0? "First player turn:" \n  "comp turn:");
        System.out.println("Roll dice");
        ply = s.next();


        if (currentplay == 0){
            player = player + diceval;
            if (player < 100){
                System.out.println("First player:" +player);
                System.out.println("comp:" +comp);
                if (player == 100){
                    System.out.println("First player win");
                    return;
                }
            }
        }
        else {
            comp = player + diceval;
            if (comp < 100){
                System.out.println("First player:" +player);
                System.out.println("com:" +comp);
                if(comp == 100){
                    System.out.println("comp win");
                    return;
                }
            }
        }
    }
}
class Dice {
    public int Dice() {
        int min = 1;
        int max = 7;

        Random r = new Random();
        int Dice = r.nextInt(max);
        if (Dice == 0) {
            System.out.println("Invalid, please try again");
        } else {
            System.out.println(Dice);
        }
        return Dice;
    }
}
