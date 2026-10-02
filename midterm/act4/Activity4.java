import java.util.*;

public class Activity4{
   public static void main(String[] args){
      Books b1 = new Books("A Guide for Sleeping", 25.50, "Leann Baguio");
      Toy t1 = new Toy("Gypsy Danger Action Figure", 230.00, 5);
      Food f1 = new Food("Pagpag", 20.30, 200);
      
      b1.display();
      b1.calculateTax();
      
      t1.display();
      t1.calculateTax();
   
      f1.display();
   }
}