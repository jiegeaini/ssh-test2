<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="bootstrap.css" type="text/css" />
  <style>
  button{
  	width:35px;
  	height:19px;
  }
  .btn{
  	padding:0;
    font-size: 13px;
  }
  </style>
</head>
<body>
	<table class="table table-condensed" style="width:60%;margin: 0 auto">
	<thead>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>password</th>
			<th>phone</th>
			<th>story</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
	</thead>
	
	<tbody>
	
	</tbody>
	</table>
	 <script src="jquery.min.js"></script>
	 <script>
	 $.ajax({
			type:"get",
		    url: "find",
		    dataType: "json",
			async: false,
			success: function(data) {
				
				for(var i = 0; i < data.length; i++){
					var html = '<tr><td>'+data[i].id+'</td><td>'+data[i].name+'</td>'+
					'<td>'+data[i].password+'</td><td>'+data[i].phone+'</td><td>'+data[i].story+'</td>'+
					'<td><a href="update.jsp?id='+data[i].id+'"><button type="button" class="btn btn-info">修改</button></a></td>'+
					'<td><button onclick="del('+data[i].id+')" type="button" class="btn btn-danger">删除</button></td></tr>';
					$("tbody").prepend(html);
				}
			},
			error: function() {
				 alert("网络错误 请重试");
			}
				});	
	 
	 function del(id){
		 $.ajax({
				type:"get",
			    url: "delete",
			    dataType: "text",
			    data:{'user.id':id},
				async: false,
				success: function(data) {
					alert("删除成功")
					window.location.reload()
				},
				error: function() {
					 alert("错误 请重试");
				}
					});	
	 }
	 </script>
</body>
</html>