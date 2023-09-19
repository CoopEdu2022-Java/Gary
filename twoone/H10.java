package twoone;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String grade;
    private List<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}

public class H10 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "10th Grade");

        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");

        System.out.println("Courses: " + student.getCourses());

        student.removeCourse("Science");

        System.out.println("Updated courses: " + student.getCourses());
    }
}
