package model;

public class Student {
    private int studentId;
    private String studNumber;
    private String studentName;
    private String studentEmail;


    //Constructors
public Student( int studentId, String studNumber, String studentName, String studentEmail){
    this.studentId= studentId;
    this.studNumber= studNumber;
    this.studentName= studentName;
    this.studentEmail= studentEmail;
}

//Getters
public int getStudID(){
    return studentId;
}

public String getStudNum(){
    return studNumber;
}

public String getStudname(){
    return studentName;
}

public String getStudEmail(){
    return studentEmail;
}

//Setters
public void setStudID(int studentId){
    this.studentId=studentId;
}

public void setStudNum(String studentNumber){
    this.studNumber=studentNumber;
}

public void setStudName(String studentName){
    this.studentName=studentName;
}

public void setStudEmail(String studentEmail){
    this.studentEmail=studentEmail;
}

//To String method
@Override
public String toString(){
    return "Student[Student ID= "+studentId+ ",Student Number= "+studNumber+ ",Student Name= "+studentName+ ",Student Email= "+studentEmail+ "]";
} 
}
