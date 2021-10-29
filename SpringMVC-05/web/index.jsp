<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"  %>

<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>
  <style>
    body{
      background-color:seagreen;
    }
    #one{
      text-align: center;
      position: relative;
      top: 150px;
      left: auto;
    }
    .bt{
      width: 50px;
      height: 25px;
      background-color: seagreen;
      border: green;
      font-size: 15px;
    }
    .bt:hover{
      color: yellow;
    }
    a{
      text-decoration: none;
      color: #000000;
    }

  </style>
</head>
<body><div id="one">
  <h3>图书借阅登入页面</h3>
  <form action="<c:url value="/select"/>" method="post">
    <p> 账号<label>
      <input type="text" name="name"/>
    </label></p>
    <p>密码<label>
      <input type="password" name="pwd"/>
    </label></p>
    <p>
      <input type="submit" value="登入" class="bt"/>
      <a href="${pageContext.request.contextPath}/toInsert" class="bt">注册</a>
    </p>
  </form>
 <p> <a href="admin.jsp" class="bt">管理员登入</a></p>
</div>


</body>
</html>
