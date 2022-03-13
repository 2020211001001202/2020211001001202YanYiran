<%--
  Created by IntelliJ IDEA.
  User: 86181
  Date: 2022/3/6
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8" language="java"%>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-4">
        </div>
        <div class="col-md-4">

            <form class="form-signin" action="reg-submit.jsp" method="post">
                <h2 class="form-signin-heading">New User Registration!</h2>
                <div id="info">

                </div>
                <label>Username</label>
                <input type="text" name="username" id="username" class="form-control" placeholder="Enter one Username" required autofocus><br>
                <label>password</label>
                <input type="password" name="password" id="password" class="form-control" placeholder="Please input a password" required><br>
                <label>Email</label>
                <input type="email" name="email" id="email" class="form-control" placeholder="Please enter email address" required maxLength="16"><br>
                <label>Gender</label>
                <input type="radio" name="gender" id="gender"   required>Male
                <input type="radio" name="gender"    required>Female<br><br>

                <label>Date of Birth</label>
                <input type="date" name="birthday" id="birthday" class="form-control" placeholder="Please enter birthday" required><br>

                <button type="submit" class="btn btn-primary" id="btn-reg">register</button>

            </form>
        </div>
        <div class="col-md-4">
        </div>
    </div>
</div>
</body>
</html>

