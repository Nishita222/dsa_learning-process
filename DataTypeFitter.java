import java.util.*;

public class DataTypeFitter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();  // Read as String to handle large numbers
        
        System.out.println(input + " can be fitted in:");
        
        boolean canFitAnywhere = false;

        // Check if input is a valid number (optional but safe)
        try {
            long value = Long.parseLong(input);  // We'll parse once

            // 1. Check byte: -128 to 127
            if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                System.out.println("* byte");
                canFitAnywhere = true;
            }

            // 2. Check short: -32768 to 32767
            if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                System.out.println("* short");
                canFitAnywhere = true;
            }

            // 3. Check int: -2147483648 to 2147483647
            if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                System.out.println("* int");
                canFitAnywhere = true;
            }

            // 4. Check long: -9223372036854775808 to 9223372036854775807
            if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
                System.out.println("* long");
                canFitAnywhere = true;
            }

        } catch (NumberFormatException e) {
            // If input is not a valid number
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        // If number is too big even for long
        if (!canFitAnywhere) {
            System.out.println(input + " can’t be fitted anywhere.");
        }

        scanner.close();
    }
}