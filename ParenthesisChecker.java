import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the expression
        for (char ch : expression.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket, check for a matching opening bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or the top of the stack doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, the parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Allowing user to input a set of parentheses
        System.out.print("Enter a set of parentheses: ");
        String expression = scanner.nextLine();
        
        // Check if the input parentheses are balanced
        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
        
        scanner.close();  // Close the scanner resource
    }
}
