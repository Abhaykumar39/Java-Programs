
class A extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println("j=" + j);
        }
    }
}

class C extends Thread
{
    public void run() {
        for (int k = 0; k < 5; k++) {
            System.out.println("k=" + k);
        }
    }
}

public class Threadsetget {
    public static void main(String[] args)
    {

        A a1=new A();
        B b1=new B();
        C c1=new C();

        c1.setPriority(10);
        b1.setPriority(5);
        a1.setPriority(1);

        a1.start();
        b1.start();
        c1.start();

    } 
}