public class Professor extends Employee{
   String expertise;
   
   
   Professor(String name, String ID, int age, String department, double salary){
      super(name,ID,age);
      this.department = department;
      this.salary = salary;
   }

}