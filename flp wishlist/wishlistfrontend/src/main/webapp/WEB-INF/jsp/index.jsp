

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
<th>productId</th>
<th>productName</th>
<th>Productmodel</th>
<th>Productprice</th>

</tr>

<a:forEach items="${product}" var="prod">
<tr>
<td>${prod.p_id}</td>
<td>${prod.p_name}</td>
<td>${prod.p_model}</td>
<td>${prod.p_price}</td>
<td><a href="wishlist/${prod.p_id}">Add to Wishlist</a><br><br></br></td>
</tr>
</a:forEach>
</table>
</body>
</html>
