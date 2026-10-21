package model;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private boolean available;


//Constructors
   public Book(int bookId, String bookTitle, String bookAuthor, boolean available){
    this.bookId= bookId;
    this.bookTitle= bookTitle;
    this.bookAuthor= bookAuthor;
    this.available= available;
   } 

//Getters
public int getBookId(){
return bookId;
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
public void setBookId(int bookId){
    this.bookId= bookId;
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
    return "Book[Book ID=" +bookId+ ",Book Title= "+bookTitle+" ,Author= "+bookAuthor+ ",Available= "+available+ "]";
}

}
