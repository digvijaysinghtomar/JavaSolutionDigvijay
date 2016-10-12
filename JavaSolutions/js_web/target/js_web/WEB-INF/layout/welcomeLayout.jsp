<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
  <table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
   
    <tr>
      <td bgcolor="#F4F4F4"><tiles:insertAttribute name="body" />
      </td>
    </tr>
   
  </table>
</body>
</html>