class Employee extends Person{
   String department;
   double salary;
   
   Employee(String name, String ID, int age, String department, double salary){
      super(name,ID,age);
      this.department = department;
      this.salary = salary;
   }
   
   @Override
   public void printDetails(){
   }
}