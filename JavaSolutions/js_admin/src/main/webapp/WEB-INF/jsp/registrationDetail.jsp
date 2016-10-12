


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>			
			<form:form method="POST" action="" modelAttribute="RegistrationDto" autocomplete="off">
			<table width="100%" border="1" class="table" cellpadding="5px">
					<tr>
					    <th>S.NO.</th>
						<th>First Name</th>
					    <th>Last Name</th>
						<th>Email Id</th>
						<th>Mobile No.</th>
						<!-- <th>Image</th> -->
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<% int count=0;%>
				    <c:forEach items="${users}" var="listt">
						<tr>
						<td><%= ++count %></td>
						<%-- <td>${listt.LoginId}</td>  --%>
						<td>${listt.firstname}</td>
						<td>${listt.lastname}</td>
						<td>${listt.emailid}</td>
						<td>${listt.mobileno}</td>
						<%-- <td><img src="data:image/jpeg;bytes,${listt}" width="100" height="100"></img></td> --%>
						<td><a href="viewFeeStatus.do?id=${listt.rid}">View Fee Status</a></td>
						<td><a href="editUserDetails.do?id=${listt.rid}">Edit</a></td>
						<td><a href="deleteUserDetails.do?id=${listt.rid}" onclick="return confirm('Please confirm if you want to delete');">Delete</a></td>
					</tr>
			       
  			</c:forEach>
			</table>
			</form:form>
</div>

</body>
</html>