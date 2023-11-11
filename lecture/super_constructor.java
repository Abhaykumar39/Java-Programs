class C 
{
    int i,j;
    C()
    {
        i=10;
    }
    C(int x)
    {
        i=x;
    }
    C(int x, int y)
    {
        j=x+y;
    }
}
class B extends C
{
    B()
    {
        super(100);
    }
    B(int x)
    {
        super(x,x);
    }
}
class super_constructor
{
    public static void main(String args[])
    {
        B obj = new B();
        System.out.println(obj.i);
        System.out.println(obj.j);
        B obj2 = new B(10);
        System.out.println(obj2.i);
        System.out.println(obj2.j);
    }
}
