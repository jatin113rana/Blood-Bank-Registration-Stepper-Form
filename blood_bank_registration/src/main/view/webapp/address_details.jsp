<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address Details</title>
<link rel="stylesheet" href="address_details.css">
</head>
<body>
    <br><br><br><br>
    <h1>Enter Your Address Details</h1>
<section>
<form action="address_details_controller" method="post">
State: <input type="text" name="state"><br>
City: <input type="text" name="city"><br>
Pincode: <input type="number" name="pincode"><br>
Full Address: <input type="text" name="address"><br>
<button type="submit">Next</button>

</form>

</section>
</body>
</html>