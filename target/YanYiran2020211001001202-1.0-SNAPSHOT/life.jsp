<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/3/28
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    public void jspInit(){
        System.out.println("i am in jspinit()");
    }
%>
<html>
<head>
    <title>Life Cycle JSP</title>
</head>
<body>
<%System.out.println("i am in jspservice()");%>
</body>
</html>
<%!
    public void jspDestroy(){
        System.out.println("i am in jspDestroy()");
    }
%>