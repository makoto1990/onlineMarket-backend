<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="main.java.com.backend.buyerEnd.dao.*,
  main.java.com.backend.buyerEnd.model.*,java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户页面</title>
  <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
  <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <% 
      String name = request.getSession().getAttribute("sname").toString(); 
    %> 
    <%@ include file="header.jsp" %>

    <form class="form-horizontal" role="form">
    	<%
    		UserDao dao = new UserDao();
     		List<User> list = dao.getUserByUserName(name);
     		for(User u1:list)
     		{%>
     		<div class="form-group">
        		<label class="col-sm-5 control-label">用户ID</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getuserID() %></p>
        		</div>
      		</div>
     		<div class="form-group">
        		<label class="col-sm-5 control-label">用户姓名</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getuserName() %></p>
        		</div>
      		</div>
     		<div class="form-group">
        		<label class="col-sm-5 control-label">密码</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getpassword() %></p>
        		</div>
      		</div>		
     		<div class="form-group">
        		<label class="col-sm-5 control-label">真实姓名</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getrealName() %></p>
        		</div>
      		</div>	
      		<div class="form-group">
        		<label class="col-sm-5 control-label">身份证号</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getIDnumber() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">联系电话</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getPhone() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">邮编</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getPostcode() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">省</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getProvince() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">市</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getCity() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">区/县</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getDistrict() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">街道</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getStreet() %></p>
        		</div>
      		</div>
      		<div class="form-group">
        		<label class="col-sm-5 control-label">详细地址</label>
        		<div class="col-sm-7">
          			<p class="form-control-static"><%=u1.getAddress() %></p>
        		</div>
      		</div>

     		<%}
     	%>

    </form>	 
    <%@ include file="footer.jsp" %>
</body>
</html>