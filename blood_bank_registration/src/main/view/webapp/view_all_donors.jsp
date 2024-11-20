<%@page import="model.dto.DonorDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALl Donors</title>
<link rel="stylesheet" href="view_all_donors.css">
</head>

<body>
<br>
<br><br><br>

<h1>Donor DataBase</h1>
<%
	List<DonorDetails> donors =(List<DonorDetails>)request.getAttribute("donors");
%>

<table border="1">
<tr>
<th>Name</th>
<th>Age</th>
<th>Gender</th>
<th>Phone</th>
<th>Blood Group</th>
<th>Last Donation Date</th>
<th>Any Medical Complications</th>
<th>State</th>
<th>City</th>
<th>Pin Code</th>
<th>Full Address</th>
</tr>
<% for(DonorDetails dd :donors){ %>
<tr>
<td><%= dd.getName() %></td>
<td><%= dd.getAge() %></td>
<td><%=dd.getGender() %></td>
<td><%= dd.getPhone() %></td>

<td><%= dd.getBlood_group() %></td>
<td><%=dd.getLast_donation_date() %></td>
<td><%=dd.getComplication() %></td>

<td><%=dd.getState() %></td>
<td><%=dd.getCity() %></td>
<td><%=dd.getPincode() %></td>
<td><%=dd.getAddress() %></td>
</tr>
<%} %>
</table>

</body>
</html>