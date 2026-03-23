
public class Item
{
    //Fields
    private String title;
    private int year;

    //Default Constructor 
    public Item()
    {
        this.title = "";
        this.year = 0; 
    }
    //Contructor with parameters
    public Item(String title, int year)
    {
        this.title = title;
        this.year = year;
        
    }
    //Setters
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    //Getter
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
         return year;
    }
    public String toString()
    {
        return "Title: " + title + ", Year: " + year;
    }
}