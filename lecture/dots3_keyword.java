class dots3_keyword
{
    int sum(int... x)
    {
int sum =0;
for(int i:x)
sum=sum+i;
return sum;
    
    }
    public static void main(String args[])
    {
        dots3_keyword obj = new dots3_keyword();
        System.out.println(obj.sum(2,3,2));
    }
}
