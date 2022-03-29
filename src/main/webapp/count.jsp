<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/3/28
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counter JSP</title>
</head>
<body>
This is Count JSP page.<br>
<%! int count=0;%>
The Page count is now : <%out.println(++count);%>
</body>
</html>
