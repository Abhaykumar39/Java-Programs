class static_instance_local
{
    int a=10;
    static int b=20;
    public static void main(String args[])
    {
        static_instance_local aa = new static_instance_local();
       int c=30;
       System.out.println("The value of local variable" + c);
       System.out.println("The value of static variable" + static_instance_local.b);
       System.out.println("The value of static variable" + b);
       System.out.println("The value of Instancee variable" + aa.a);
    }
}
    
