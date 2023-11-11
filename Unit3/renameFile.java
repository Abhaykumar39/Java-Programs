import java.io.File;
public class renameFile {
    public static void main(String args[])
    {
       File f = new File("A.txt");
       File r = new File ("tom.txt");

       System.out.println(f.renameTo(r));
    }
    
}
