class Polygon {
  int numSides;

  public Polygon(int numSides) {
    this.numSides = numSides;
  }

  public double getArea() {
    return 2.0;
  }
}

class Rectangle extends Polygon {
  
  public Rectangle() {
    super(4);
  }

  double length;
  double width;

  public void setSides(double length, double width) {
    this.length = length;
    this.width = width;
    
  }

  @Override
  public double getArea() {
    return this.length * this.width;
  }
}

public class Runner08 {
  public static void main(String[] args) {
    //Polygon p = new Polygon(); // will give error as now we have created a constructor which takes argument
    Polygon p = new Polygon(3);
    System.out.println("Area of poly: " + p.getArea());
    // Here as p.getArea() is returning 2.0 so it does not make any sense, for such cases in python we raise exceptions
    // For solution check Runner08_1.java

    Rectangle r = new Rectangle();

    r.setSides(4, 4);
    System.out.println("Area of rect: " + r.getArea());
  }
}
