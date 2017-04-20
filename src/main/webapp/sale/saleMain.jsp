<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>支农网上生鲜超市</title>
    <link rel="stylesheet"
          href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script
            src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script
            src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
    String name = request.getSession().getAttribute("sname").toString();//name即为由login传值的登录名
%>
<div class="container">

    <!--     第一部分 -->
    <div id="header">
        <div class="row clearfix">
            <div class="col-md-12 column" style="background: red">
                商品的管理，发布，删除，修改
            </div>
        </div>
    </div>


    <!--     第二部分 -->
    <div id="content">
        <div class="row clearfix">
            <div class="col-md-12 column" style="background: blue">
                新的订单，进行发货处理，订单查询
            </div>
        </div>
    </div>

</div>
</body>
</html>