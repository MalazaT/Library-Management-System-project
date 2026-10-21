package model;

import java.time.LocalDate;

public class IssueBook {
    private int issueID;
    private int bookID;
    private String studNumber;
    private LocalDate issueDate;
    private LocalDate returnDate;

    //Constructors
    public IssueBook(int issueID, int bookID, String studNumber,LocalDate issueDate, LocalDate returnDate){
        this.issueID= issueID;
        this.bookID= bookID;
        this.studNumber= studNumber;
        this.issueDate= issueDate;
        this.returnDate= returnDate;
    }

    //Getters
    public int getIssueID(){
        return issueID;
    }

    public int getBookID(){
        return bookID;
    }

    public String getStudNumber(){
        return studNumber;
    }

    public LocalDate getIssuedDate(){
        return issueDate;
    }

    public LocalDate getReturndate(){
        return returnDate;
    }


    //Setters
    public void setIssueID(int issueID) {
        this.issueID = issueID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setStudNumber(String studNumber) {
        this.studNumber = studNumber;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


}
