<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="main.java.com.backend.buyerEnd.dao.UserDao,
	main.java.com.backend.buyerEnd.model.User,java.util.*" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户信息修改</title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<% 
	User user = (User)request.getSession().getAttribute("user"); 
%> 
<ul class="nav nav-pills">
	<li><a href="buyMain.jsp">主页<% request.getSession().setAttribute("sname",user.getuserName()); %></a></li>
	<li class="active"><a href="buyerUserInfor.jsp">我的信息<% request.getSession().setAttribute("sname",user.getuserName()); %></a></li>
	<li><a href="#">我的购买</a></li>
	<li><a href="buyUser.jsp">我的快递<% request.getSession().setAttribute("sname",user.getuserName()); %></a></li>
	<li class="navbar-right"><a href="/supermarket/index.jsp">退出</a></li>
</ul> 
<form class="form-horizontal" role="form">
  	<div class="form-group">
    	<label for="username" class="col-sm-4 control-label">用户昵称</label>
    	<div class="col-sm-4">
      	<input type="text" class="form-control" id="username" placeholder=<%=user.getuserName() %>>
   		</div>
  	</div>
  	<div class="form-group">
    	<label for="realname" class="col-sm-4 control-label">真实姓名</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="realname" placeholder=<%=user.getrealName() %>>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="idnumber" class="col-sm-4 control-label">身份证号</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="idnumber" placeholder=<%=user.getIDnumber() %>>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="phone" class="col-sm-4 control-label">联系电话</label>
    	<div class="col-sm-4">
      		<input type="text" class="form-control" id="phone" placeholder=<%=user.getPhone() %>>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="postcode" class="col-sm-4 control-label">邮政编码</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="postcode" placeholder=<%=user.getPostcode() %>>
    	</div>
  	</div>
  	<div class="form-group">
  		<label for="province" class="col-sm-4 control-label">省</label>
  		<div class="col-sm-4">
			<select class="form-control">
				<option value="">上海</option>
				<option value="">浙江</option>
			</select>
		</div>
	</div>
	<div class="form-group">
  		<label for="city" class="col-sm-4 control-label">市</label>
  		<div class="col-sm-4">
			<select class="form-control">
				<option value="">上海</option>
				<option value="">浙江</option>
			</select>
		</div>
	</div>
  
  
  
</form>

</body>
</html>