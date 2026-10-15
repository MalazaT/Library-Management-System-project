package model;

public class book {
    private int bookId;
    private String bookName;
    private String author;  
    private boolean available;

    public book(int bookId, String bookName, String author, boolean available) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.available = available;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }       

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override 
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", available=" + available + "]";
    }
}
