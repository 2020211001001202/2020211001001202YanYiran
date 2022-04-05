<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/3/6
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>

        <h3>This is my registerJSP page.<br/><br/></h3>
                </div>
<form method="post" action="/YanYiran2020211001001202/register">
                <label>Username</label>
                <input type="text" name="username" id="username" class="form-control" placeholder="Enter one Username" required autofocus><br><br>
                <label>password</label>
                <input type="password" name="password" id="password" class="form-control" placeholder="Please input a password" required><br><br>
                <label>Email</label>
                <input type="email" name="email" id="email" class="form-control" placeholder="Please enter email address" required ><br><br>
                <label>Gender</label>
                <input type="radio" name="gender" id="gender" value="male"   required>Male
                <input type="radio" name="gender" value="female"    required>Female<br><br>

                <label>Date of Birth</label>
                <input type="text" name="birthday" id="birthday" class="form-control" placeholder="Please enter birthday" required><br><br>

                <button type="submit" class="btn btn-primary" id="btn-reg">register</button>
</form>

</div>
<%@include file="footer.jsp"%>
