class arithmeticexception
{
    public static void main(String args[])
    {
        try{
            int a=5/0;
            System.out.println(a);
        }
        catch(ArithmeticException i)
        {
            System.out.println(i);
            System.out.println("Hello ");
        }
    }
}