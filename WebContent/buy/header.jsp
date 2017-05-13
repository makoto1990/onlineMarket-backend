<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*" import="main.java.com.backend.buyerEnd.model.*"
         import="javax.servlet.http.*" pageEncoding="utf-8" %>

<script>
    $(document).ready(function() {
    // put all your jQuery goodness in here.
}); 
</script>
<div id="header">
        <div class="row clearfix">
            <div class="col-md-12 column" style="background: #ffffff">
                <table>
                    <tr>
                        <td><img alt="" src="images/logo.jpg" /></div></td>
                        <td>
                        <ul class="nav nav-pills">
                        <li class="active"><a href="buyMain.jsp">主页</a></li>
                        <li><a href="buyerUserInfor.jsp">我的信息</a></li>
                        <li><a href="buyCart.jsp">购物车</a></li>
                        <li><a href="buyUser.jsp">我的快递</a></li>
                        <li class="navbar-right"><a href="/supermarket/index.jsp">退出</a>
                        </li>
                        </ul>
                        </td>
                    </tr>
                    <tr>
                        <td>一排宣传的照片</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>

    <!--     第二部分  导航栏-->
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
                            <a class="navbar-brand" href="buyMain.jsp">首页</a>
                        </div>
                        <div class="collapse navbar-collapse" id="example-navbar-collapse">
                            <ul class="nav navbar-nav">
                                <jsp:useBean id="goodsTypeX" class="main.java.com.backend.buyerEnd.search.SearchBean" />
                                    <%  ArrayList<String> allType=new ArrayList<String>(); 
                                        allType=goodsTypeX.getAllType();
                                        int cntType=allType.size();
                                        for (int i=0;i<cntType;i++) {
                                            String typeName=allType.get(i);
                                    %>
                                        <li><a href="#"><%=typeName%></a></li>
                                    <%} %>
                            </ul>
                            <form class="navbar-form navbar-right" role="search" action="${pageContext.request.contextPath}/search.do" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="请输入你想要搜索的商品类别或商品名称" name="searchinfo">
                                </div>
                                <button type="submit" class="btn btn-default">搜索</button>
                            </form>
                        </div>                        
                    </div>
                </nav>
            </div>            
        </div>        
    </div>