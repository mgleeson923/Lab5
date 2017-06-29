import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Dice Rolling using a RNG
        Scanner scnr = new Scanner(System.in);
        String repeat;
        int rollNumber = 0;


        System.out.println("Time to Throw Some Dice!");
        System.out.print("How many sides should each die have?: ");
        int faces = scnr.nextInt();
        do {
            rollNumber = (rollNumber + 1);
            System.out.println("Roll " + rollNumber);
            System.out.println(rollDice(faces) + ", " + rollDice(faces));

            System.out.print("Would you like to roll the dice again? (Y/N): ");
            repeat = scnr.next();
        } while (repeat.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing! Good bye!");
    }

    //method performing the math with the inputted dice
    public static int rollDice(int sidesOfDice) {
        int random = (int) (Math.random() * sidesOfDice + 1);
        return random;

    }
}