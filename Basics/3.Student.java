public class Student03 {
  static int count = 0; // to keep track of instances (count) 
  // why static? static will make this variable available to all instances even if 100 instances are created, this will remain same, if you update it somewhere it will be updated in each instance as well
  int rollNo; // roll number should be something which has to be unique so we cannot make it static

  public static void main(String[] args) {
      
    Student03 s1 = new Student03();
    Student03 s2 = new Student03();

    System.out.println("num: " + Student03.count);

    Student03.count += 1; 
    System.out.println("num: " + Student03.count);
    
    // static variable can be accessed even without creating an instance 
    // that's why main is static and we can call it without creating instance
    
  //  System.out.println("rollNo:" + Student03.rollNo); // will give error
    
    System.out.println("rollNo:" + s1.rollNo);
  }
}
