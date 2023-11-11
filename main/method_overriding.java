class A
{
 void display()
    {
        System.out.println("hello world ");   
    }
}
class B extends A
{
     void display()
    {
        System.out.println("hello India");
        super.display();
    }
}
class method_overriding
{
    public static void main(String args[])
    {
        B aa = new B();
        aa.display();
    }
}
