<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.system.controller.GasController" %>
<%@ page import="com.system.controller.StartController" %>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>Totem</title>
</head>
<body>
<h1>Параметры работы биогазовой установки</h1>

<p>Объем произведенного биогаза: ${message} литров</p>
<p>Количество отключений электропитания: ${power} раз</p>


<h1>Выработано биогаза</h1>
<table border="1" cellpadding="5">
    <tr>
        <th>day</th>
        <th>rashod</th>
    </tr>
</table>

</body>
</html>