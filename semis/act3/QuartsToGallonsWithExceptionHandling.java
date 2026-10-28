import java.util.*;

public class QuartsToGallonsWithExceptionHandling{
   private static final double quartsPerGallon = 4.0;
   
   public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      double quarts = 0;
      boolean validInput = false;
      
      //reprompt repromt and repromt until user inputs valid number... yipee!
      while (!validInput) {
         System.out.print("Enter the number of quarts: ");
         String entry = sc.nextLine().trim();
         
         try{
            quarts = Double.parseDouble(entry);
            validInput = true;
         }catch(NumberFormatException e){
            System.out.println("Error: " + e.toString());
         }
      }
      
      double gallons = quarts / quartsPerGallon;
      System.out.println(quarts + " quarts");
   }
}