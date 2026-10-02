abstract class Person{
   
   String ID, name;
   int age;
   
   Person(String name, String ID, int age){
      this.ID = ID;
      this.name = name;
      this.age = age;
   }
   
   protected String name(){
      return name;
   }
   
   protected String ID(){
      return ID;
   }
   
   protected int age(){
      return age;
   }
   
   public abstract void printDetails();
}