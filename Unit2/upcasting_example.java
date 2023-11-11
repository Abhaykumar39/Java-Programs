class Parentclass
{
    int a =10;
    static int b=20;

    Parentclass()
    {
        System.out.println("Inside Parentclass constructor");
    }
    void MethodExample()
    {
        System.out.println("Inside Parent MethodExample");
    }
}
class Childclass extends Parentclass
{
    int a =100;
    static int b=200;

    Childclass()
    {
        System.out.println("Inside childclass constructor");
    }
    void MethodExample()
    {
        System.out.println("Inside Child MethodExample");
    }
}

public class upcasting_example {
    public static void main(String[] args)
    {
         Parentclass obj = new Parentclass();
         System.out.println(obj.a);
         System.out.println(Parentclass.b);
         obj.MethodExample();

        // upcasting as reference of parent classs and object of child class.
        System.out.println("----------------------");

        Parentclass obj2= new Childclass();
        System.out.println(obj2.a);
        System.out.println(Parentclass.b);
         obj2.MethodExample();
         
    }
    
}
