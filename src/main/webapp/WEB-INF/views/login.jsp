<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/3/28
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<h1>LOGIN</h1>
<%
if(!(request.getAttribute("message")==null)){
    out.println(request.getAttribute("message"));
}
%>
<%
    Cookie[] allCookies=request.getCookies();
    String username="",password="",rememberMeVal="";
    if(allCookies!=null){
        for(Cookie c:allCookies){
            if(c.getName().equals("cUsername")){
                username=c.getValue();
            }
            if(c.getName().equals("cPassword")){
                password=c.getValue();
            }
            if(c.getName().equals("cRemeberMe")){
                rememberMeVal=c.getValue();
            }
        }
    }
%>

<form action="/YanYiran2020211001001202/login" method="post">
                <label>Username</label>
                <input type="text" name="username" id="username" value="<%=username%>" class="form-control" placeholder="Enter one Username" required autofocus><br/>
                <label>password</label>
                <input type="password" name="password" id="password" value="<%=password%>" class="form-control" placeholder="Please input a password" required><br/>

                <input type="checkbox" name="rememberMe" value="1" <%=rememberMeVal.equals("1")?"checked":""%>checked/>RememberMe<br/>
                <button type="submit" class="btn btn-primary" id="btn-reg">login</button>
</form>

<%@include file="footer.jsp"%>