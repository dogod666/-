package com.example.student2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static List<Student> students = new ArrayList<>();

    public static List<Student> getAllStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void removeStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    public static void updateStudent(String studentId, int regularScore, int finalScore) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setRegularScore(regularScore);
                student.setFinalScore(finalScore);
                student.setTotalScore((regularScore + finalScore) / 2);
            }
        }
    }
}

