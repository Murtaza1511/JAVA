package Java_02_Understanding_Classes_and_Objects;


public class Student 
{
    String name;
    int rollno;
    String department;
    double percentage;

    void study()
    {
        System.out.println("Do not disturb I am studying");
    }
    public static void main(String[] args)
    {
        // class_name variable_name = new class_name();
        // s is object of type Student
        // Student s = new Student();
        // s.study();
        // s.name = "Murtaza";
        // System.out.println(s.name);
        // s.rollno = 35;
        // System.out.println(s.rollno);

        // String str = "May";
        // System.out.println(str);
        String s2 = new String("October"); 
        System.out.println(s2);

    }
    
    
}
