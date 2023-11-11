class student
{
    String name ;
    int id,fee;
    
    student()
    {
        name="Abhay kumar";
        id=02;
        fee=50000;
    }
    void display()
    {
        System.out.println(" Name:"+name+" Id:"+id + "Fee: "+fee);
    }
}
class default_constructor_student 
{
    public static void main(String[] args)
    {
        student aa = new student();
        aa.display();
    }
    
}
