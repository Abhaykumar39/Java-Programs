import java.io.*;
class count_totalfiles_directories {
    public static void main(String args[])
    {
         File f = new File("D:/java program/Unit3");
         int count=0;
         int countf=0;

         File arr[]=f.listFiles();

         for(File st:arr)
         {
            if(st.isDirectory())
            {
                count++;
            }
            else
            {
                countf++;
            }
         }
         System.out.println("Total Directories: " + count);
         System.out.println("Total Files: " + countf);
    }
    
}
