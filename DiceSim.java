import java.util.*;
import java.io.*;
import java.util.Scanner;

class DiceSim {

    public static void main(String args[]) {

        boolean exit = false;
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!exit) {            

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n============Dice Simulator============\n");
            System.out.println("");
            System.out.println("What dice would you like to roll?\n");
            System.out.println("Enter 'd20', 'd12', 'd10', 'percentile', 'd8', 'd6', 'd4', or 'exit'\n");

            try {

                input = br.readLine().trim();

            } catch (IOException ioe) {
                // Do Nothing
            }

            if (input.equals("exit")) {
                exit = true;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            } else if (input.equals("d20")) {
                try {
                    rollD20();
                } catch (IOException e) {
                    System.err.println("An error occurred while rolling the dice: " + e.getMessage());
                    exit = true; // Exit the loop in case of an error
                }
            } else {
                System.out.println("Enter 'd20', 'd12', 'd10', 'percentile', 'd8', 'd6', 'd4', or 'exit'\n");
            }
        }
    }

    public static void rollD20() throws IOException {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(20) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll this dice again? (y/n)\n");
        scanner.nextLine();
        if (userInput.equals("n")) { // Check if the user entered 'n'
            // Code will continue executing if the user entered 'n'
            System.out.println("You have continued!"); // Print a message to the console
        } else {
            System.out.println("You did not enter 'n'. Program will not continue."); // Print a message if user input is not 'n'
        }


    }
    
}