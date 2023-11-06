abstract class Polygon {
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

  public abstract double getArea();
}

public class Runner08 {
  public static void main(String[] args) {
    //Polygon p = new Polygon(); // will give error as now we have created a constructor which takes argument
    Polygon p = new Polygon(3);
    System.out.println("Area of poly: " + p.getArea());
    // Here as p.getArea() is returning 2.0 so it does not make any sense, for such cases in python we raise exceptions
    // Solution make getArea function abstract (abstract means something that does not have any physical form, so abstract function should not have body)
  // check line 29 for change
    // But if function does not have body why did you wrote it at first place?
    // Because when child will inherit this it will define it's body.
    // BUt when you have abstract function you have to make class abstract as well so change the class defination accordingly as well.
    Rectangle r = new Rectangle();

    r.setSides(4, 4);
    System.out.println("Area of rect: " + r.getArea());
  }
}
