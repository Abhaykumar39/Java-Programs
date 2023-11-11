 import java.io.File;
 class isfile_isdirectory {
    public static void main(String args[])
    {
        File f= new File("D:/java program/Unit3","A.txt");
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

    }
}
