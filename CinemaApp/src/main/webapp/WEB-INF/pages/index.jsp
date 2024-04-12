<%-- 
    Document   : index
    Created on : Apr 12, 2024, 4:09:48 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach items="${categories}" var="c">
            <h2>${c.categoryId} - ${c.categoryName}</h2>
        </c:forEach>
    </body> 
</html>
