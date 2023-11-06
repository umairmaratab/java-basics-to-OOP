// You can have more classes in one class, but you must have 1 class of same name as filename, and the class other than filename cannot be public.

class Polygon { // in java class names mostly kept as title case.
  int numSides; // member names are in camelCase.

  public Polygon() {
    this.numSides = 0; // Polygon must have sides.
  }

  // constructor overloading
  public Polygon(int numSides) {
    this.numSides = numSides;
  }

  // function names are mostly camelCase in java
  // python has _ convention like num_sides
  public double getArea() {
    return 0.0; 
  } // area as 0.0 does not make sense because what if sides = 4, many shapes has 4 sides so solution is we use inheritance  
}

// inheritance
class Rectangle extends Polygon{

    public Rectangle() {
      super(4); // this means create instance of Polygon from which Rectangle has been extended and 4 is passed as sides to it's constructor. // public Polygon (int numSides) will be called in this case.
  }

  double length;
  double width;

  public void setSides(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // let's create Rectangle own getArea
  // this is overriding as it has overide it's parent getArea function and for overriding the parameters must be same as well, only implementation should be changed.
  public double getArea() { // prototype is known as signature, so we can also say signature should be same in overriding and should be different in overloading.
    return this.length * this.width;
  }
  // Annotations (we can some time type the wrong name for a function so we can use Annotations there)
  //@Override // this Annotation will make sure what you overide is also present is super class 
  //public double getAria() {
    //return this.length * this.width;
  //}
  //Uncomment 42 - 46 lines to see error.
}

public class Runner07 {
  public static void main(String[] args) {
    
    Polygon p = new Polygon(4);
    System.out.println("Area of poly: " + p.getArea());

    Rectangle r = new Rectangle();
    System.out.println("numSides in Rectangle: " + r.numSides);

    r.setSides(4, 4);
    double area = r.getArea(); // this will call Rectangle getArea not it's parent
    System.out.println("Area of rect: " + area);
  }
}
