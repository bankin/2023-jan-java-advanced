package _03_StudentSysytem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void createStudent(String name, int age, double grade) {
        if (this.repo.containsKey(name)) { return; }

        Student student = new Student(name, age, grade);
        this.repo.put(name, student);
    }

    public String showStudent(String name) {
        Student student = this.repo.get(name);

        if (student == null) {
            return null;
        }

        return student.toString();
    }
}
