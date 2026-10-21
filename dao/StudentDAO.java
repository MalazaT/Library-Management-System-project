package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import db.DBConnection;

public class StudentDAO {

    //add Students to mySql
    public void addStudent(Student student) throws SQLException{
        try (Connection con=DBConnection.getConnection()){
            PreparedStatement ps= con.prepareStatement(
                "Insert into student(student_number,student_name,student_email) values(?,?,?)"
            );

            
            ps.setString(1, student.getStudNum());
            ps.setString(2, student.getStudname());
            ps.setString(3, student.getStudEmail());
            ps.executeQuery();
        }
    }

    //view Students
    public List<Student> getAllStudents() throws SQLException{
        List<Student> List=new ArrayList<>();

        try( Connection con= DBConnection.getConnection()){
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(
                "Select * from student"
            );

            while (rs.next()){
                List.add(new Student(
                   rs.getInt("student_id"),
                   rs.getString("student_number"),
                   rs.getString("student_name"),
                   rs.getString("student_email")
                ));
            }
        }
        return List;
    }

    
}
