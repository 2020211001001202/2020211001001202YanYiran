<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/4/5
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>

<table>
    <tr>
        <td>Username:</td><td><%=request.getAttribute("username")%></td>
        <td>password:</td><td><%=request.getAttribute("password")%></td>
        <td>email:</td><td><%=request.getAttribute("email")%></td>
        <td>gender:</td><td><%=request.getAttribute("gender")%></td>
        <td>birthDte:</td><td><%=request.getAttribute("birthDate")%></td>
    </tr>

</table>

<%@include file="footer.jsp"%>
