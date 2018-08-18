<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>wishlistId</th>
<th>productId</th>
<th>name</th>
</tr>
<a:forEach items="${item}" var="it">
<tr>
<td>${it.w_id}</td>
<td>${it.p_id}</td>
<td>${it.p_name}</td>
<td><a href="/addtocart">add to cart</a><br></td>
<td><a href="delete/${it.w_id}">delete Wishlist</a><br></td>
</tr>
</a:forEach>
</table>
</body>
</html>

</body>
</html>