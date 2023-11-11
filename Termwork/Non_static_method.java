class A
{
    void display()
    {
        System.out.println(" Hello Java ");
        System.out.println(" Here is the New world ");
    }
}
class Non_static_method
{
   public static void main(String[] args)
   {
    A a = new A();
    a.display();
   }
}