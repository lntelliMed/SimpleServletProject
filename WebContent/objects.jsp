<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objects JSP</title>
</head>
<body>

<%
String userName = (String) request.getParameter("name");
if (userName != null){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContxtUserName", userName);
	//pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
	//pageContext.findAttribute("name");
}
%>

<br>
The user name as defined in the request object is: <%=userName %>
<br>
The user name as defined in the session object is: <%=session.getAttribute("sessionUserName") %>
<br>
The user name as defined in the application context object is: <%=application.getAttribute("applicationUserName") %>
<br>
The user name as defined in the page context object is: <%=pageContext.getAttribute("pageContxtUserName") %>

</body>
</html>