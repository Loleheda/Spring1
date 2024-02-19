package ru.pinchuk.models;

import ru.pinchuk.models.enums.Subject;

import java.util.List;
import java.util.Map;

public class Student {

    private String name;
    private Map<Subject, Integer> grades;
    private boolean enrolled = false;

    public Student(String name, Map<Subject, Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void init() {
        if (calcAvgGrades() >= 3.0) {
            setEnrolled(true);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subject, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<Subject, Integer> grades) {
        this.grades = grades;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public double calcAvgGrades() {
        List<Integer> grades = (List<Integer>) getGrades().values();
        return (double) grades.stream().mapToInt(Integer::intValue).sum() / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", enrolled=" + enrolled +
                '}';
    }
}
