class reverse_String {
   public static void main(String[] args)
   {
      String str1="abhay";
      String str2="kumar";
      for(int i=str1.length()-1;i>=0;i--)
      {
        System.out.println(str1);
      }
      for(int i=0;i<str1.length();i++)
      {
        System.out.println(str1.charAt(i));
      }
      if(str1.equals(str2))
      {
        System.out.println("Both the String are Equal");
      }
      else{
        System.out.println("Both the String are not Equal");
      }
   }  
}
