import java.io.*;
class WriteFile {
    public static void main(String args[]) throws Exception
    {
        FileWriter fw= new FileWriter("A.txt");
        fw.write("Hello World");
        fw.write("Bhupendra jogi");
        fw.close();

    } 
}
