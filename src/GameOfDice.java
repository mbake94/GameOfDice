/*        Create variables dice1, dice2, totalScore, score, bonus, skip
        Bonus = 25
        Skip = 0
        Score = dice1+dice2
        TotalScore = 0
        Ask the user if they would like to roll a pair of dice 1-6 (y/n)
        If player types "n"", stop the game
        If player type "y",

        Start a do while loop (BEGINNING OF DO LOOP)
          Roll 2 random numbers
          print the two number
          set totalScore equal score
          print the totalScore

          write an if statement (condition: dice1 = 1, AND dice2 =1)
                set score to bonus (bonus = 25)
          else if (condition: when dice1 = 1 OR  when dice2 = 1)
                set score to skip (skip = 0)
          else (condition: otherwise)
            set score to the sum of dice1 and dice2 (dice1 + dice2)
        Print the 2 numbers
        set totalScore to totalScore + score
        print the totalScore
        Ask user if they would like to play again (y/n)
            if (condition: the user types y, continue the game
                else: set answer to false (ending the loop)
   while the total score is les than or equal to 100, continue the loop. OR, when user enters "n" (END LOOP)

   When score becomes greater than or equal to 100, stop the game and thank user for playing
*/


import java.util.Random;
import java.util.Scanner;

public class GameOfDice {
    public static void main(String[] args) {
        Random roll = new Random();
        Scanner keybd = new Scanner(System.in);
        boolean answer = true;
        String again;
        int dice1 = 0;
        int dice2 = 0;
        int score = dice1 + dice2; // score is the roll
        int totalScore = 0; // currentScore is the current roll with the rules of the game in account. totalScore is the sum of the all currentScores
        int skip = 0; // Skip adds 0 points
        int bonus = 25; // Bonus adds 25 points

        System.out.println("Welcome! Let's play a game of dice!\n");

        do {
            System.out.printf("You rolled %d and %d\n", dice1 = 1 + roll.nextInt(6), dice2 = 1 + roll.nextInt(6));
            if (dice1 == 1 && dice2 == 1) {
                score = bonus;
            } else if (dice1 == 1 || dice2 == 1) {
                score = skip;
            } else
                score = dice1 + dice2;

            totalScore += score;
            System.out.printf("Your score is: %d\n", totalScore);
            System.out.print("Would you like to play again? (y/n): ");
            again = keybd.nextLine();
            System.out.println();

            if (again.equals("n")) {
                return;
            } else  {
                answer = false;
            }


        } while (totalScore < 100);


        if (totalScore >= 100) {
            System.out.println("You have score over 100! \nThank you for playing! ");
        } else if (answer != true)
            System.out.println("Thank you for playing. See you next time!");

    }

}





