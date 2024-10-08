import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

    /**
     * This program reads a list of Integer numbers from user input and saves them
     * into a Stack, ensuring that the numbers are sorted from smallest to largest.
     * It uses the Java Collections Framework to maintain the sorted order.
     */
    public class Data_StructureLL {

        /**
         * The main method that drives the program. It takes user input, stores the numbers
         * in a Stack, and ensures the stack is sorted in ascending order after each entry.
         *
         * @param args Command-line arguments (not used here).
         */
        public static void main(String[] args) {
            // Create a Stack to store the integers
            Stack<Integer> numbersStack = new Stack<>();

            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter numbers
            System.out.print("Enter the number of integers you would like to input: ");
            int count = scanner.nextInt();

            // Loop to take user input and add each number to the stack in sorted order
            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int number = scanner.nextInt();

                // Add the number to the Stack while keeping it sorted
                addNumberInOrder(numbersStack, number);

                // Print the sorted stack after each input
                System.out.println("Sorted stack: " + numbersStack);
            }

            // Close the scanner
            scanner.close();
        }

        /**
         * Adds a number to the Stack while maintaining the stack's sorted order.
         * This method is an example of code reuse via the Collections framework.
         * It can be called multiple times throughout the program to add and sort
         * new numbers into the stack.
         *
         * The method uses the Collections Framework to sort the stack after each addition.
         *
         * @param stack   The Stack to which the number will be added.
         * @param number The integer to be added to the stack.
         */
        public static void addNumberInOrder(Stack<Integer> stack, int number) {
            // Push the number to the stack
            stack.push(number);

            // Sort the stack to maintain ascending order
            Collections.sort(stack);
        }
    }

