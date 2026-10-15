package model;

public class issuedBooks {
    private int issueId;
    private int bookId; 
    private int studentId;
    private String issueDate;  
    
    public issuedBooks(int issueId, int bookId, int studentId, String issueDate) {
        this.issueId = issueId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override 
    public String toString() {
        return "issuedBooks{" +
                "issueId=" + issueId +
                ", bookId=" + bookId +
                ", studentId=" + studentId +
                ", issueDate='" + issueDate + '\'' +
                '}';
    } 
    
}
