<%@ page import="com.YanYiran.model.User" %>
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
<%
    Cookie [] allCookies=request.getCookies();
    for(Cookie c:allCookies){
        out.println("<br/>"+c.getName()+"---"+c.getValue());
    }
%>
<%
 User u=(User) session.getAttribute("user");
%>

<table>
    <tr>
        <td>Username:</td><td><%=u.getUsername()%></td>
        <td>password:</td><td><%=u.getPassword()%></td>
        <td>email:</td><td><%=u.getEmail()%></td>
        <td>gender:</td><td><%=u.getGender()%></td>
        <td>birthDate:</td><td><%=u.getbirthDate()%></td>
    </tr>

</table>

<%@include file="footer.jsp"%>
