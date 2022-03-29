<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/3/28
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<h2>LOGIN</h2>
                </div>
<form action="/YanYiran2020211001001202/login" method="post">
                <label>Username</label>
                <input type="text" name="username" id="username" class="form-control" placeholder="Enter one Username" required autofocus><br>
                <label>password</label>
                <input type="password" name="password" id="password" class="form-control" placeholder="Please input a password" required><br>
                <button type="submit" class="btn btn-primary" id="btn-reg">login</button>
</form>

</div>
<%@include file="footer.jsp"%>