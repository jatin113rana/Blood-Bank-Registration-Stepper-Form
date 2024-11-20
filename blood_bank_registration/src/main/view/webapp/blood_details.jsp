<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blood Details</title>
<link rel="stylesheet" href="blood_details.css">
</head>
<body>
    <br><br><br><br>
    <h1>Enter Your Blood Details</h1>
<section>
    <form action="blood_details_controller" method="post">
        Blood Group: <input type="text" name="blood_group"><br>
        Last Donation Date: <input type="date" name="donation_date"><br>
        Any Medical Complication: <input type="text" name="complication"><br>
        <button type="submit">Next</button>
        </form>
</section>

</body>
</html>