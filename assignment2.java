import java.util.Scanner;
import java.util.Random;

public class assignment2 {
    public static void main (String args[]){
        int input;
        int b = 1;
        Scanner sage = new Scanner(System.in);
        Random rnd = new Random();
    System.out.println("Welcome to Rock Paper Scissors!");
    System.out.println("Select 1, 2, 3, for Rock, Paper, Scissors");
    

        while (b != 0){
        int rock = 1, paper = 2, scissors = 3;
        input = sage.nextInt();
        int randomNumber = rnd.nextInt(3-1+1)+1;

            if(randomNumber == rock){
                if(input == rock){
                    System.out.println("Rock vs. Rock, Tie!");
            }    else if(input == paper){
                    System.out.println("Rock vs. Paper! You win!" );
            }    else if(input == scissors){
                    System.out.println("Rock vs. Scissors! You lose!");
            }  

            else if(randomNumber == paper){
                if(input == rock){
                    System.out.println("Paper vs. Rock! You lose!");
            }   else if(input == scissors){
                    System.out.println("Paper vs. Scissors! You win!");
            }   else if(input == paper){
                    System.out.println("Paper vs. Paper! Tie!");
            } 

            else if(randomNumber == scissors){
                if(input == rock){
                    System.out.println("Scissors vs. Rock! You win!");
            }   else if(input == scissors){
                    System.out.println("Scissors vs. Scissors, Tie!");
            }   else if(input == paper){
                    System.out.println("Scissors vs Paper! You lose!");
            } 

            }
            }
        }

    }
    }
}
// code tutorial from https://codereview.stackexchange.com/questions/133878/beginner-rock-paper-scissors-in-java