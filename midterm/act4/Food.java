public class Food extends Goods{
   int calories;
   
   Food(String description, double price, int calories){
      super(description, price);
      this.calories = calories;
   }
   
   
   @Override
   public void display(){
      System.out.println("Calories: " + calories);
      System.out.println(description);
      System.out.println("Price: " + price);
   }
}