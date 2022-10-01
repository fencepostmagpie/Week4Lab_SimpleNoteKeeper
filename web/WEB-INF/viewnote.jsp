<%-- 
    Document   : viewnote
    Created on : 27-Sep-2022, 2:05:12 PM
    Author     : Aster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <h2>View Note</h2><br>
        <p><span style='font-weight: bold'>Title: </span>${title}</p><br>
        <p><span style='font-weight: bold'>Contents:</span><br> ${content}<br>
        </p><br><br>
        <a href="note?edit">Edit</a>
        
    </body>
</html>
