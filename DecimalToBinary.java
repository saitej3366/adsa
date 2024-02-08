import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        
        // Convert decimal to binary
        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }
        
        // Pop elements from stack to print binary representation
        System.out.print("Binary representation: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        
        scanner.close();
    }
}
