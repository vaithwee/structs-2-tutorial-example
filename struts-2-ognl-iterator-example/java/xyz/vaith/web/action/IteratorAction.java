package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.model.Student;

import java.util.ArrayList;
import java.util.List;

public class IteratorAction extends ActionSupport {
    public List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public String iterator() {
        students = new ArrayList<>();
        students.add(new Student("wee", 18, "Fuzhou"));
        students.add(new Student("vaith",12,"Hangzhou"));
        students.add(new Student("hello", 38,"New York"));
        students.add(new Student("Tom", 1, "WC"));
        return SUCCESS;
    }
}
