package dao;


import java.sql.*;
import db.DBConnection;



public class issuedBooksDAO {

//Issue a book to a Student
public void issueBook(int bookID, String studNumber) throws SQLException{
    String issueQuery=
    "INSERT INTO IssuedBook (book_id, student_number, issue_date, return_date) " +
    "VALUES (?, ?, CURDATE(), NULL)";

    String updateBookQuery=
    "Update book SET available= false WHERE book_id=?";

    try(Connection con= DBConnection.getConnection();
        PreparedStatement issueStmt= con.prepareStatement(issueQuery);
        PreparedStatement updateStmt=con.prepareStatement(updateBookQuery)){

            issueStmt.setInt(1, bookID);
            issueStmt.setString(2, studNumber);
            issueStmt.executeQuery();

            updateStmt.setInt(1, bookID);
            updateStmt.executeQuery();
    }

}

//Return a Book
public void returnBook(int bookID) throws SQLException{
    String returnQuery=
    "Update IssuedBook into SET return_date= CURDATE() WHERE book_id=? AND return_date is NULL";

    String UpdateQuery=
    "Update books SET available= true WHERE book_id=?";

    try(Connection con= DBConnection.getConnection();
        PreparedStatement returnStmt= con.prepareStatement(returnQuery);
        PreparedStatement updateStmt= con.prepareStatement(UpdateQuery)){

            returnStmt.setInt(1,bookID);
            returnStmt.executeQuery();

            updateStmt.setInt(1, bookID);
            updateStmt.executeUpdate();

        }
}

//Check if a Book is Issued
public boolean isBookIssued(int bookID) throws SQLException{
    String query=
    "Select * from issuedBook WHERE book_id=? AND return_date is NULL";

    try(Connection con=DBConnection.getConnection();
    PreparedStatement ps=con.prepareStatement(query)){
        ps.setInt(1, bookID);

        try(ResultSet rs=ps.executeQuery()){
            return rs.next();
        }
    }
}


//View issued Books
public ResultSet viewAllIssuedBooks() throws SQLException{
    Connection con= DBConnection.getConnection();
    Statement st= con.createStatement();

    return st.executeQuery(
        "Select * from issuedBooks"
    );

}



}
