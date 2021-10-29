<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/23
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      a:hover{
        color: green;
        font-size: 15px;
      }
    </style>
  </head>
  <body>
  $END$
  <a href="<c:url value="/hello"/>">点击</a>
  <a href="<c:url value="/hello1"/>">点击1</a>
  </body>
</html>
