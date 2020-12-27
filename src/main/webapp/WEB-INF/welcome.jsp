<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user form data</title>
<style type="text/css">
h1 {
	text-align: center;
	background: aqua;
	width: 60px;
}

form {
	text-align: center;
	background: gray;
	width: 40px;
}

a {
	text-align: left;
	background: aqua;
}

h2 {
	text-align: right;
	width: 60cm;
}
</style>
</head>
<body>
	<h1>SIGN IN HERE</h1>
	<form action="postingData" method="post">

		<label for="email">Email: </label> <input type="email" id="email" />
		<br /> <label for="pwd">Password:</label> <input type="password"
			id="pwd" name="pwd" /><br /> <input type="submit" value="Submit">
	</form>
	<h3>
		<a href="signIn"> SignIn</a>
	</h3>
	<a href="forgotpw">Forgot Password</a>
	<h2>
		<a href="signUp"> SignUp </a>
	</h2>


</body>
</html>