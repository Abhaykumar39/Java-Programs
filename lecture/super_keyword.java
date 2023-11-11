class A 
{
    int i=200;
    void display()
    {
        System.out.println("hello Java");
    }
}
class B extends A 
{
    int i = 300;
    void display()
    {
        System.out.println(super.i);
        System.out.println(i);
        super.display();
    }
}
class Super_keyword
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
    }
}
