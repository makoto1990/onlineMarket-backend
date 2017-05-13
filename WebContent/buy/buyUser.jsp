<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="main.java.com.backend.buyerEnd.dao.OrderDao,
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

    <table class="table table-striped">
      <caption>订单信息</caption>
      <thead>
        <tr>
          <th>订单编号</th>
          <th>订单状态</th>
          <th>创建时间</th>
          <th>付款时间</th>
          <th>发货时间</th>
          <th>确认/取消时间</th>
        </tr>
      </thead>
      <tbody>
      	<tr>
      	<%
      		OrderDao dao = new OrderDao();
    		List<Order> list = dao.quick_getOrderByUserID(name);
    		for(Order o1:list)
    		{%>
    			<td><%=o1.getorderID() %></td>
          		<td><%=o1.getorderStatus() %></td>
          		<td><%=o1.getcreatTime() %></td>
          		<td><%=o1.getpayTime() %></td>
          		<td><%=o1.getdeliveryTime() %></td>
          		<td><%=o1.getconfirmTime() %></td>
    		<%}
      	%>
        </tr>
      </tbody>
    </table>

    <%@ include file="footer.jsp" %>

</body>
</html>