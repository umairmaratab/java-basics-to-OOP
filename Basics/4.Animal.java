public class Animal04 {

// student must have roll number when created so for such things we uses constructor
  public Animal04() { // constructor is called automatically
    
    System.out.println("Animal class created ... ");
  }

  // java does not have destructors as we donot know when instance will be end

  public static void main(String args[]) {
    System.out.println("Main function called ... ");


    Animal04 a = new Animal04();
    
  }
}
