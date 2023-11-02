public class Animal02 {
  int legs = 4;

  public int get_legs() {
    return this.legs; // this.legs means just check instance frame only not local and global 
  } // we donot need this but just to make it simple 

  void constructsTest() {
    int x = 5;

    if (x == 5)
      System.out.println("X is 5");

    for (int i = 0; i < 3; i++) {
      System.out.println("Looping: " + i);
    }
  }
// while syntax is also same as other languages

  public static void main(String[] args) {
    System.out.println("Main function called ... ");

    Animal02 a = new Animal02();
    System.out.println("Legs: " + a.legs);

    // add call to method 
    System.out.println("Legs from method: " + a.get_legs());
    
    a.constructsTest();
  }
}
