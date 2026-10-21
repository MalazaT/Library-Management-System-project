package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import model.Book;

public class BooksDAO {
    //Add Books to mySql
    public void addBook(Book book)throws SQLException{
        try( Connection con=DBConnection.getConnection()){
            PreparedStatement ps= con.prepareStatement(
                "Insert into books(book_title,book_author,available) values(?,?,?)"
            );

            
            ps.setString(1, book.getBookTitle());
            ps.setString(2, book.getBookAuthor());
            ps.setBoolean(3, book.isAvailable());
            ps.executeUpdate();
    }
  }

  //View Books on mySql
  public List<Book> getAllBooks() throws SQLException{
    List<Book> List=new ArrayList<>();

    try( Connection con= DBConnection.getConnection()){
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery(
            "Select * from books"
        );

        while (rs.next()){
            List.add(new Book(
              rs.getInt("book_id"),
              rs.getString("book_title"),
              rs.getString("book_author"),
              rs.getBoolean("available")
            ));
        }
    }
    return List;
  }

  //Update/Change availability
  public void updateBookAvailability(int bookID, boolean available) throws SQLException{
    try( Connection con= DBConnection.getConnection()){
      PreparedStatement ps=con.prepareStatement(
            "Update books set available=? where book_id=?"
        );

        ps.setBoolean(1, available);
        ps.setInt(2, bookID);
        ps.executeQuery();
    }
  }

  //Delete/ remove a Book
  public void deleteBook(int bookID) throws SQLException{
    try (Connection con= DBConnection.getConnection()){
        PreparedStatement ps=con.prepareStatement(
            "Delete from books where book_id=?"
        );

        ps.setInt(1, bookID);
        ps.executeQuery();
    }
  }

  
}
