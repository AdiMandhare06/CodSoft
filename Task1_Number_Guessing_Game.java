package Java;
import java.util.*;

public class Task1_Number_Guessing_Game{

    public static void Restart(){
        try (Scanner b = new Scanner(System.in)) {
            System.out.println("\n\nYou Want to play again press 1 and 0 for Exit");
                int Restart = b.nextInt();
                if (Restart == 1){
                    System.out.println("\nWelcome Again to the Number Guessing Game");
                    NumberGuessing();
                }
                else if (Restart == 0){
                    System.out.println("\nThank You For Playing\n");
                }
        }
    }

    public static void NumberGuessing(){
        try (Scanner user = new Scanner(System.in)) {
            int Num = (int)(100*Math.random());

            int attempts = 5;
            int i;
            System.out.println("\tGuess the Number between 1 to 100 ");

            for (i=0; i<attempts; i++){
                System.out.println("\nYou Have " + (attempts-i) + " Chances");
                System.out.println("Guess The Number");
                int Guess = user.nextInt();

                if (Num == Guess){
                    System.out.print("You Guessed the Correct Number");
                    System.out.println("Your Score is: " + (attempts-i));
                    Restart();
                    break;
                }
                else if(Num > (Guess+10)){
                    System.out.println("The Number You Guessed is too Short");
                }
                 else if(Num > Guess){
                    System.out.println("The Number You Guessed is Short but bit close");
                }
                else if(Num < (Guess-10)){
                    System.out.println("The Number You Guessed is too Big");
                }
                else if(Num < Guess){
                    System.out.println("The Number You Guessed is Big but bit close");
                } 
            }
            if(i == attempts){
                System.out.println("\nYou Exceeded the Number of chances");
                System.out.println("The Number was: " + Num);
                System.out.println("Your Score is: " + (attempts-i));
                Restart();
            }
        }
    }

    public static void main(String args[]){
        System.out.println("\nWelcome to the Number Guessing Game");
        NumberGuessing();
    }
        
}
