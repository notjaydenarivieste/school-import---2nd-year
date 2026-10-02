class Student extends Person{
   int grade, graduationYear;
   char gradeLetter;
   
   Student(String name, String ID, int age, int grade, int graduationYear, char gradeLetter){
      super(name,ID,age);
      this.grade = grade;
      this.graduationYear = graduationYear;
      this.gradeLetter = gradeLetter;
   }
   
   @Override
   public void printDetails(){
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("ID: " + ID);
      System.out.println("Grade: " + grade);
      System.out.println("Grade Letter: " + gradeLetter);
      System.out.println("Graduation Year: " + graduationYear);
   }

}