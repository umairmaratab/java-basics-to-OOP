abstract class Polygon {
  int numSides;

  public Polygon(int numSides) {
    this.numSides = numSides;
  }

  public abstract double getArea(); 
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

public class Runner08_1_Solution {
  public static void main(String[] args) { 
    //Polygon p = new Polygon(3);
    //System.out.println("Area of poly: " + p.getArea());
    
    // ---- we commented 29,30 as we cannot create object of abstract class but why we did it?
    // Now when any class will inherit Polygon, it will provide body of getArea or that class has to make it abstract as well.
    // (this way we have enforced other clsses to must have Area)
    Rectangle r = new Rectangle();
    
    // Provide body of getArea() in Rectangle class so we can create it's object
    r.setSides(4, 4);
    System.out.println("Area of rect: " + r.getArea());
    // Also we can create a Polygon of type Rectangle, but why?
    // As we have extended it which means Polygon is also a Rectangle.
    // so a parent class can have reference of it's child class 

    Polygon r = new Rectangle();

  }
}
