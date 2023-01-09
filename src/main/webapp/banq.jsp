<%@page import="service.ConversionProxy"%>
<%@page import="service.BanqueServiceServiceLocator"%>
<%@page import="service.BanqueServiceService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    double mnt = 0 ;
    double res = 0;
    if (request.getParameter("montant")!=null){
    	
    	mnt =Double.parseDouble(request.getParameter("montant"));
    	ConversionProxy stup = new ConversionProxy();
         res= stup.conversionEuroEnDh(mnt);
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="banq.jsp">
Montant:<input type="text" name="montant">
envoyer:<input type="submit" name="envoyer">

</form>
<%=mnt%> est egale <%=res %>
</body>
</html>