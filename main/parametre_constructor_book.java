class Book
{
    String bookname;
    String authername;
    int price;

    Book(String a , String b , int c)
    {
        bookname = a;
        authername = b;
        price = c;
    }
    void display()
    {
         System.out.println("Book: " + bookname + "Author: " + authername + "Price: " + price);
    }
}


class parametre_constructor_book 
{
    public static void main(String args[])
    {
        Book aa = new Book("Computer Application ","Abhay kumar ", 2000);
        aa.display();
    }
    
}
