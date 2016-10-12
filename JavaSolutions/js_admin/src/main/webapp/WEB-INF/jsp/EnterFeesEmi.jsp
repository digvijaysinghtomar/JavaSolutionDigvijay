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
<form:form method="POST" action="#" enctype="multipart/form-data" modelAttribute="FeesDto" autocomplete="off">
				<table width="80%" border="0">
					<tr>
						<td>
							<label>
							<form:errors path="feesEmi"  class="label error-label"></form:errors>
									<p>
										Plz Enter Installment<small class="required"></small>
						           </p>
							<form:input path="feesEmi" class="inputControl"
										placeholder="Please enter emi" 
										maxlength="50" id="feesEmi" />
						</label>
						</div>
						</td>
					</tr>
					<tr>
						<td>
							<label>
							<form:errors path="feesRemainingAmount"  class="label error-label"></form:errors>
									<p>
										Remaining amount<small class="required"></small>
								   </p>
									 <form:input path="feesRemainingAmount" class="inputControl"
										placeholder="Please enter your lastname"
										maxlength="50" id="feesRemainingAmount" />
						</label>
						</div>		
						</td>
					</tr>
					<tr>
						<td>
							<label>
							<form:errors path="fdate"  class="label error-label"></form:errors>
									<p>
										Today's Date<small class="required"></small>
								</p>
									<form:input path="emailid" class="inputControl"
										placeholder="Please enter todays date" 
										maxlength="50" id="fdate" />
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
</div></body>
</html>