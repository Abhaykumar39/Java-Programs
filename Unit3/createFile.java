import java.io.File;
class createFile
{
    public static void main(String args[]) throws Exception
    {
        File f= new File("A.txt");
        boolean y=(f.createNewFile());
        System.out.println(y);

    }
}
