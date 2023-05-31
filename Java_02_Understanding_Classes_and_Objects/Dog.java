// Remove the below line and run in default package to avoid any error in VS Code
package Java_02_Understanding_Classes_and_Objects;


// class is struct on steroids
class Dog 
{
    // Attributes or Properties
    int size;
    String breed;
    String name;
    // Functionality
    void bark() 
    {
        System.out.println("Ruff! Ruff!");
    }
    // struct student s;
    public static void main(String[] args)
    {
        // class-name reference-variable-name = new class-name();
        Dog d = new Dog(); // Dog Object is created d reference variable
        // object-name.variablename
        // object-name.methodname
        d.size = 100;
        System.out.println(d.size);
        d.bark();
    }

}
    
