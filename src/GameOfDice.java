//        Create variables dice1, dice2, totalScore, score, bonus, skip
//        Bonus = 25
//        Skip = 0
//        Score = dice1+dice2
//        TotalScore = totalScore + score
//        Ask the user if they would like to roll a pair of dice 1-6 (yes/no)
//        If player types no, stop the game
//        If player type yes, Roll 2 random numbers
//        Print the 2 numbers
//        Score = the sum of every roll
//        If dice1 or dice2 = 1, multiply the sum by skip and add it to the score
//        If dice1 & dice2 = 1, you get 25 points
//        Otherwise, add the sum of the dice to the score.
//        When score becomes greater than or equal to 100, stop the game

import java.util.Random;
import java.util.Scanner;

public class GameOfDice {
    public static void main(String[] args) {
        Random roll = new Random();
        Scanner keybd = new Scanner(System.in);
        String again;
        boolean answer = true;
        int dice1 = 0;
        int dice2 = 0;
        int score = dice1 + dice2; // score is the roll
        int totalScore = 0; // currentScore is the current roll with the rules of the game in account. totalScore is the sum of the all currentScores
        int skip = 0; // Skip adds 0 points
        int bonus = 25; // Bonus adds 25 points


        do {
            System.out.printf("Welcome! Let's play a game of dice!\nYou rolled %d and %d\n", dice1 = 1 + roll.nextInt(6), dice2 = 1 + roll.nextInt(6));
            if (dice1 == 1 && dice2 == 1) {
                score = bonus;
            } else if (dice1 == 1 || dice2 == 1) {
                score = skip;
            } else {
                score = dice1 + dice2;
            }
            totalScore += score;
            System.out.printf("Your score is: %d\n", totalScore);
            System.out.print("Would you like to play again? (y/n): ");
            again = keybd.nextLine();
            System.out.println();
        } while (totalScore <= 100);

        if (totalScore >=100) {
            System.out.println("You have score over 100! \nThank you for playing! ");
        } else {
            System.out.println("Thank you for playing. See you next time!");
        }



    }
}

