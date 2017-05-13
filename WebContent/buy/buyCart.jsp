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
  <caption>购物车信息</caption>
  <thead>
    <tr>
      <th>商品名称</th>
      <th>商品价格</th>
      <th>订单数量</th>
      <th>合计价格</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
    <%
        // Cart cart = (Cart)request.getSession().getAttribute("scart"); 
        // if(cart==null)cart=new Cart();
        // for(Goods goods:cart.cart.keySet())
        // {%>
        //     <td><%=goods.getGoodsName() %></td>
        //     <td><%=goods.getGoodsPrice() %></td>
        //     <td><%=cart.cart.get(goods) %></td>
        //     <td><%=cart.getCost(goods) %></td>
        //     <td>删除</td>
        // <%}
    %>
    </tr>
  </tbody>
</table>

  <%@ include file="footer.jsp" %>


</body>
</html>