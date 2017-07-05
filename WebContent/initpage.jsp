<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Initpage JSP</title>
</head>

<%!
public void jspInit(){
	String defaultUserName = getServletConfig().getInitParameter("defaultUser");
	ServletContext context = getServletContext();
	context.setAttribute("defaultUser", defaultUserName);
}
%>

<body>

The default user name saved in servlet config is : <%=getServletConfig().getInitParameter("defaultUser") %>
<br>
The value in the servlet context is: <%=getServletContext().getAttribute("defaultUser") %>

</body>
</html>