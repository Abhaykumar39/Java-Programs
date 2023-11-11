class A{
    int a =30;
    void display()
    {
        int a = 50;

        System.out.println(a);
        System.out.println(this.a);
    }

}
class this_keyword {
    
    public static void main(String[] args)
    {
       A aa = new A();
       aa.display();
    }
    
}
