<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>simple calculater</h1>
<form action="calculater" method="post">
<input type="text" name="num1"/>
<input type="text"  name="num2"/>
<input type="submit" value = "submit" />
</form>
<br>
the result:  ${ result }


</body>
</html>