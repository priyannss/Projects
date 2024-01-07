package Game;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int compNumber;
    public int inputNumber;
    public int numOfGuesses = 0;

    public Game() {
        System.out.println("Number lies between 0 to 100");
        Random random = new Random();
        this.compNumber = random.nextInt(100);
    }

    public void takeUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number : ");
        this.inputNumber = input.nextInt();
    }

    boolean isCorrectNumber(){
        if(inputNumber == compNumber){
            numOfGuesses++;
            System.out.println("\nYay, You guessed it right!");
            System.out.println("Correct number was : " + compNumber);
            System.out.println("Number of attempts taken : " + numOfGuesses);
            return true;
        }
        if (inputNumber < compNumber) {
            System.out.println("Too less..");
            numOfGuesses++;
        }
        if (inputNumber > compNumber) {
            System.out.println("Too high..");
            numOfGuesses++;
        }
        return false;
    }

}

public class guessTheNumber {
    public static void main(String[] args){
        Game g = new Game();

        boolean b;
        do {
            g.takeUserInput();
            b = g.isCorrectNumber();
        } while (!b);
    }
}
