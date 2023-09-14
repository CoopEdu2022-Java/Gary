package twoone;
import java.util.ArrayList;
public class H5 {
    public static void main(String[] args){
        Book book1 = new Book("The Da Vinci Code", "Dan Brown", "978-0307474278");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", "978-0062315007");
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupéry", "978-0156012195");
        Book.addCollection(book1);
        Book.addCollection(book2);
        Book.addCollection(book3);
        Book.printCollection();
        Book.removeCollection(book2);
        Book.printCollection();


    }
}

class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList < Book > bookCollection = new ArrayList < Book > ();
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public static void addCollection(Book book){
        bookCollection.add(book);
        
    }
    public static void printCollection(){
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }
    public static void removeCollection(Book book){
        bookCollection.remove(book);
    }
    
       
    

}