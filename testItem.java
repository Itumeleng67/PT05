import java.util.ArrayList;
import java.util.Scanner;

public class testItem
{
    public static void main(String[] args)
    {
        ArrayList<Item> items = new ArrayList<>();

        Book b1 = new Book("Harry Potter", 2001, "J.K. Rowling");
        Movie m1 = new Movie("Avatar", 2009, 162);

        items.add(b1);
        items.add(m1);
        
        displayItems(items);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = input.nextLine();

        int index = findItem(items, title);
        System.out.println("Index: " + index);

        sortItems(items);
        displayItems(items);
    }

    // DISPLAY
    public static void displayItems(ArrayList<Item> items)
    {
        for(Item i : items)
        {
            if(i instanceof Book)
            {
                System.out.println("Book Item: " + i);
            }
            else if(i instanceof Movie)
            {
                System.out.println("Movie Item: " + i);
            }
        }
    }

    //Method find item 
    public static int findItem(ArrayList<Item> items, String title)
    {
        for(int i = 0; i < items.size(); i++)
        {
            //use get to  retrive the item object at index i
            //get title to get the string to compare 
            if(items.get(i).getTitle().equalsIgnoreCase(title))
            {
                return i; 
            }      
        }
        return -1;
    }
    
    public static void sortItems(ArrayList<Item> items)
    {
         for(int i = 0; i < items.size() - 1; i++)
        {
            for(int j = 0; j < items.size() - i - 1; j++)
            {
                //Used bubble sorting to sort them by title 
                if (items.get(j).getTitle().compareToIgnoreCase(items.get(j + 1).getTitle()) > 0)
                {
                    Item temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }
    }
}                 