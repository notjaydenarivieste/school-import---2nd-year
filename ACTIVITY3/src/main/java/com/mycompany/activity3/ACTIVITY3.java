/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity3;

/**
 *
 * @author jaydenarivieste
 */
import java.util.*;
public class ACTIVITY3 {
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      
      ArrayList<String> storage = new ArrayList<String>();
      ProductManagement pm = new ProductManagement();
      
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
               pm.addProduct(storage);
               choice = 0;
               
               break;
               
            case 2:
                pm.editProduct(storage);
                choice = 0;
                
                break;
                
            case 3:
                pm.searchProduct(storage);
                choice = 0;
                
                break;
                
            case 4:
                pm.deleteProduct(storage);
                choice = 0;
                
                break;
                
            case 5:
               pm.sortProduct(storage);
               choice = 0;
               
               break;
               
            case 6:
               pm.displayProduct(storage);
               choice = 0;
               
               break;
            
            default:
               System.out.println("Terminating Program... or terminating you?///// >:) //////");
               break;
         }
      
      
      }
   }
}
