import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class UC12 {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy (can change dynamically)
        PalindromeStrategy strategy;

        // Example: choose Stack strategy
        strategy = new StackStrategy();

        boolean result = strategy.checkPalindrome(word);

        if (result) {
            System.out.println("Using Strategy Pattern");
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Using Strategy Pattern");
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}