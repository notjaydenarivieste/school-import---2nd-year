import java.util.*;
public class DistanceFromAverageWithExceptionHandling
{
   public static void main (String []args){
      Scanner scan = new Scanner(System.in);
      int size = 0;
      boolean validSize = false;
      
      while(!validSize){
         try{
            System.out.println("Enter array size: ");
            size = scan.nextInt();
            validSize = true;
         }
         catch(NumberFormatException e){
               System.out.println("Error: Number Format Exception");
               scan.next();
         }
      }
      
      double[] arr;
      try{
         arr = new double[size];
      }
      catch(NegativeArraySizeException e){
         System.out.println("Negative size not allowed. System will be using 5 as default size");
         size = 5;
         arr = new double[size];
      }
      
      double sum = 0;
      for(int i = 0; i< arr.length; i++){
         boolean validValue = false;
         while (!validValue){
            try{
               System.out.println("Enter value " + (i + 1) + ": ");
               arr[i] = scan.nextDouble();
               validValue = true;
            }
            catch(InputMismatchException e){
               System.out.println("Wrong input. Try again.");
               scan.next();
            }
         }
         sum += arr[i];
      }
      
      if(arr.length == 0){
         System.out.println("No inputs found. Can't calculate");
         return;
      }
      double average = sum / arr.length;
      System.out.println("Total/Sum: " + sum);
      System.out.println("\nAverage: " + average);
      for(int i = 0; i< arr.length; i++){
         System.out.println(arr[i] + " is " + (arr[i] - average) + " from the average");
      }
      
   }
}