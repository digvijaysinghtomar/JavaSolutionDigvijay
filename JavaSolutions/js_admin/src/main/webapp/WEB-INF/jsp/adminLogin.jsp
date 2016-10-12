<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
  <title>JSP Page</title> 
  </head>
   <body> 
   
  
<form:form method="POST" action="verifyAdminLogin.do" modelAttribute="LoginDto" autocomplete="off">
				<table width="100%" border="0">
					<tr>
						<td>
							<label>
									<p>
										 Id<small class="required"></small>
									</p> <form:input path="id" class="inputControl"
										placeholder="Please enter your email" required="autofocus"
										maxlength="50" id="id" />
								</label>
							</div></td>
					</tr>
					<tr>
						<td>
						    <label>
									<p>
										Password<small class="required"></small>
									</p> <form:password path="password"  class="inputControl"
										placeholder="Password" required="autofocus" maxlength="15"
										id="password" />
								</label>
							</div></td>
					</tr>
					
					<tr>
						<td colspan="2"><input type="submit" value="Submit"
							class="btn lg-btn" /></td>
					</tr>
				</table>
			</form:form>
    </center> 
    </body> 
    </html>

