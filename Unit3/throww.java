 class A{
 int num=5;
        void show()
        {
            if(num%2!=0)
            {
                throw new ArithmeticException("not Even");
            }
            else
            {
                  System.out.println("Even");
            }
        }
 }
 class throww {
    public static void main(String[] args)
    {
       A a = new A();
       a.show();   
    }
}
