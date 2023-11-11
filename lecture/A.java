class A
{
public static void main(String args[])
{
    int arr[] = {1,2,3,4,5};
    int b[]= new int [5];
    int k=0;
    
    for(int i = arr.length-1;i>=0 ; i--)
    {
       b[k] = arr[i];
       System.out.println(b[k]);
        k++;
    } 
}
}

