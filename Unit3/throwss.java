class test {
    void show(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }

}

class throwss {
    public static void main(String[] args){
        test t=new test();
        try{
              t.show(20, 0);
        }
        catch(ArithmeticException e)
        {
           System.out.println("ArithmeticException");
        }


    }

}
 