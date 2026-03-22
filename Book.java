public class Book extends Item
{
    //Fields
    private String author;
    //Default Constructor 
    public Book()
    {
        super();
        this.author = "";
    }
    //Contructor with parameters
    public Book(String title, int year,String author)
    {
        super(title, year);
        this.author = author;  
    }
    //Setters
    public void setBook(String author)
    {
        this.author = author;
    }
    //Getters
    public String getBook()
    {
        return author;
    }
    //Method
    public String toString()
    {
        return  "Book Item: Title: " + getTitle() +
                ", Year: " + getYear() +
                ", Author: " + author;
    }
}