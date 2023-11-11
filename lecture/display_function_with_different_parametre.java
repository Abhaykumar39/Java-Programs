class A
{
    void display()
    {
       System.out.println("no parametre");
    }
    void display(int a)
    {
        System.out.println("1 parametre");
    }
    void display(int a, int b)
    {
        System.out.println("2 parametre");
    }
}
class display_function_with_different_parametre
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.display();
        obj.display(5);
        obj.display(5,5);
    }
}