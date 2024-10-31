package com.example.student2;


import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String major = request.getParameter("major");

        if (studentId != null && name != null && major != null) {
            Student newStudent = new Student(studentId, name, major, 0, 0);
            StudentRepository.addStudent(newStudent);
        }
        response.sendRedirect("index.jsp");
    }
}
