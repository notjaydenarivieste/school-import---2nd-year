import java.util.Scanner;

public class SqrtException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter an integer: ");
        String entry = scanner.nextLine();

        try {
            number = Integer.parseInt(entry);
        } catch (Exception e) {
            System.out.println("Error: Invalid entry. Value has been set to 0.");
            number = 0;
        }

        try {
            if (number < 0) {
                throw new ArithmeticException("Error: You cannot take the square root of a negative number.");
            }
            double result = Math.sqrt(number);
            System.out.printf("The square root of %d is %.2f", number,  result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}