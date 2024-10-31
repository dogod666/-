package com.example.student2;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ScoreServlet", value = "/ScoreServlet")
public class ScoreServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 更新所有学生的成绩
        for (Student student : StudentRepository.getAllStudents()) {
            String regularScoreStr = request.getParameter("regularScore_" + student.getStudentId());
            String finalScoreStr = request.getParameter("finalScore_" + student.getStudentId());

            if (regularScoreStr != null && finalScoreStr != null) {
                int regularScore = Integer.parseInt(regularScoreStr);
                int finalScore = Integer.parseInt(finalScoreStr);
                StudentRepository.updateStudent(student.getStudentId(), regularScore, finalScore);
            }
        }
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理删除操作
        String action = request.getParameter("action");
        String studentId = request.getParameter("studentId");

        if ("delete".equals(action) && studentId != null) {
            StudentRepository.removeStudent(studentId);
        }
        response.sendRedirect("index.jsp");
    }

    public void destroy() {
    }
}