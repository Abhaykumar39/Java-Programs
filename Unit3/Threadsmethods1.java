
class A extends Thread
{
     public void run()
     {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            {
                
                Thread.yield();
            }
            System.out.println("i="+i);
        }
     } 
}
class B extends Thread
{
     public void run()
     {
        for(int j=1;j<=5;j++)
        {
            System.out.println("j="+j);
            
            if(j==3)
            {
               isInterrupted();
              
            }
            
        }
     } 
}
class C extends Thread
{
     public void run()
     {
        for(int k=1;k<=5;k++)
        {
             System.out.println("k="+k);
            if(k==1)
            try
            {
                sleep(1000);
            }
            catch(Exception e)
            {

            }
           
        }
     } 
}

 class Threadsmethods1 {
    public static void main(String args[])
    {
        A a1 = new A();
        B b1 =new B();
        C c1 = new C();
        a1.start();
        b1.start();
        c1.start();
    }
    
}
