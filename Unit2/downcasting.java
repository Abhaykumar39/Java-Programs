class Parentclass  
{
    int a =10;
    static int b=20;
     Parentclass()
    {
        System.out.println("Parentclass connstuctor ");
    }
    void parent_methodExample()
    {
        System.out.println("Inside parent_methodExample ");
    }
}
class childclass extends Parentclass
{
    int c=100;
    static int d=200;
    childclass()
    {
        System.out.println("childclass constructor ");
    }
    void child_methodExample()
    {
        System.out.println("Inside child_methodExample ");
    }
}

class downcasting {
    public static void main(String[] args)
    {
          Parentclass obj= new childclass();
          ((childclass)obj).parent_methodExample();
          ((childclass)obj).child_methodExample();
          childclass c= (childclass)obj;
          System.out.println(c.a);
          System.out.println(Parentclass.b);
          System.out.println(c.c);
          System.out.println(childclass.d);
    }
    
}
