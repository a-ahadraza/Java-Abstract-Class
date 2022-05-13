package com.mycompany.mavenproject3;
import java.util.Scanner;
abstract class figure
{
    double dim1;
    double dim2;
    
    figure()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value of dim1 :");
        dim1 = sc.nextDouble();
        System.out.println("Enter your value of dim2 :");
        dim2 = sc.nextDouble();
    }
    abstract double area();
}
class rectangle extends figure
{
    @Override
    double area() 
    {
        System.out.println("Rectangle Area:");
        return dim1*dim2;
    }
}
class triangle extends figure
{

    @Override
    double area() 
    {
        System.out.println("Triangle Area");
        return dim1*dim2/2;
    }
}
public class introduction_to_abstract_2 
{
    public static void main(String[] args)
    {
        rectangle c1 = new rectangle();
        System.out.println("RECTANGLE IS:"+c1.area());
        triangle c2 = new triangle();
        System.out.println("TRIANGLE IS:"+ c2.area());
    }
}
