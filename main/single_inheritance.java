import java.util.Scanner;

class organisation {
    Scanner sc = new Scanner(System.in);
    String name;
    String departments;

    organisation() {
        
        System.out.println("Enter the name and departments");
        name = sc.next();
        departments = sc.next(); 
    }

}

class Employee extends organisation {
    int id;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id");
        id = sc.nextInt();
        sc.close();
    }

    void print() {
        System.out.println("Name: " + name + " Department: " + departments + " ID : " + id);
    }
}

class single_inheritance  {
    public static void main(String args[]) {
        Employee aa = new Employee();
        aa.print();
    }
}
