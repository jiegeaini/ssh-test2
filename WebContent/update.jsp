<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="bootstrap.css" type="text/css" />
</head>
<body>
	<form action="update" role="form" style="width:50%;margin:0 auto">
	<div class="form-group">
    <label for="name">id</label>
    <input type="text" value="${param.id}" class="form-control" name="user.id" />
  	</div>
	<div class="form-group">
    <label for="name">名称</label>
    <input type="text" class="form-control" name="user.name" placeholder="请输入姓名" />
  	</div>
  	<div class="form-group">
    <label for="name">密码</label>
    <input type="text" class="form-control" name="user.password"  placeholder="请输入密码" />
  	</div>
  	<div class="form-group">
    <label for="name">手机</label>
    <input type="text" class="form-control" name="user.phone" placeholder="请输入手机" />
  	</div>
  	<div class="form-group">
    <label for="name">故事</label>
    <input type="text" class="form-control" name="user.story"  placeholder="请输入故事" />
  	</div>
		<button type="submit" class="btn btn-default">tijiao</button>
	</form>
</body>
</html>