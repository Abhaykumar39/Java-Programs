class Parentclass
{
   int a =10;
     void MethodExample()
     {
        System.out.println("Inside Parent ");
     }
}
class childclass extends Parentclass
{
   int b=100;
     void cdeMethodExample()
     {
        System.out.println("Inside child ");
     }
}
class Upcasting {
    public static void main(String[] args) 
    { 
           Parentclass obj = new childclass();
         System.out.println(obj.a);
         obj.MethodExample();// method overloading.
            
           
           
    }
}
