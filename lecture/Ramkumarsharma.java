 class Ramkumarsharma {
    public static void main(String args[])
    {
        String str= "Abhay kumar";
        String arr[]=str.split(" ");
        String s2="";
        for(int i=0; i<arr.length-1; i++)
        {
            s2=s2+arr[i].charAt(0)+".";
        }
        System.out.println(s2);
        s2=s2+arr[arr.length-1];
        System.out.println(s2);
    }
    
}
