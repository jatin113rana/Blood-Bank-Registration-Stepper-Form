<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personal Details</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
    <br>
    <br>
    <br>
    <br>
<h1>Enter Personal Details</h1><br><br>
<section>
<form action="personal_details" method="post">

	<div>Enter Your Name: <input type="text" name="name"><br></div>
	<div>Age:  <input type="number" name="age"><br></div>
	<div>Gender M or F:<input type="text" name="gender"><br></div>
	<div>Contact Number: <input type="number" name="phone"><br></div>	
	<button type="submit">Next</button>
	
</form>
</section>

</body>
</html>