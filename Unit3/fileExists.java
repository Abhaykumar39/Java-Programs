import java.io.File;
class fileExists {
    public static void main(String args[])
    {
        File f = new File("A.txt");
        System.out.println(f.exists());
    }
    
}
