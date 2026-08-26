import java.util.*;

public class Activity3{
   public static void main(String[] args){
      
      ProductManagement pm = new ProductManagement();
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      //insert array here please
      
      //selection
      System.out.print("How many products would you want? ");
      int inv = sc.nextInt();
      
      String[] storage = new String[inv];
      
      
      while(choice != 7){
      
         System.out.println("Product Management Mk. I");
         System.out.println("1 - Add Product");
         System.out.println("2 - Edit Product");
         System.out.println("3 - Search Product");
         System.out.println("4 - Delete Product");
         System.out.println("5 - Sort Products");
         System.out.println("6 - Display Products");
         System.out.println("7 - End Program");
         System.out.print("Choose Action: ");
         choice = sc.nextInt();
         
         switch(choice){
            case 1:
               //insert case
            case 2:
            case 3:
            case 4:
            case 5:
               pm.sortProduct(storage);
               choice = 0;
               
            case 6:
               pm.displayProduct(storage);
               choice = 0;
               
            
            default:
               break;
         }
      
      
      }
   }
}