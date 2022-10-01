<%-- 
    Document   : editnote
    Created on : 27-Sep-2022, 2:05:28 PM
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
        <h2>Edit Note</h2><br>
        <form method="post" action="editnote">
        Title: <input type="text" value="${note.title}"><br>
        Content: <textarea rows="5" columns='50' value="${note.content}"></textarea><br>
        <input type="submit" value="Save">
        </form>
    </body>
</html>
