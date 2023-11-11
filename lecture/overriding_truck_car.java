class Truck
{
    void  Horn()
    {
        System.out.println("HORN");
    }
    void speed()
    {
        System.out.println("250");
    }
    void st()
    {
        System.out.println("Round");
    }
}
class Car extends Truck
{
    void display()
    {
        System.out.println("Display");
    }
    void Horn()
    {
        System.out.println("pee pee");
    }
    void speed()
    {
        System.out.println("300");
    }
}
class overriding_truck_car 
{
    public static void main(String args[])
    {
        Truck obj2 = new Truck();
        obj2.speed();
        Car obj = new Car();
        obj.Horn();
        obj.display();
        obj.speed();
        obj.st();
        
    }
}
