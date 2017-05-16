<%@page import="org.dom4j.DocumentHelper"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import=" com.backend.buyerEnd.dao.UserDao,
	 com.backend.buyerEnd.model.User,java.util.*,org.w3c.dom.*" %>
	
<!DOCTYPE html>
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
	<li><a href="buyMain.jsp">主页</a></li>
	<li class="navbar-right"><a href="/supermarket/index.jsp">退出</a></li>
</ul> 



<form class="form-horizontal" role="alter" action="${pageContext.request.contextPath}/alter.do?user=<%request.getSession().setAttribute("user", user); %>" method="post">
  	<div class="form-group">
    	<label for="username" class="col-sm-4 control-label">用户昵称</label>
    	<div class="col-sm-4">
      	<input type="text" class="form-control" id="username" placeholder=<%=user.getuserName() %> />
   		</div>
  	</div>
  		<div class="form-group">
    	<label for="password" class="col-sm-4 control-label">密码</label>
    	<div class="col-sm-4">
      	<input type="password" class="form-control" id="password" placeholder=<%=user.getpassword() %> />
   		</div>
  	</div>
  	</div>
  		<div class="form-group">
    	<label for="password2" class="col-sm-4 control-label">确认密码</label>
    	<div class="col-sm-4">
      	<input type="password" class="form-control" id="password2" placeholder="" />
   		</div>
  	</div>
  	<div class="form-group">
    	<label for="realname" class="col-sm-4 control-label">真实姓名</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="realname" placeholder=<%=user.getrealName() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="idnumber" class="col-sm-4 control-label">身份证号</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="idnumber" placeholder=<%=user.getIDnumber() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="phone" class="col-sm-4 control-label">联系电话</label>
    	<div class="col-sm-4">
      		<input type="text" class="form-control" id="phone" placeholder=<%=user.getPhone() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="postcode" class="col-sm-4 control-label">邮编</label>
    	<div class="col-sm-4">
      		<input type="text" class="form-control" id="postcode" placeholder=<%=user.getPostcode() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="province" class="col-sm-4 control-label">省</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="province" placeholder=<%=user.getPostcode() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="city" class="col-sm-4 control-label">市</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="city" placeholder=<%=user.getPostcode() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="district" class="col-sm-4 control-label">区/县</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="district" placeholder=<%=user.getPostcode() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="street" class="col-sm-4 control-label">街道</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="street" placeholder=<%=user.getPostcode() %>/>
    	</div>
  	</div>
  	<div class="form-group">
    	<label for="address" class="col-sm-4 control-label">详细地址</label>
    		<div class="col-sm-4">
      		<input type="text" class="form-control" id="address" placeholder=<%=user.getPostcode() %>/>
    	</div>

	<input type="submit" value="确认修改"/>



</form>
 <%@ include file="footer.jsp" %>
</body>
</html>