<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
  <table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
   <tr>
      <td rowspan="3" align="left"><tiles:insertAttribute name="menu" />
      </td>
      <td><tiles:insertAttribute name="body" />
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFC266"><tiles:insertAttribute name="header" />
      </td>
    </tr>
    <tr>
      <td><tiles:insertAttribute name="footer" />
      </td>
    </tr>
  </table>
</body>
</html>