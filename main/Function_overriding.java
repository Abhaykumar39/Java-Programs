class A {
    void display() {
        System.out.println("Hello World ");

    }
}
class B extends A {
    void display() {
        System.out.println("Hello India");

    }
}
class Function_overriding {
    public static void main(String args[]) {
        A aa = new A();
        aa.display();
    }
}
