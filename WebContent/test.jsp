<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test JSP</title>
</head>
<body>

<h3>Testing JSPs</h3>
<%!
public int add (int a, int b){
	return a + b;
}
%>

<%
int i = 1;
int j = 2;
int k;
k = i + j;
//out.println("The value of k is " + k);
%>

<br>
The value of k is <%=k %>!!

<%
k = add(1234, 5678);
%>
<br>
The new value of k is <%=k %>!!

</body>
</html>