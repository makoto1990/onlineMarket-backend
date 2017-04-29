<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Seller Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a Seller
</h1>
<tr><td><a href="<c:url value='/' />" >back</a></td></tr>

<c:url var="addAction" value="/admin/SellerControl/AddSeller" ></c:url>

<form:form action="${addAction}" commandName="seller">
    <table>
        <c:if test="${!empty seller.userId}">
            <tr>
                <td>
                    <form:label path="sellerID">
                        <spring:message text="Seller ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="sellerId" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="sellerId" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="userID">
                    <spring:message text="User ID"/>
                </form:label>
            </td>
            <td>
                <form:input path="userId" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="registerDate">
                    <spring:message text="RegisterDate"/>
                </form:label>
            </td>
            <td>
                <form:input path="registerDate" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="sellerIntro">
                    <spring:message text="Seller Intro"/>
                </form:label>
            </td>
            <td>
                <form:input path="sellerIntro" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty seller.userId}">
                    <input type="submit"
                           value="<spring:message text="Edit Seller"/>" />
                </c:if>
                <c:if test="${empty seller.userId}">
                    <input type="submit"
                           value="<spring:message text="Add Seller"/>" />
                </c:if>
            </td>
        </tr>
    </table>


</form:form>
<br>
<h3>Seller List</h3>
<c:if test="${!empty listSellers}">
    <table class="tg">
        <tr>
            <th width="80">Seller ID</th>
            <th width="120">User ID</th>
            <th width="120">RegisterDate</th>
            <th width="120">Seller Intro</th>

            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listSellers}" var="seller">
            <tr>
                <td>${seller.sellerId}</td>
                <td>${seller.userId}</td>
                <td>${seller.registerDate}</td>
                <td>${seller.sellerIntro}</td>

                <td><a href="<c:url value='/admin/SellerControl/EditSeller/${seller.sellerId}' />" >Edit</a></td>
                <td><a href="<c:url value='/admin/SellerControl/RemoveSeller/${seller.sellerId}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>