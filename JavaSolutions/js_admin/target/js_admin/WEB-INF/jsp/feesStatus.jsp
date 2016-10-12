<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<th>Total Fees</th>

</div>
<div>			
			<form:form method="POST" action="" modelAttribute="FeesDto" autocomplete="off">
			<table width="100%" border="1" class="table" cellpadding="5px">
					<tr>
					    <th>S.NO.</th>
						<th>Fees Emi</th>
						<th>Fees Date</th>
						<!-- <th>Edit</th>
						<th>Delete</th> -->
					</tr>
					<% int count=1; %>
			        <c:forEach items="${users}" var="listt">
						<tr>
				<td><%= ++count %></td>
						<td>${listt.id}</td> 
						<td>${listt. feesEmi}</td>
						<td>${listt.fdate}</td>
						<td><a href="EnterFeesEmi.do?id=${listt.id}">Add Fees</a></td>
						<%-- <td>${listt.fileName}</td> --%>
					<%-- 	<td><a href="editUserDetails.do?id=${listt.id}">Edit</a></td>
						<td><a href="deleteUserDetails.do?id=${listt.id}" onclick="return confirm('Please confirm if you want to delete');">Delete</a></td>
				 --%>	
				 </tr>
				 
			     
  			</c:forEach>
			</table>
			</form:form>
</div>
</body>
</html>