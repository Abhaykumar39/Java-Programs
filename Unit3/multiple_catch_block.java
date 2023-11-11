 class multiple_catch_block {
    public static void main(String[] args)
    {
        try{
            int a=5/0;
            int b[]= new int[5];
            b[6]=10;
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Out of bounds exception");
        }
        catch(ArithmeticException b)
        {
            System.out.println("Arithmetic exception");
        }
        catch(Exception e)
        {
            System.out.println("Hello Tom");
        }
    }
    
}
