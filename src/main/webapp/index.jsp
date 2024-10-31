<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="com.example.student2.Student" %>
<%@ page import="com.example.student2.StudentRepository" %>
<html>
<head>
    <title>学生成绩管理</title>
</head>
<body>
<h2>当前学生成绩信息</h2>
<form action="ScoreServlet" method="post">
    <table border="1">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>专业</th>
            <th>平时成绩</th>
            <th>期末成绩</th>
            <th>总成绩</th>
            <th>操作</th>
        </tr>
        <%
            List<Student> students = StudentRepository.getAllStudents();
            for (Student student : students) {
        %>
        <tr>
            <td><%= student.getStudentId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getMajor() %></td>
            <td><input type="text" name="regularScore_<%= student.getStudentId() %>" value="<%= student.getRegularScore() %>"></td>
            <td><input type="text" name="finalScore_<%= student.getStudentId() %>" value="<%= student.getFinalScore() %>"></td>
            <td><input type="text" name="totalScore_<%= student.getStudentId() %>" value="<%= student.getTotalScore() %>" readonly></td>
            <td><a href="ScoreServlet?action=delete&studentId=<%= student.getStudentId() %>">删除</a></td>
        </tr>
        <%
            }
        %>
    </table>
    <input type="submit" value="保存成绩">
</form>
<br>
<a href="addStudent.jsp">新增学生</a>
</body>
</html>