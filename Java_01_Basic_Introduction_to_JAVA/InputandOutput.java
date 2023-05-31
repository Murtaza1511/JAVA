import java.util.Scanner;
public class InputandOutput 
{
    public static void main(String[] args)
    {
        // int age = 190;
        // System.out.print("helloe");
        // System.out.print("world");
        // System.out.println("Hello\n");
        // System.out.println("world");
        // System.out.println(age);
        // println("I/P")
        // sc is the object of Scanner class in which we have passed as argument System input
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        // nextInt() is a method predefined by JAVA in Scanner class
        age = sc.nextInt();
        System.out.println("Enter your height in cms");
        double height = sc.nextDouble();
        System.out.println("The age is: "+ age);
        System.out.println("The height is: "+height);

        // To close Scanner and avoid warning of memory leak
        sc.close();
        

    }

    
}
