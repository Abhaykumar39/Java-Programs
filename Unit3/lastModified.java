import java.io.*;

class lastModified {
    public static void main(String args[])
    {
        File f= new File("Tom.txt");
        System.out.println(new Date(f.lastModified()));
    }
}