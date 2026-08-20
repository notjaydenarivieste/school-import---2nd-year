

public class Activity4 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found.");
        }
        scanner.close();
    }
}