import java.util.Vector;
// Vector in java is equivalent of list in python.
public class Runner11 {
  public void printVector(Vector v) {
    for (int i = 0; i < v.size(); i++) {
      System.out.println(v.get(i));
    }
    
  }

  public void intVectorTest() {
    Vector vi = new Vector();
    // to specify for specific type we can use
    // Vector<String> vs = new Vector<String>();
    vi.add(4);
    vi.add(5);
    vi.add(6);
    vi.add("Something");

    printVector(vi);
    System.out.println(vi);
  }

  public static void main(String[] args) {
    Runner11 r = new Runner11();
    r.intVectorTest();
  }
}
