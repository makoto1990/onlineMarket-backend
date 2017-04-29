<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Order Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
    <script src=/angular/angular.min.js></script>
</head>
<body>
<h1>
    Add a Order
</h1>
<tr><td><a href="<c:url value='/' />" >back</a></td></tr>
<div ng-app="myApp" ng-controller="myCtrl" ng-init="ID=''" >

<c:url var="addAction" value="/admin/OrderControl/FindOrder/{id}" ></c:url>

<form:form action="${addAction}" commandName="order">
    <table>
        <tr>
            <td><input type="text" ng-model="ID"></td>
            <td><a href="/admin/OrderControl/FindOrder/{{ID}}"></a></td>
        </tr>
        <c:if test="${!empty order.receiverName}">
            <tr>
                <th width="80">Order ID</th>
                <th width="120">Order ReceiverName</th>
                <th width="120">Order Phone</th>
                <th width="120">Order Status</th>
                <th width="120">Order PayTime</th>
                <th width="120">Order DeliveryTime</th>
                <th width="120">Order ShipCost</th>
                <th width="120">Order All Price</th>
                <th width="120">Order Confirm Time</th>

                <th width="120">Order Postcode</th>
                <th width="120">Order Province</th>
                <th width="120">Order City</th>
                <th width="120">Order District</th>
                <th width="120">Order Street</th>
                <th width="120">Order Address</th>

                <th width="120">Order CreatTime</th>
                <th width="120">Order User ID</th>
                <th width="120">Order Seller ID</th>
                <th width="60">Delete</th>
            </tr>
            <tr>
                <td>${order.orderId}</td>
                <td>${order.receiverName}</td>
                <td>${order.phone}</td>
                <td>${order.orderStatus}</td>
                <td>${order.payTime}</td>
                <td>${order.deliveryTime}</td>
                <td>${order.shipCost}</td>
                <td>${order.allPrice}</td>
                <td>${order.confirmTime}</td>

                <td>${order.postcode}</td>
                <td>${order.province}</td>
                <td>${order.city}</td>
                <td>${order.district}</td>
                <td>${order.street}</td>
                <td>${order.address}</td>
                <td>${order.creatTime}</td>
                <td>${order.userId}</td>
                <td>${order.sellerId}</td>
                <td><a href="<c:url value='/admin/OrderControl/RemoveOrder/${order.orderId}' />" >Delete</a></td>
            </tr>
        </c:if>

        <tr>
            <td colspan="2">
                <c:if test="${!empty order.orderId}">
                    <input type="submit"
                           value="<spring:message text="Edit User"/>" />
                </c:if>
                <c:if test="${empty order.orderId}">
                    <input type="submit"
                           value="<spring:message text="Add User"/>" />
                </c:if>
            </td>
        </tr>
    </table>


</form:form>
</div>
<script>

    var app = angular.module("myApp", []);

    app.controller("myCtrl", function($scope) {
        $scope.myVar = true;
        $scope.toggle = function() {
            $scope.myVar = !$scope.myVar;
        };
    });

</script>
<br>
<h3>User List</h3>
<c:if test="${!empty listOrder}">
    <table class="tg">
        <tr>
            <th width="80">Order ID</th>
            <th width="120">Order ReceiverName</th>
            <th width="120">Order Phone</th>
            <th width="120">Order Status</th>
            <th width="120">Order PayTime</th>
            <th width="120">Order DeliveryTime</th>
            <th width="120">Order ShipCost</th>
            <th width="120">Order All Price</th>
            <th width="120">Order Confirm Time</th>

            <th width="120">Order Postcode</th>
            <th width="120">Order Province</th>
            <th width="120">Order City</th>
            <th width="120">Order District</th>
            <th width="120">Order Street</th>
            <th width="120">Order Address</th>

            <th width="120">Order CreatTime</th>
            <th width="120">Order User ID</th>
            <th width="120">Order Seller ID</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listOrder}" var="order">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.receiverName}</td>
                <td>${order.phone}</td>
                <td>${order.orderStatus}</td>
                <td>${order.payTime}</td>
                <td>${order.deliveryTime}</td>
                <td>${order.shipCost}</td>
                <td>${order.allPrice}</td>
                <td>${order.confirmTime}</td>

                <td>${order.postcode}</td>
                <td>${order.province}</td>
                <td>${order.city}</td>
                <td>${order.district}</td>
                <td>${order.street}</td>
                <td>${order.address}</td>
                <td>${order.creatTime}</td>
                <td>${order.userId}</td>
                <td>${order.sellerId}</td>

                <td><a href="<c:url value='/admin/OrderControl/RemoveOrder/${order.orderId}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>