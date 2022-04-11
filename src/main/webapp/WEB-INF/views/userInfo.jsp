<%@ page import="com.YanYiran.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/4/5
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<%
 User user=(User) request.getAttribute("user");
%>

<table>
    <tr>
        <td>Username:</td><td><%=user.getUsername()%></td>
        <td>password:</td><td><%=user.getPassword()%></td>
        <td>email:</td><td><%=user.getEmail()%></td>
        <td>gender:</td><td><%=user.getbirthDate()%></td>
        <td>birthDte:</td><td><%=user.getGender()%></td>
    </tr>

</table>

<%@include file="footer.jsp"%>
