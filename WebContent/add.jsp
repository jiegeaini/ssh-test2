<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap.css" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<form action="add" role="form" style="width:50%;margin:0 auto">
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