public class Shape {
   public double getAreaCirc()
   {
       return 0.0;
   }
    public double getAreaRect()
    {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double  getAreaCirc() {
        double area = radius * radius * 3.14;
        return area;
    }

    public static void main(String[] args) {
        Circle radius = new Circle(4.0);
        Circle area = new Circle(1.0);
        System.out.println("Aria cercului:"+  radius.getAreaCirc());
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public double  getAreaRect() {
        double area = height * width;
        return area;
    }

    public static void main(String[] args) {
        Rectangle nr = new Rectangle(6.0,3.0);
        System.out.println("Aria dreptunghiului:"+ nr.getAreaRect());
    }
}
