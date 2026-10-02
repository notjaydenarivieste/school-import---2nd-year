public abstract class Goods{
   String description;
   double price;
   
   Goods(String description, double price){
      this.description = description;
      this.price = price;
   }
   
   
   public abstract void display();
}