/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;
abstract class parent
{
   public parent()
   {
       System.out.println("Mai base kai constructor hou");
   }
   public void sayhello()
   {
       System.out.println("Hello");
   }
   abstract public void greet();
   abstract public void greet2();
}
class child extends parent
{

    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() 
    {
        System.out.println("After Noon");
    }
}
abstract class child2 extends parent
{
    public void th()
    {
        System.out.println("Iam good");
    }
}
 
public class introduction_to_abstract
{

    public static void main(String[] args)
    {
       // parent c1 = new parent(); //abstract class kai object nahi buntai
        child c2 = new child();
        c2.greet2();
        c2.greet();
        //child2 c3 = new child2(); //abstract class kai object nahi buntai
        System.out.println("Hello World!");
    }
}