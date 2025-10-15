import java.util.Scanner;

public class CrypticMessageDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int message = scanner.nextInt();

        // Handle single-digit numbers safely
        if (message < 10) {
            System.out.println("Expected Output: The decrypted code is: " + (message * message));
            scanner.close();
            return;
        }

        // Calculate number of digits
        int numDigits = (int) Math.log10(message) + 1;

        // Extract first and last digits
        int divisor = (int) Math.pow(10, numDigits - 1);
        int firstDigit = message / divisor;
        int lastDigit = message % 10;

        // Product of first and last digits
        int product = firstDigit * lastDigit;

        // Extract second and second-last digits (only if numDigits >= 2)
        int withoutFirstDigit = message % divisor;
        int secondDivisor = (int) Math.pow(10, numDigits - 2);
        int secondDigit = (numDigits >= 2) ? withoutFirstDigit / secondDivisor : 0;

        int withoutLastDigit = message / 10;
        int secondLastDigit = (numDigits >= 2) ? withoutLastDigit % 10 : 0;

        // Sum of second and second-last digits
        int sum = secondDigit + secondLastDigit;

        // Combine results
        String finalCode = String.valueOf(product) + String.valueOf(sum);

        System.out.println("Expected Output: The decrypted code is: " + finalCode);

        scanner.close();
    }
}
