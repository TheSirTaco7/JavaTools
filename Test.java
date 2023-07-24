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

    }   
}