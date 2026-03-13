/**
 * ================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue). [web:4]
 *
 * Characters are inserted into the deque and then compared by
 * removing elements from both ends using:
 *  - removeFirst()
 *  - removeLast() [web:7]
 *
 * This avoids reversing the string and provides an efficient
 * front-to-back comparison approach. [web:8]
 *
 * This use case demonstrates optimal bidirectional traversal
 * using Deque.
 *
 * @author Developer
 * @version 7.0
 */
import java.util.Deque;
import java.util.ArrayDeque;

public class UC7PalindromeCheckerApp {

    //Application entry point for UC7.
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1 && isPalindrome) {
            char first = deque.removeFirst();
            char last  = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}




/**
 * ================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome using a LinkedList. [web:21]
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *  - removeFirst()
 *  - removeLast() [web:16]
 *
 * This demonstrates how LinkedList supports double-ended
 * operations for symmetric validation. [web:24]
 *
 * Hint used:
 *  // Define the input string
 *  String input = "level";
 *
 *  // Create a LinkedList to store characters
 *  LinkedList<Character> list = new LinkedList<>();
 *
 *  // Add each character to the linked list
 *  for (char c : input.toCharArray()) { ... }
 *
 *  // Flag to track palindrome state
 *  boolean isPalindrome = true;
 *
 *  // Compare until only one or zero elements remain
 *  while (list.size() > 1) { ... }
 */
