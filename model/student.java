package model;

public class student {
    private int studentId;
    private String studentName;
    private String email;  
    private String phoneNumber;

    public student(int studentId, String studentName, String email, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }       

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override 
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
