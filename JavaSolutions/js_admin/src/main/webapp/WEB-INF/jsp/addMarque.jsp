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
<div class="centerdiv">
<form:form method="POST" action="addMarque.do" enctype="multipart/form-data" modelAttribute="AddMarqueDto" autocomplete="off">
				<table width="80%" border="0">
					<tr>
						<td>
							<label>
							     <form:errors path="marque"  class="label error-label"></form:errors>
									<p>
										Plz Enter Marquee<small class="required"></small>
						           </p>
							      <form:input path="marque" class="inputControl"
										placeholder="Please enter your firtname" 
										maxlength="50" id="marque" />
						</label>
						</div>
						</td>
					</tr>
					<tr>
					 <td colspan="2" style="color: red;"><form:errors path="*" cssStyle="color : red;"/>
                         ${errors}
                     </td>
                    </tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit"
							class="btn lg-btn" /></td>
					</tr>
				</table>
				
			</form:form>
     </div>

     <div>			
			<form:form method="POST" action="" modelAttribute="AddMarqueDto" autocomplete="off">
			<table width="100%" border="1" class="table" cellpadding="5px">
					<tr>
					    <th>S.NO.</th>
						<th>Marque</th>
						<th>Select</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<% int count=1; %>
			        <c:forEach items="${MarqueList}" var="listt">
						<tr>
						<td><%= count %></td>
						<td>${listt.marque}</td>
						<td><input type="checkbox"></td>
						<%-- <td><a href="editUserDetails.do?id=${listt.id}">Edit</a></td>
						<td><a href="deleteUserDetails.do?id=${listt.id}" onclick="return confirm('Please confirm if you want to delete');">Delete</a></td>
					 --%></tr>
			       <% count++; %>
  			</c:forEach>
			</table>
			</form:form>
     </div>
  </body>
</html>