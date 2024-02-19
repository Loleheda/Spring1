package ru.pinchuk.models;

import org.springframework.stereotype.Component;
import ru.pinchuk.models.enums.Subject;

import java.util.List;

@Component("teacher")
public class Teacher {
    private String name;
    private Subject subject;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                ", students=" + students +
                '}';
    }
}
