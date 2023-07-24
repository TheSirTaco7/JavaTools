import java.util.*;
import java.io.*;

class DiceSim {

    public static void main(String args[]) {

        boolean exit = false;
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!exit) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n============Dice Simulator============\n");
            System.out.println("");
            System.out.println("What dice would you like to roll?\n");
            System.out.println("Enter 'd20', 'd12', 'd10', 'percentile', 'd8', 'd6', 'd4', or 'exit'\n");

            try {
                input = br.readLine().trim();
            } catch (IOException ioe) {
                // Do Nothing
            }

            if (input.equals("exit")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Bye");
                exit = true;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            } else if (input.equals("d20")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollD20(); // Call the method to roll the d20 dice
            } else {
                System.out.println("Enter 'd20', 'd12', 'd10', 'percentile', 'd8', 'd6', 'd4', or 'exit'\n");
            }
        }
    }

    public static void rollD20() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(20) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll this dice again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD20(); // Call the method recursively to roll the dice again
        }
    }
}
