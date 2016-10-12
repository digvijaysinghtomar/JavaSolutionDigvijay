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
<form:form method="POST" action="registration.do" enctype="multipart/form-data" modelAttribute="RegistrationDto" autocomplete="off">
				<table width="80%" border="0">
					<tr>
						<td>
							<label>
							<form:errors path="firstname"  class="label error-label"></form:errors>
									<p>
										First Name<small class="required"></small>
						           </p>
							<form:input path="firstname" class="inputControl"
										placeholder="Please enter your firtname" 
										maxlength="50" id="firstname" />
						</label>
						</div>
						</td>
					</tr>
					<tr>
						<td>
							<label>
							<form:errors path="lastname"  class="label error-label"></form:errors>
									<p>
										Last Name<small class="required"></small>
								   </p>
									 <form:input path="Lastname" class="inputControl"
										placeholder="Please enter your lastname"
										maxlength="50" id="Lastname" />
						</label>
						</div>		
						</td>
					</tr>
					<tr>
						<td>
							<label>
							<form:errors path="emailid"  class="label error-label"></form:errors>
									<p>
										Email Id<small class="required"></small>
								</p>
									<form:input path="emailid" class="inputControl"
										placeholder="Please enter your email" 
										maxlength="50" id="emailid" />
						</label>
						</div>		 
							</td>
					</tr>
					<tr>
						<td>
							<label>
							<form:errors path="mobileno"  class="label error-label"></form:errors>
									<p>
										Mobile Number<small class="required"></small>
								    </p>
							<form:input path="mobileno" class="inputControl"
										placeholder="Please enter your mobile number"
										maxlength="11" id="mobileno" />
						</label>
						</div>
						</td>
					</tr>
					<tr>
						<td>
						    <label>
						      <form:errors path="password"  class="label error-label"></form:errors>
									<p>Password<small class="required"></small>
								    </p>
									 <form:password path="password"  class="inputControl"
										placeholder="Password" maxlength="15"
										id="password" />
						</label>
						</div>		
						</td>
					</tr>
					<tr>
						<td>
						    <label>
						      <form:errors path="totalfees"  class="label error-label"></form:errors>
									<p>Total Fees<small class="required"></small>
								    </p>
									 <form:password path="totalfees"  class="inputControl"
										placeholder="Fees" maxlength="15"
										id="totalfees" />
						</label>
						</div>		
						</td>
					</tr>
					<tr><td colspan="2" style="color: red;"><form:errors path="*" cssStyle="color : red;"/>
                ${errors}
                </td></tr>
					<%-- <tr><td>Upload UR Image : </td><td><form:input type="file" path="file" /></td></tr> --%>

                 <!-- <tr><td colspan="2"><input type="submit" value="Upload File" /></td></tr> -->
					
					<tr>
						<td colspan="2"><input type="submit" value="Submit"
							class="btn lg-btn" /></td>
					</tr>
					
					

        
					
				</table>
				
			</form:form>
</div>

<%-- <div>			
			<form:form method="POST" action="" modelAttribute="RegistrationDto" autocomplete="off">
			<table width="100%" border="1" class="table" cellpadding="5px">
					<tr>
					    <th>S.NO.</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email Id</th>
						<th>Mobile No.</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<% int count=1; %>
			        <c:forEach items="${users}" var="listt">
						<tr>
						<td><%= count %></td>
						<td>${listt.LoginId}</td> 
						<td>${listt.firstname}</td>
						<td>${listt.lastname}</td>
						<td>${listt.emailid}</td>
						<td>${listt.mobileno}</td>
						<td><a href="editUserDetails.do?id=${listt.id}">Edit</a></td>
						<td><a href="deleteUserDetails.do?id=${listt.id}" onclick="return confirm('Please confirm if you want to delete');">Delete</a></td>
					</tr>
			       <% count++; %>
  			</c:forEach>
			</table>
			</form:form>
</div>
 --%></body>
</html>