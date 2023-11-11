
class students {
    int roll;
    String name;
    static String Cname = " Abc college";

 students(int x , String y)
    {
        roll = x;
        name = y;
    }
    void display()
    {
        System.out.println("Roll: " + roll + " Name: "+ name + " College name : "+ Cname);
    }
    static void change()
    {
        Cname = " Graphic era college ";
    }
}
class staic_member_function
{
    public static void main(String[] args)
    {
        students aa = new students(101,"Ram");
        aa.display();
        students.change();
        aa.display();
    }
}