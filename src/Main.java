/*
* A game has a beginning
* a what to move forward
* goal
* obstacle, enemy or opponent
*
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        char[] board = {'H', '.', '.', 'Z', '.', '.', '.', '$'};// 8 positions
        char dungeon = '.';
        char knight = 'H';
        char enemy = 'Z';
        char princess = '$';
        int KnightPosition = 0;
        int enemyPosition = 3;
        int princessPosition = 7;
        Scanner in = new Scanner(System.in);
        // infinite loop-must break out when something happens like rescuing the princess
        System.out.println("SAVING THE KINGDOM, press ENTER/RETURN to push forward.");
        int turn = 1;
        while (true) {
            System.out.printf("Turn %d:\n", turn++);
            for (int i = 0; i < 8; i++) {
                if (i == KnightPosition) {
                    System.out.println(knight);
                } else if (i == enemyPosition) {
                    System.out.println(enemy);
                } else if (i == princessPosition) {
                    System.out.println(princess);
                } else {
                    System.out.println(dungeon);
                }
            }

            System.out.println("Enter to push forward.");
            String userInput = in.nextLine();
            KnightPosition++;
            if (KnightPosition == enemyPosition) {
                //remove enemy
                enemyPosition = -1;
                System.out.println("The knight has vanquished the enemy!");
            }
            if (KnightPosition == princessPosition) {
                ;
                princessPosition = -1; //remove princess
                System.out.println("The knight has rescued the princess!");
                break;//break out of infinite loop.

            }
        }
        System.out.println("VICTORY!!");
    }
    }

















