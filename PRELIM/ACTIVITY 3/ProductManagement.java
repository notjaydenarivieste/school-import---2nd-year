import java.util.*;

public class ProductManagement{
    
   Scanner sc = new Scanner(System.in);
   
   public void addProduct(ArrayList<String> cart){
      System.out.println("");
      
      System.out.print("Add a product: ");
      cart.add(sc.nextLine());
      
      System.out.println("");
   }
   
   public void editProduct(ArrayList<String> cart){
      System.out.println("");
      
      displayProduct(cart);
      int itemNum = 0;
      System.out.print("Which number will be replaced? ");
      itemNum = sc.nextInt();
      sc.nextLine();
      
      if(itemNum <= cart.size() && itemNum > 0){
          
        int replace = itemNum - 1;
        System.out.print("What product will you replace? ");
        cart.set(replace, sc.nextLine());
        
        }
      else{
         System.out.println("Nuh uh.");
      }
      
      System.out.println("");
   }
   
   
   public void searchProduct(ArrayList<String> cart){
       System.out.println("");
       
       displayProduct(cart);
       System.out.print("Lost an item? Find it! Input item name: ");
       String lostItem = sc.nextLine();
       
       int where = Collections.binarySearch(cart, lostItem);
       
       if(where >= 0){
           System.out.print("Your item " + lostItem + "has been found at position" + where + "!");
       }else{
           System.out.println("Hey uh... we didnt find it :(");
       }
       
       System.out.println("");
   }
   
   public void deleteProduct(ArrayList<String> cart){
        System.out.println("");
      
        displayProduct(cart);
        System.out.println("Enter an item to delete: ");
        String itemByeBye = sc.nextLine();
      
        boolean found = false;
      
        for(int i = 0; i < cart.size(); i++){
           if(itemByeBye.equals(cart.get(i))){
              System.out.println("You have made your choice! Say goodbye to this item's constituent atoms!");
            
              cart.remove(itemByeBye);
              displayProduct(cart);
            
             found = true;
              break;
            }
        }
      
        if(!found){
            System.out.println("Hey, the item " + itemByeBye + " can't be deleted because we can't find it... so yeah...");
        }
      
         System.out.println("");
   }
   
   public void sortProduct(ArrayList<String> cart){
        System.out.println("");
        
        Collections.sort(cart);
      
        System.out.println("Items Sorted!");
        displayProduct(cart);
      
        System.out.println("");
   }
   
   
   public void displayProduct(ArrayList<String> cart){
        System.out.println("");
        System.out.print("\t" + cart);
      
        System.out.println("");
   }
}