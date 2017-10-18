package DesignPattern.MVCPattern;

/**
 * Created by john on 2017/10/3.
 */
public class StudentController {
    Student student;
    StudentView studentView;

    public StudentController(Student student,StudentView studentView) {
        this.student = student;
        this.studentView=studentView;
    }

    public String getStudentName(){
        return student.getName();
    }
    public String getStudentRollNo(){
        return student.getRollNo();
    }
    public void setStudentName(String name){
        student.setName(name);
    }
    public void setStudentRollNo(String rollNo){
        student.setRollNo(rollNo);
    }

    public void updateView(){
        studentView.printStudentDetails(student.getName(), student.getRollNo());
    }
}
