class printing {
    synchronized void print(String string) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(string);
            }
            System.out.println();
        }
    }
}
class A extends Thread
{
    printing p;
    A(printing p)
    {
        this.p = p;
    }
    public void run()
    {
        p.print("*");
    }
}
class B extends Thread
{
    printing p;
    B(printing p)
    {
        this.p = p;
    }
    public void run()
    {
        p.print("#");
    }
}
public class Synchronization {
    public static void main(String[] args)
    {
        printing aa= new printing();
        A threadA= new A(aa);
        B threadB= new B(aa);
        threadA.start();
        threadB.start();
    }
}
