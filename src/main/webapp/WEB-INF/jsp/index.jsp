<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.system.controller.GasController" %>
<%@ page import="com.system.controller.StartController" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN http://www.w3.org/TR/html4/loose.dtd">--%>

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
    <c:forEach items="${data}" var="data" varStatus="status">
        <tr>
            <td>${data.date}</td>
            <td>${data.rashod}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>