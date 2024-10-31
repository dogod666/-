<%--
  Created by IntelliJ IDEA.
  User: muye
  Date: 2024-10-22
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学生</title>
</head>
<body>
<h2>新增学生信息</h2>
<form action="AddStudentServlet" method="post">
    <label>学号: </label>
    <input type="text" name="studentId"><br>
    <label>姓名: </label>
    <input type="text" name="name"><br>
    <label>专业: </label>
    <input type="text" name="major"><br>
    <input type="submit" value="保存">
</form>
<br>
<a href="index.jsp">返回成绩列表</a>
</body>
</html>
