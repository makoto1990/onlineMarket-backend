<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2017/4/3
  Time: 下午7:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>User Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a Person
</h1>

<c:url var="addAction" value="/admin/UserControl/AddUser" ></c:url>

<form:form action="${addAction}" commandName="user">
    <table>
        <c:if test="${!empty user.userName}">
            <tr>
                <td>
                    <form:label path="userId">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="userId" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="userId" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="userName">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="userName" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="password">
                    <spring:message text="Password"/>
                </form:label>
            </td>
            <td>
                <form:input path="password" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="realName">
                    <spring:message text="RealName"/>
                </form:label>
            </td>
            <td>
                <form:input path="realName" />
            </td>
        </tr>
        <tr>
        <td>
            <form:label path="iDnumber">
                <spring:message text="iDNumber"/>
            </form:label>
        </td>
        <td>
            <form:input path="iDnumber" />
        </td>
        </tr>
        <tr>
            <td>
                <form:label path="phone">
                    <spring:message text="phone"/>
                </form:label>
            </td>
            <td>
                <form:input path="phone" />
            </td>
        </tr>
        <tr>
        <td>
            <form:label path="userStatus">
                <spring:message text="userStatus"/>
            </form:label>
        </td>
        <td>
            <form:input path="userStatus" />
        </td>
        </tr>
        <tr>
        <td>
            <form:label path="postcode">
                <spring:message text="postcode"/>
            </form:label>
        </td>
        <td>
            <form:input path="postcode" />
        </td>
        </tr>
        <tr>
        <td>
            <form:label path="province">
                <spring:message text="province"/>
            </form:label>
        </td>
        <td>
            <form:input path="province" />
        </td>
        </tr>
        <tr>
        <td>
            <form:label path="city">
                <spring:message text="city"/>
            </form:label>
        </td>
        <td>
            <form:input path="city" />
        </td>
        </tr>
        <tr>
        <td>
            <form:label path="district">
                <spring:message text="district"/>
            </form:label>
        </td>
        <td>
            <form:input path="district" />
        </td>
        </tr>
        <tr>
        <td>
            <form:label path="street">
                <spring:message text="street"/>
            </form:label>
        </td>
        <td>
            <form:input path="street" />
        </td>
        </tr>
        <tr>
            <td>
                <form:label path="address">
                    <spring:message text="address"/>
                </form:label>
            </td>
            <td>
                <form:input path="address" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="isManager">
                    <spring:message text="isManager"/>
                </form:label>
            </td>
            <td>
                <form:checkbox path="manager" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty user.userName}">
                    <input type="submit"
                           value="<spring:message text="Edit User"/>" />
                </c:if>
                <c:if test="${empty user.userName}">
                    <input type="submit"
                           value="<spring:message text="Add User"/>" />
                </c:if>
            </td>
        </tr>
    </table>


</form:form>
<br>
<h3>User List</h3>
<c:if test="${!empty listUsers}">
    <table class="tg">
        <tr>
            <th width="80">User ID</th>
            <th width="120">User Name</th>
            <th width="120">User RegisterDate</th>
            <th width="120">User password</th>
            <th width="120">User Real Name</th>
            <th width="120">User ID number</th>
            <th width="120">User Phone</th>
            <th width="120">User Postcode</th>
            <th width="120">User Province</th>
            <th width="120">User City</th>
            <th width="120">User District</th>
            <th width="120">User Street</th>
            <th width="120">User Address</th>
            <th width="120">User isManager</th>

            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listUsers}" var="user">
            <tr>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.registerDate}</td>
                <td>${user.password}</td>
                <td>${user.realName}</td>
                <td>${user.iDnumber}</td>
                <td>${user.phone}</td>
                <td>${user.userStatus}</td>
                <td>${user.postcode}</td>
                <td>${user.province}</td>
                <td>${user.city}</td>
                <td>${user.district}</td>
                <td>${user.street}</td>
                <td>${user.address}</td>
                <td>${user.manager}</td>

                <td><a href="<c:url value='/admin/EditUser/${user.userId}' />" >Edit</a></td>
                <td><a href="<c:url value='/admin/RemoveUser/${user.userId}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>