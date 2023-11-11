import java.io.File;
class transferFile {
    public static void main(String[] args)throws Exception 
    {
        File f= new File("D:/Java Program/Unit2","B.txt");
        boolean a= f.createNewFile();
        System.out.println(a);
    }   
}


