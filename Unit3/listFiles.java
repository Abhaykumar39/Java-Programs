import java.io.*;
class listFiles {
    public static void main(String args[])throws Exception 
    {
        File f = new File("D:/java program/Unit3");
        File arr[]= f.listFiles();
        for(File st:arr)
        {
            System.out.println(st);
        }
    }
    
}
