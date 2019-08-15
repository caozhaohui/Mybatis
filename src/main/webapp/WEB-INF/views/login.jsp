<%--
  Created by IntelliJ IDEA.
  User: XL
  Date: 2019/7/30
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/admin/LoginServletImpl" method="get">
    <table>
        <tr>
            <td>
                用户名:
            </td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>

        <tr>
            <td>
                密码:
            </td>
            <td>
                <input type="text" name="password">
            </td>
        </tr>

        <tr>
            <td>

            </td>
            <td>
                <input type="submit" value="登陆">
            </td>
        </tr>
        ${LoginError}
    </table>
</form>
</body>
</html>
