
class students {
    int roll;
    String name;
    static String Cname = "Graphic era college";

 students(int x , String y)
    {
        roll = x;
        name = y;
    }
    void display()
    {
        System.out.println("Roll: " + roll + " Name: "+ name + " College name : "+ Cname);
    }
}

class staic_data_member {
    public static void main(String args[])
    {
        students aa = new students(101,"Ram");
        aa.display();
    }

}