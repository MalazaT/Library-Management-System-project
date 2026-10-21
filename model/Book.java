package model;

public class Book {
    private int bookID;
    private String bookTitle;
    private String bookAuthor;
    private boolean available;


//Constructors
   public Book(int bookID, String bookTitle, String bookAuthor, boolean available){
    this.bookID= bookID;
    this.bookTitle= bookTitle;
    this.bookAuthor= bookAuthor;
    this.available= available;
   } 

//Getters
public int getBookID(){
return bookID;
}

public String getBookTitle() {
    return bookTitle;
}

public String getBookAuthor() {
    return bookAuthor;
}

public boolean isAvailable() {
    return available;
}

//Setters
public void setBookID(int bookID){
    this.bookID= bookID;
}

public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
}

public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
}

public void setAvailable(boolean available) {
    this.available = available;
}

//To String method
@Override 
public String toString(){
    return "Book[Book ID=" +bookID+ ",Book Title= "+bookTitle+" ,Author= "+bookAuthor+ ",Available= "+available+ "]";
}

}
