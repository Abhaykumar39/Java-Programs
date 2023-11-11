public class Stringfunction {
    public static void main(String[] args) {
        String s1 = "alpha beeta lorem lymsom";
        String arr[] = s1.split(" "); 
        for (String i : arr) {
            System.out.println(i);
        }
        System.out.println(s1.indexOf("a",5));
        System.out.println(s1.indexOf("beeta"));
        System.out.println(s1.lastIndexOf("a"));

        String s2 = "lorem lymsom";
         System.out.println(s2.substring(0,5));
         System.out.println(s2.substring(5));

         String str1= new String("alpha");
         String str2= new String("alpha");
         System.out.println(str1==str2);
         System.out.println(str1.equals(str2));

         String s3="alpha";
         String s4="alpha";
         System.out.println(s3==s4);
         System.out.println(s3.equals(s4));

         String s5="aplha beeta";
         char arr1[]=s5.toCharArray();
         System.out.print(arr1[3]);

         System.out.println("starts: "+s5.startsWith("a"));
         System.out.println(s5.endsWith("a"));
         String s6="lorem lymsom Alpha";
         System.out.println(s6.contains("Alpha"));
         System.out.println(s6.contains("pha"));
    }
}

