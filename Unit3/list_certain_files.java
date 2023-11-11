import java.io.*;
class list_certain_files {
    public static void main(String args[])
    {
      File f= new File("D:/Java Program/Unit3");
      String arr[]=f.list();
      for(String str : arr)
      {
        if(str.endsWith(".class"))
        {
            System.out.println(str);
        }
      }


    } 
}
