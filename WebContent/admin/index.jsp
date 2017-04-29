<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <tr>
        <td><a href="<c:url value='/admin/UserControl' />" >UserControl</a></td>
        <td><a href="<c:url value='/admin/GoodsControl' />" >GoodsControl</a></td>
        <td><a href="<c:url value='/admin/OrderControl' />" >OrderControl</a></td>
        <td><a href="<c:url value='/admin/SellerControl' />" >SellerControl</a></td>
        <td><a href="<c:url value='/admin/CompositionControl' />" >Composition</a></td>
    </tr>
</body>
</html>
