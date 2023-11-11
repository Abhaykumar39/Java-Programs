class Student
{
    int roll;
    void getroll(int n)
    {
        roll=n;
    }
    void putroll()
    {
        System.out.println("Roll ="+roll);
    }
}
class Test extends Student
{
    float marks1,marks2;
    void getmarks(float m1, float m2)
    {
        marks1=m1;
        marks2=m2;
    }
    void putmarks()
    {
        System.out.println("Marks1: "+marks1+" Marks2: "+marks2);
    }
}
interface sports
{
    float sportmark=6.0F;
    void putsport();
}
class Results extends Test implements sports
{
    float total;
    public void putsport()
    {
        System.out.println("Sports Marks: "+sportmark);
    }
    void display()
    {
        total=marks1+marks2+sportmark;
        putroll();
        putmarks();
        putsport();
        System.out.println("Toal Marks : "+ total);
    }
}
class student_multiple_inheritance
{
    public static void main(String args[])
    {
        Results aa = new Results();
        aa.getroll(101);
        aa.getmarks(30.5F,35.9F);
        aa.display();
    }
}