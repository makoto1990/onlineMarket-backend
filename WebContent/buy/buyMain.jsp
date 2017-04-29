<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>支农网上生鲜超市</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
    String name = request.getSession().getAttribute("sname").toString();//name即为由login传值的登录名
%>
<div class="container">

    <!--     第一部分 -->
    <div id="header">
        <div class="row clearfix">
            <div class="col-md-12 column" style="background: #33eeff">
                <table>
                    <tr>
                        <td>logo</td>
                        <td>个人信息管理以及购买物品管理。个人信息包括查看、修改等；购买管理包括：购买的商品，以及物流等的查询</td>
                    </tr>
                    <tr>
                        <td>一排宣传的照片</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>

    <!--     第二部分 -->
    <div id="topmenu">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle"
                                    data-toggle="collapse" data-target="#example-navbar-collapse">
                                <span class="sr-only">切换导航</span> <span class="icon-bar"></span>
                                <span class="icon-bar"></span> <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#">支农</a>
                        </div>
                        <div class="collapse navbar-collapse" id="example-navbar-collapse">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="#">类1</a></li>
                                <li><a href="#">SVN</a></li>
                                <li class="dropdown"><a href="#" class="dropdown-toggle"
                                                        data-toggle="dropdown"> 类2 <b class="caret"></b>
                                </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">类3</a></li>
                                        <li><a href="#">类3</a></li>
                                        <li><a href="#">类3</a></li>
                                        <li class="divider"></li>
                                        <li><a href="#">类4</a></li>
                                        <li class="divider"></li>
                                        <li><a href="#">类5</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </div>

    <!--     第三部分 -->
    <div id="content">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="row clearfix">
                    <div class="col-md-8 column" style="background: blue">
                        <p>显示更新产品介绍，包括类别，定价等，以及进行购买</p>
                    </div>
                    <div class="col-md-4 column" style="background: blue">
                        <p>最新优秀宣传的产品等</p>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!--     第四部分 -->
    <div id="footer">
        <div class="row clearfix">
            <div class="col-md-12 column" style="background: red">
                <p>介绍一下网站基本信息，友情链接等</p>
            </div>
        </div>
    </div>
</div>
</body>
</html>