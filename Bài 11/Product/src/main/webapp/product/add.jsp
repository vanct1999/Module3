<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 001,1-Jul-2021
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Add new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Cost:</td>
                <td><input type="text" name="cost" id="cost"></td>
            </tr>
            <tr>
                <td>Location:</td>
                <td><input type="text" name="location" id="location"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" id="description"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Add product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
