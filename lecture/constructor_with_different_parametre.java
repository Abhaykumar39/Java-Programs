class A
{
    A()
    {
       System.out.println("no parametre");
    }
    A(int a)
    {
        System.out.println("1 parametre");
    }
    A(int a, int b)
    {
        System.out.println("2 parametre");
    }
}
class constructor_with_different_parametre
{
    public static void main(String args[])
    {
        new A();
        new A(7);
        new A(7,8);
    }
}
