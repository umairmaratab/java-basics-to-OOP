public class Math06 {
  
  public double sqrt(int x, double guess) { // duble is mostly used in java
    System.out.println("Calculating sqrt of " + x + " starting with guess: " + guess);
    return 1.0;
  }
  // what if we want to make a parameter optional, we cannot do double guess = 1.0 (not possible in java, python does have this)

  // so in java you have to overload this function 
  // python does not have overloading it overides, as we dont need overloading we can just do, guess = 1.0 to make it optional

  // java 
  public double sqrt(int x){
    double guess = 1.0;
    return sqrt(x, guess);
  }

  public static void main(String[] args) {
    Math06 m = new Math06();

    m.sqrt(36, 4.3);
    m.sqrt(36);
    // so if 2 argument passed sqrt on line 3 will be called and if 1 passed sqrt function on line 13 will be called
    // so we donot say we have two functions we say we have overloaded functions.
    // you cannot overload with changing return type.
  }
}
