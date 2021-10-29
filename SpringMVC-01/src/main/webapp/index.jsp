<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" %>
<html>
<style>
    #one{
        margin:auto;
    }
</style>
<body>

<div id="one">
    <h2>Hello World!</h2>
<form method="post" action="<c:url value="/hello"/>">
    测试 <input type="text" name="name">
    <input type="submit" value="提交">
</form>
</div>
</body>
</html>
