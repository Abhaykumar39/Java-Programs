import java .util.Scanner;
class reverse_of_number {
    int n;
    void getdata(int i)
    {
        n=i;
    }
    void putddata()
    {
        int rev=0;
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("Reverse: " + rev);
    }
    public static void main(String[] args)
    {
        int m;
        reverse_of_number aa = new reverse_of_number();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        m=sc.nextInt();
        aa.getdata(m);
        aa.putddata();
        sc.close();
    }
    
}
