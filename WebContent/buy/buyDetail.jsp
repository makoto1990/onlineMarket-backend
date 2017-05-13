<%@ page language="java" contentType="text/html; charset=utf-8" 
import="main.java.com.backend.buyerEnd.model.*"
import="java.util.*" pageEncoding="utf-8" 
import="main.java.com.backend.buyerEnd.service.*"
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style type="text/css">
    .desc {font-size:22px;color:#555;padding:10px}
    .addToCart {border-radius:6px;font-size:28px;padding:10px;color:#FFF;background:#ff9933;}
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>支农网上生鲜超市</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
    Cart cart = (Cart)request.getSession().getAttribute("scart"); 
    String flag=(String)request.getParameter("flag");
    HttpSession sess=request.getSession();
    String goodsId=(String)sess.getAttribute("goodsId"+flag);
    String goodsType=(String)sess.getAttribute("goodsType"+flag);
    String sellerId=(String)sess.getAttribute("sellerId"+flag);
    String userName=(String)sess.getAttribute("userName");
    String name=userName.trim();
    DetailService svc=new DetailService();
    Goods goods=svc.getGoodsByGoodsId(goodsId);
    String goodsName=goods.getGoodsName().trim();
    String goodsIntro=goods.getGoodsIntro();
    if(goodsIntro==null)goodsIntro="暂无商品简介";
    String storeWay=goods.getStoreWay();
    if(storeWay==null)storeWay="暂无说明";
    String sourceArea=goods.getSourceArea();
    if(sourceArea==null)sourceArea="暂无说明";
    String goodsSize=goods.getGoodsSize();
    if(goodsSize==null)goodsSize="规格请咨询店家";
    int goodsCount=goods.getGoodsCount();
    float goodsPrice=goods.getGoodsPrice();

    Seller seller=svc.getSellerBySellerId(sellerId);
    String sellerIntro=seller.getSellerIntro();
    if(sellerIntro==null)sellerIntro="暂无商家简介";
    //String name = request.getSession().getAttribute("sname").toString();//name即为由login传值的登录名
    //String presearchinfo = request.getSession().getAttribute("searchinfo").toString();  //搜索的信息  
%>
<div class="container">


    <%@ include file="header.jsp" %>

    <!--     第三部分 -->
    <div class="detail-view">
        <ol class="breadcrumb">
            <li><a href="buyMain.jsp">主页<% request.getSession().setAttribute("sname",name); %></a></li>
            <li><a href="#"><%=goodsType%></a></li>
            <li class="active"><%=goodsName%></li> 
        </ol>
        <div class="details">
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-6 column">
                    <div class="main-img">
                        <%String picPath="../resources/images/"+goodsName+".jpg";
                        %>
                        <img src=<%=picPath %> width="100%">
                    </div>
                </div>
                <div class="col-md-6 column">
                    <div class="goods-info">
                        <h1><%=goodsName%>(<%=goodsSize%>)</h1>
                        <div class="desc" style="padding-bottom:30px"><%=goodsIntro%></div>
                        <div class="desc">
                            <div class="container" style="background:#EEE;width:100%">
                                <div class="row clearfix">
                                    <div class="col-md-2 column">
                                        <div class="desc" style="padding-top:20px;padding-right: 0px">价格</div>
                                    </div>
                                    <div class="col-md-4 column">
                                        <div class="desc" style="color:#ff9933;font-size:32px">￥<%=goodsPrice%></div>  
                                    </div>
                                </div>
                            </div>                            
                        </div>
                        <div class="desc">
                            <div class="container" >
                                <div class="row clearfix">
                                    <div class="col-md-1 column">
                                        <div class="desc" style="padding-top:20px">数量</div>
                                    </div>
                                    <div class="col-md-5 column">
                                        <div class="desc">
                                            <script type="text/javascript">
                                                var out=document.getElementById('out');
                                                out.innerHTML=1;
                                                function minus() {
                                                    var out=document.getElementById('out');
                                                    if(out.innerHTML>0)out.innerHTML--;
                                                }
                                                function plus() {
                                                    var out=document.getElementById('out');
                                                    var maxValue=<%=goodsCount%>  
                                                    if(out.innerHTML<maxValue-1)out.innerHTML++;
                                                }
                                                function addToCart(){
                                                    var out=document.getElementById('out');
                                                    if(out.innerHTML>0){
                                                        var 
                                                    }
                                                }
                                            </script>
                                            <input type="button" id="btn1" value="-" onclick="minus()" style="out-line:none;" />
                                                <!-- <img src="/Content/img/minus.png"> -->
                                            <a id="out" value=1></a>
                                            <input type="button" id="btn2" value="+" onclick="plus()" style="out-line:none;"/>
                                                <!-- <img src="/Content/img/plus.png"> -->
                                        </div>
                                    </div>
                                </div>
                            
                           
                            </div>
                        </div>

                        <div class="addToCart" style="width:40%" onclick="addToCart()">&nbsp;&nbsp;&nbsp;加入购物车</div>
                        <div class="desc">
                        </br>
                                <li>
                                    <label>产地</label> <%=sourceArea%>
                                </li>
                                <li>
                                    <label>库存量</label> <%=goodsCount%> 
                                </li>
                                <li>
                                    <label>规格</label> <%=goodsSize%>
                                </li>
                                <li>
                                    <label>储存条件</label> <%=storeWay%>
                                </li>
                        </div>
                    </div>
                </div>
            </div>
        </div>
           
           
        </div>

        </br>
        <div class="bt-content">
                <ul class="nav nav-tabs">
                <li class="active"><a style="font-size: 25px">商家简介</a></li></br>
                </ul>
                <div class="desc">
                    <%=sellerIntro%>
                </div>
                </br></br></br></br></br></br></br>
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

<%@ include file="footer.jsp" %>
</body>
</html>