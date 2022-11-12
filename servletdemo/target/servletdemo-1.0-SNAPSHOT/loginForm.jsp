<%--
  Created by IntelliJ IDEA.
  User: rajbh
  Date: 12-11-2022
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" >
    <label for="fname">First name:</label>
    <input type="text" id="fname" name="fname"><br><br>
    <label for="lname">Last name:</label>
    <input type="text" id="lname" name="lname"><br><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
<%!String name;
String lastName;
%>
<%
name = request.getParameter("fname");
lastName = request.getParameter("lname");
%>

