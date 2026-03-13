import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
  
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.addLast(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1 && isPalindrome) {
            char first = list.removeFirst();   // from front
            char last  = list.removeLast();    // from back
            if (first != last) {
                isPalindrome = false;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
