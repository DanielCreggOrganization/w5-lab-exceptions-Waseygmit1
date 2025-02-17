package ie.atu.exceptions;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Example 1
        // String text = null;

        // if (text != null) {
        // System.out.println(text.length());
        // } else {
        // System.out.println("The text is null.");
        // }

// Example 2
        // try {
        // // Triggering ArithmeticException by dividing by zero
        // int result = 10 / 0;
        // System.out.println("The result is: " + result);
        // } catch (ArithmeticException e) {
        // // Handling the exception
        // System.out.println("Error: Cannot divide by zero!");
        // }

// Example 3
        // try {
        // // Simulating file opening
        // System.out.println("Opening file...");

        // // Simulating file processing
        // System.out.println("Processing file...");

        // // Simulating an exception during file processing
        // if (true) {
        // throw new Exception("An error occurred while processing the file.");
        // }
        // } catch (Exception e) {
        // // Handling the exception
        // System.out.println("Error: " + e.getMessage());
        // } finally {
        // // This block will always be executed
        // System.out.println("File processing complete.");
        // }
        
//Example 4
        //  try (Scanner scanner = new Scanner(System.in)) {
        //     System.out.print("Enter an integer: ");
        //     int number = scanner.nextInt();
        //     int square = number * number;
        //     System.out.println("The square of " + number + " is " + square);
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

//Example 5
        // System.out.println("\nDemonstrating checked and unchecked exceptions:");
        // try (FileReader reader = new FileReader("nonexistent.txt")) {
        //     int data = reader.read();
        //     while (data != -1) {
        //         System.out.print((char) data);
        //         data = reader.read();
        //     }
        // } catch (IOException e) {
        //     System.out.println("Caught checked exception: " + e.getMessage());
        // }

        // // Demonstrating unchecked exception (ArrayIndexOutOfBoundsException)
        // int[] emptyArray = new int[0];
        // System.out.println(emptyArray[0]); // This will throw an ArrayIndexOutOfBoundsException

//Example 6
       //     System.out.println("\nTesting grade calculation:");
       //     try {
       //         calculateGrade(150); // This will throw an IllegalArgumentException
       //     } catch (IllegalArgumentException e) {
       //         System.out.println("Caught exception: " + e.getMessage());
       // }

//Example 7
       System.out.println("\nTesting bank account:");
       BankAccount account = new BankAccount(100);
       try {
        account.withdraw(150); // This will throw an InsufficientFundsException
        } catch (InsufficientFundsException e) {
        System.out.println("Error: " + e.getMessage());
        }

}
//Example 8
    //      System.out.println("\nError vs Exception explanation:");
    //      /*
    //      * Why Errors are not typically caught:
    //      * 
    //      * 1. Errors indicate serious problems at the JVM/system level that the application
    //      *    cannot reasonably recover from or handle.
    //      * 
    //      * 2. Examples of such Errors:
    //      *    - OutOfMemoryError: JVM has exhausted available memory
    //      *    - StackOverflowError: Infinite recursion or excessive method calls
    //      *    - LinkageError: Class dependencies are broken
    //      * 
    //      * 3. Best practices:
    //      *    - Let errors propagate and terminate the program
    //      *    - Focus on preventing errors through proper resource management
    //      *    - Use monitoring and logging to detect potential issues
    //      * 
    //      * Example of code that could cause an Error (DO NOT UNCOMMENT):
    //      * // Infinite recursion causing StackOverflowError
    //      * // public static void recurse() { recurse(); }
    //      */
        
    //     System.out.println("Program continues normally.");

    // }
    
        // Section 6 - DIY Exercise with throw keyword
        public static void calculateGrade(int score) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid score");
            }
            System.out.println("Valid score: " + score);
        }
    }

    

