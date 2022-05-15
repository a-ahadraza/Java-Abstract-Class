interface ShowPerson
{
    public void display();
}
class Person
{
    String Name;
    String Father_Name;
    String Cnic;
    String Nationality;
    String City;
    Person(String N , String Father , String cnic , String nationality , String city) {
        Name = N;
        Father_Name = Father;
        Cnic = cnic;
        Nationality = nationality;
        City = city;
    }
}
class student extends Person
{

    student(String N, String Father, String cnic, String nationality, String city)
    {
        super(N, Father, cnic, nationality, city);
    }
    String Student_ID;
    String Qualification;
    String Current_Program;
    public void display()
    {
        System.out.println("STUDENT RECORD");
        System.out.println("Your Name is :"+ Name);
        System.out.println("Your Father Name is :"+ Father_Name);
        System.out.println("Your Cnic is :"+ Cnic);
        System.out.println("Your Nationality is :"+ Nationality);
        System.out.println("Your City is :"+ City);
        System.out.println("Your Student ID is : "+ Student_ID);
        System.out.println("Your Qualification is :"+ Qualification);
        System.out.println("Your Current Program is :"+ Current_Program);
        System.out.println("____________________________________________");
        System.out.println();
    }
}
class employee extends Person implements ShowPerson
{

    employee(String N, String Father, String cnic, String nationality, String city)
    {
        super(N, Father, cnic, nationality, city);
    }
    String Employee_ID;
    String Designation;
    String Department;

    public void display()
    {
        System.out.println("EMPLOYEE RECORD");
        System.out.println("Your Name is :"+ Name);
        System.out.println("Your Father Name is :"+ Father_Name);
        System.out.println("Your Cnic is :"+ Cnic);
        System.out.println("Your Nationality is :"+ Nationality);
        System.out.println("Your City is :"+ City);
        System.out.println("Your Employee ID is :"+ Employee_ID);
        System.out.println("Your Designation is :"+ Designation);
        System.out.println("Your Departmemnt is :"+ Department);
        System.out.println("____________________________________________");
        System.out.println("");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        student c1 = new student("ABDUL AHAD RAZA","SHOUKAT RAZA", "37405-9412528-0","PAKISTAN","RAWAPLPINDI");
        c1.Student_ID = "NUML-F21-37114";
        c1.Current_Program = "BS(COMPUTER SCIENCE)";
        c1.Qualification = "INTERMEDIATE";
        c1.display();
        employee c2 = new employee("AHSAN RAZA", "ALI RAZA","37405-96842022-2","PAKISTAN","RAWALPINDI");
        c2.Employee_ID = "BOP-f21-37114";
        c2.Designation  = "SOFTWARE ENGINEER ";
        c2.Department = "AF-122 BLOCK(A)";
        c2.display();
    }
}