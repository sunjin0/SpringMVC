<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
  <title>书籍列表</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 引入 Bootstrap -->
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>书籍列表 —— 显示所有书籍</small>
        </h1>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="col-md-4 column">
    </div>
  </div>

  <div class="row clearfix">
    <div class="col-md-12 column">
      <table class="table table-hover table-striped">
        ${msg}
        <thead>
        <tr>
          <th>书籍编号</th>
          <th>书籍名字</th>
          <th>书籍数量</th>
          <th>书籍详情</th>
          <th>操作</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="book" items="${requestScope.get('list')}">
          <tr>
            <td>${book.getbookID()}</td>
            <td>${book.getbookName()}</td>
            <td>${book.getbookCounts()}</td>
            <td>${book.getdetail()}</td>
            <td>
              <a href="${pageContext.request.contextPath}/book/studyBook${book.getbookID()}">借读</a> |
              <a href="${pageContext.request.contextPath}/book/studyBook2${book.getbookID()}">归还</a>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>