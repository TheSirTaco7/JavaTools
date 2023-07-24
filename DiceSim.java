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
            System.out.println("Enter 'd20', 'd12', 'd10', 'd8', 'd6', 'd4', 'percentile', or 'exit'\n");

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
            } else if (input.equals("d12")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollD12(); // Call the method to roll the d12 dice
            } else if (input.equals("d10")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollD10(); // Call the method to roll the d10 dice
            } else if (input.equals("d8")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollD8(); // Call the method to roll the d8 dice
            } else if (input.equals("d6")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollD6(); // Call the method to roll the d6 dice
            } else if (input.equals("d4")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollD4(); // Call the method to roll the d4 dice
            } else if (input.equals("percentile")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                rollpercentile(); // Call the method to roll the percentile dice
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
        System.out.print("Do you want to roll d20 again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD20(); // Call the method recursively to roll the dice again
        }
    }

     public static void rollD12() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(12) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll d12 again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD12(); // Call the method recursively to roll the dice again
        }
    }

    public static void rollD10() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(10) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll d10 again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD10(); // Call the method recursively to roll the dice again
        }
    }

    public static void rollD8() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(8) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll d8 again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD8(); // Call the method recursively to roll the dice again
        }
    }

    public static void rollD6() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(6) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll d6 again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD6(); // Call the method recursively to roll the dice again
        }
    }

    public static void rollD4() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(4) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "\n");
        System.out.print("Do you want to roll d4 again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollD4(); // Call the method recursively to roll the dice again
        }
    }

    public static void rollpercentile() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random_number = rand.nextInt(100) + 1; // Add 1 to get a number between 1 and 20
        System.out.println("\nThe Result is " + random_number + "%\n");
        System.out.print("Do you want to roll percentile again? (y/n)\n\n");
        String userInput = scanner.nextLine(); // Read the user input

        if (userInput.equals("n")) {
        } else {
            System.out.println("\nYou have decided to roll the dice again!\n\n\n\n\n\n\n");
            rollpercentile(); // Call the method recursively to roll the dice again
        }
    }
}
