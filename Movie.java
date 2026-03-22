public class Movie extends Item
{
    //Fields
    private int duration; //(inminutes)
    //Default Constructor 
    public  Movie()
    {
        super();
        this.duration = 0; 
    }
    //Contructor with parameters
    public Movie(String title, int year, int duration)
    {
        super(title, year);
        this.duration = duration;  
    }  
    //Setters
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    //Getters
    public int getDuration()
    {
        return duration;
    }
    //Method
    public String toString()
    {
        return  "Movie Item: Title: " + getTitle() +
           ", Year: " + getYear() +
           ", Duration: " + duration + " minutes";
    }
}