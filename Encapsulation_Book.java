// create class book. private fields= title, author. getter and setters. display book details

package encapsulation;

public class Book {
	
	
    private String title;     // Private variables
    private String author;

 
    public void setTitle(String newTitle) {     // Setter methods
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        Book b = new Book();    // Creating object


        b.setTitle("Java Programming");         // Setting values
        b.setAuthor("James Gosling");

 
        System.out.println("Book Title: " + b.getTitle()); //       // Displaying book details
        System.out.println("Author: " + b.getAuthor());

	}

}
