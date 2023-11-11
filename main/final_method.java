class A
{
    void display()
    {
        System.out.println("Base class ");
    }
}
class B extends A
{
    final void display()
    {
        System.out.println("Derived class ");
    }
}
class final_method {
    public static void main(String[] args)
    {
        B aa =new B();
        aa.display();
    }
    
}
