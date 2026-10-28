import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = {"Mina", "Rat King", "Seven", "Vindicta", "Baba", "Abrams", "Doorman", "Calico"};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer index (0 to 7): ");

        try {
            int index = input.nextInt();
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The index entered is out of range. Valid range is 0 to 7.");
        }

        input.close();
    }
}
