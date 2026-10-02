public class Toy extends Goods implements Taxable{
   int minimumAge;
   
   Toy(String description, double price, int minimumAge){
      super(description, price);
      this.minimumAge = minimumAge;
   }
   
   @Override
   public void display(){
      System.out.println("Minimum Age to Play: " + minimumAge);
      System.out.println(description);
      System.out.printf("Price: %.2f" , price);
   }
   
   @Override
   public void calculateTax(){
      System.out.printf("\nTax Amount: %.2f" , (price*taxRate));
      System.out.println("\n");
   }
}