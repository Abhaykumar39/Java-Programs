class multiple_try_block {   
        public static void main(String[] args)
        {
        try{
               try {
                
        int b[]= new int[5];
                b[6]=10;
            
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println("Out of bounds exception");
            }
            try{
                 int a=5/0;
                System.out.println(a);
            }
            catch(ArithmeticException b)
            {
                System.out.println("Arithmetic exception");
            }
        }
            catch(Exception e)
            {
                System.out.println("Hello Tom");
            }
        }
    }
    
