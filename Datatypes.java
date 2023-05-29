public class Datatypes 
{
    public static void main(String[] args)
    {
        byte b = 12;
        System.out.println(b);
        short s = 780;
        System.out.println(s);
        int age = 16;
        if(age >=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You can't vote");
        }
        long l = 893749873;
        System.out.println(l);

        // Floating Point Datatypes
        float f = 90.78f;
        System.out.println(f);
        double height = 163.90;
        if(height >160)
        {
            System.out.println("You can join the army");
        }
        else
        {
            System.out.println("Sorry you can't join the army");
        }

        // Character datatypes
        char ch = 99;
        char ch1 = '@';
        System.out.println(ch + ch1);
        // char ch3 = "t";
        boolean bo = true;
        System.out.println("The value of bo is: "+ bo);

        String str = "Murtaza";
        System.out.println(str);



    }
    
}
