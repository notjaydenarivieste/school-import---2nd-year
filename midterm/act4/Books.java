public class Books extends Goods implements Taxable{
   String author;
   
   Books(String description, double price, String author){
      super(description, price);
      this.author = author;
   }
   
   
   @Override
   public void display(){
      System.out.println("Book Author: " + author);
      System.out.println(description);
      System.out.printf("Price: %.2f" , price);
   }
   
   @Override
   public void calculateTax(){
      System.out.printf("\nTax Amount: %.2f" , (price*taxRate));
      System.out.println("\n");
   }
}