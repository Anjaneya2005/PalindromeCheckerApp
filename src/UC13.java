import java.util.Stack;

public class UC13 {

    // Method 1: String Reverse
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String word) {

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

    // Method 3: Two Pointer Method
    public static boolean twoPointerMethod(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse Method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();

        // Stack Method timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(word);
        long end2 = System.nanoTime();

        // Two Pointer Method timing
        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(word);
        long end3 = System.nanoTime();

        System.out.println("Palindrome Performance Comparison");
        System.out.println("----------------------------------");

        System.out.println("Reverse Method Result : " + result1);
        System.out.println("Execution Time (ns)   : " + (end1 - start1));

        System.out.println();

        System.out.println("Stack Method Result   : " + result2);
        System.out.println("Execution Time (ns)   : " + (end2 - start2));

        System.out.println();

        System.out.println("Two Pointer Result    : " + result3);
        System.out.println("Execution Time (ns)   : " + (end3 - start3));
    }
}