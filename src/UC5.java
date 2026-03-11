import java.util.Stack;

public class UC5 {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Build reversed string using pop
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("Original String : " + word);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Original String : " + word);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : The string is NOT a Palindrome.");
        }

    }
}