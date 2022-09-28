<%-- 
    Document   : viewnote
    Created on : 27-Sep-2022, 2:05:12 PM
    Author     : Aster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br><br>
        <h3>View Note</h3><br><br>
        <p>Title: ${title}</p><br><br>
        <p>Contents: <br>
            ${contents}</p><br><br>
        <a href="editnote.jsp">Edit</a>
        
    </body>
</html>
