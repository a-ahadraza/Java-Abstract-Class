package com.mycompany.abstract_assignment;
import java.util.Scanner;
abstract class Person
{
    String Name;
    String Father_Name;
    String Cnic;
    String Nationality;
    String City;
    Person()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        Name = sc.next();
        System.out.println("Enter your Father Name :");
        Father_Name = sc.next();
        System.out.println("Enter your Cnic :");
        Cnic = sc.next();
        System.out.println("Enter your Nationality :");
        Nationality = sc.next();
        System.out.println("Enter your City :");
        City = sc.next();
    }
}