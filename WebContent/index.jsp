<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>支农网上生鲜超市</title>

</head>
<body>
${sessionScope.message}
<br>
<form action="login.do" method="post">

    请输入用户名和口令：
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>口 令:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="radio" name="style" value="buy">我来买
                <input type="radio" name="style" value="sale">我来卖
                <input type="radio" name="style" value="manage">后台管理
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="checkbox" name="check" value="check"/>自动登录
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交"/>
            </td>
            <td>
                <input type="reset" value="重置"/>
                <input type="button" onclick="window.location.href='register.jsp';" value="注册"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>