class A
{
   protected void display()
    {
        System.out.println("Hello World ");
    }
}
class B extends A
{
   public void display()
    {
        System.out.println("Hello java ");
    }
}
class precedence_access_specifier 
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
    }
}
