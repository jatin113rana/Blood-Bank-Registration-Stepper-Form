<%@page import="model.dto.DonorDetails"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="review_and_submit.css">
</head>
<body>
    <br><br><br><br>

<h1>Review Your Form Details</h1>
<%
HttpSession session3= request.getSession();
DonorDetails dd =(DonorDetails)session3.getAttribute("dd");
%>
<section>
    <form action="review_and_submit" method="get" >
        <div>Name:<%=dd.getName()%></div>
        <div>Age:<%=dd.getAge()%></div>
        <div>Gender:<%=dd.getGender()%></div>
        <div>Phone:<%=dd.getPhone()%></div>
        <div>Blood Group:<%=dd.getBlood_group()%></div>
        <div>Last Donation Date:<%=dd.getLast_donation_date()%></div>
        <div>Medical Complication:<%=dd.getComplication()%></div>
        <div>State:<%=dd.getState()%></div>
        <div>City:<%=dd.getCity()%></div>
        <div>Pin Code:<%=dd.getPincode()%></div>
        <div>Full Address:<%=dd.getAddress()%></div>
        
        <button type="submit">Submit</button>
        </form>
</section>




</body>
</html>