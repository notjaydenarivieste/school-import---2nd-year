import java.util.*;

public class ProductManagement{
   
   public ProductManagement(){
   }
   
   public void addProduct(){
      //add later
   }
   
   public void sortProduct(String items[]){
      System.out.println("");
      Arrays.sort(items);
      
      System.out.println("Items Sorted!");
      System.out.println("");
   }
   
   
   public void displayProduct(String items[]){
      String [] products = {"Battle Worn Vandal", "Sentinel Hyperdrive", "Mothballed Arkship", "Shotgun", "The Cephalopod Mk. IV (Spaceplane)", "Moon Rock Sample"};
     
      System.out.println("");
      for(int i = 0; i < products.length; i++){
         System.out.println("\t" + products[i]);
      }
      System.out.println("");
   }
}