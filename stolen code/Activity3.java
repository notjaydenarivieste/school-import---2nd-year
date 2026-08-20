public class FindLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 91, 3, 28};
        
        
        int max = numbers[0]; 
        
      
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
        }
        
        System.out.println("Largest number: " + max); // Output: 91
    }
}