class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Threads A"+i);
        }
    }
}
public class Runnable_interface {
    public static void main(String[] args)
    {
        A aa = new A();
        Thread th = new Thread(aa);
        th.start();
    }
    
}
