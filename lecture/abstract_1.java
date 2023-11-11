abstract class A{
    void show()
    {
        System.out.println("Hello java");
    }
    abstract void show1();
}
abstract class B
{
    abstract void show2();
}
abstract class C
{
    abstract void show3();
}
class D extends A
{
   public void show1()
   {
    System.out.println(" show 1 method");
   }
   public void show2()
   {
    System.out.println(" show 2 method");
   }
   public void show3()
   {
    System.out.println(" show 3 method");
   }
}
class abstract_1 {

    public static void main(String[] args)
    {
        D obj = new D();
        obj.show1();
        obj.show2();
        obj.show3();
        obj.show();
    }
    
}
