 class conversion_of_String_int {
    public static void main(String[] args)
    {
        int k=100;
        String str= Integer.toString(k);
        System.out.println(str);
        int sum=0;

        String s="101";
        int j= Integer.parseInt(s);
        System.out.println(j);

        String s1 = "Alpha 1854 Numeric 32";
        String s2 = ""; 
        String s3 = ""; 
        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
        
            if (Character.isDigit(c)) {
                s2 = s2 + c; 
            } else {
                s3 = s3 + c; 
            }
        }
        
        System.out.println("Numeric characters: " + s2);
        System.out.println("Non-numeric characters: " + s3);

        Integer m=Integer.parseInt(s2);
        System.out.println(m); 

        while (m > 0) {
            sum += m % 10; 
            m /= 10;       
        }

        System.out.println("Sum of digits: " + sum);
    }



      
        
        
    }
    

