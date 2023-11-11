class exceptionHandling
{
    public static void main(String[] args)
    {
        int a=10,b=5,c=5,x=5;
        try
        {
              x=a/(b-c);
        }
        catch(Exception e)
        {
            System.out.println("Divide by Zero error ");

        }
        int y=a/(b+c);
        System.out.println(y);  
        System.out.println(x);
    }
}




