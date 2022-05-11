package abstract_class;
abstract class Figure
{
    double dim1;
    double dim2;
    Figure(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
class Rectangle extends Figure
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }

    @Override
    double area() 
    {
        System.out.println("RECTANGLE AREA:");
        return dim1*dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }
    @Override
    double area() 
    {
        System.out.println("TRIANGLE AREA:");
        return dim1 * dim2/2;
    }
}
public class Abstract_Class 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(9,10);
        Triangle t = new Triangle(4,10);
        
        Figure f2 = new Rectangle(12,100);
        Figure f3 = new Triangle(12,100);
        Figure f;
        f = r;
        System.out.println(f.area());
        f=t;
        System.out.println(t.area());
        System.out.println(f2.area());
        System.out.println(f3.area());
    }
    
}
