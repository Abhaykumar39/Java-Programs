class B
{
    int a=10;
    void show()
    {
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
    }
}
class Abc
{
    public static void main(String args[])
    {
       B obj = new B();
       obj.show();
    }

}