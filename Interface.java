package pkginterface;
class Shape
{
    double x;
    double y;
    Shape(double a, double b)
    {
        x = a;
        y = b;
    }
}
class rectangle extends Shape
{

    rectangle(double a, double b) 
    {
        super(a, b);
    }
    public void show()
    {
        System.out.println("Rectangle");
        System.out.println(x + " " + y);
    }
}
class triangle extends Shape
{

    public triangle(double a, double b) 
    {
        super(a, b);
    }
    public void show()
    {
        System.out.println("Triangle");
        System.out.println(x + " " + y);
    }
    
}

class Circle extends Shape implements ShapeArea
{

    public Circle(double a, double b) 
    {
        super(a, b);
    }
    public void ShapeArea()
    {
        System.out.println(x+y);
    }
}
public class Interface 
{
    public static void main(String[] args)
    {
        rectangle r = new rectangle(12,33);
        triangle c = new triangle(12,33);
        Circle c1 = new Circle(22,434);
        r.show();
        c.show();
        c1.ShapeArea();
    }
}