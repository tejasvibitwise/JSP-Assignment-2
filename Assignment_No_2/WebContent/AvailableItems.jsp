<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--<jsp:useBean id="cart" class="com.bitwise.cart.CartManagement" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="cart"/> --%> 

<%--<form action="AddToCart.jsp" method="post">
<select name="cart" multiple>
  <option value="item1">item1</option>
  <option value="item2">item2</option>
  <option value="item3">item3</option>
  <option value="item4">item4</option>
</select>
<br> --%>


<form ACTION="CartItems" method="post">
<input type="checkbox" name="items" value="item1"> item 1<BR>
<input type="checkbox" name="items" value="item2"> item 2<BR>
<input type="checkbox" name="items" value="item3"> item 3<BR>
<input type="checkbox" name="items" value="item4"> item 4<BR>
<input type="checkbox" name="items" value="item5"> item 5<BR>
<input type="submit" value="Add">
</form>



</form>

 

</body>
</html>