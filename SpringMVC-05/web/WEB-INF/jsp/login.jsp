<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/28
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>注册页面</title>
</head>
<style>
    body{
        background-color:seagreen;
    }
    div{
        margin: 100px auto;
        text-align: center;
    }
</style>
<body>
<div id="one">
    <form action="<c:url value="/insert"/>" method="post">
      <p>
          <label>
            账号
            <input type="text" name="name">
        </label>
      </p>
        <p>
        <label>
            密码
            <input type="password" name="pwd">
        </label>
        </p>

        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
