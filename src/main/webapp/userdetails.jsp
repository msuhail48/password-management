<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text], input[type=email], input[type=password], input[type=tel]
	{
	width: 100%;
	height: 40px;
	padding: 5px;
	margin-bottom: 10px;
	margin-top: 5px;
	border: 2px solid #ccc;
	color: #4f4f4f;
	font-size: 16px;
	border-radius: 5px;
}

input[type=submit] {
	font-size: 16px;
	background: linear-gradient(#ffbc00 5%, #ffdd7f 100%);
	border: 1px solid #e5a900;
	color: #4E4D4B;
	font-weight: bold;
	width: 50%;
	border-radius: 5px;
	padding: 5px;
	margin-left: 55px;
}

div.main {
	width: 300px;
	padding: 10px 30px 25px;
	border-radius: 10px;
	margin: auto;
	background-color: whitesmoke;
	vertical-align: middle;
	display: flex;
}

input[type=submit]:hover {
	background: linear-gradient(#ffdd7f 5%, #006666 100%);
}

.container {
	height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
	<div class="container">
		<div class="main">
			<form action="saveUserData" method="post">
				<div>
					<label for="appName">Application Name</label> <input type="text"
						name="appName">
				</div>
				<div>
					<label for="userName">User Name</label> <input type="text"
						name="userName">
				</div>
				<div>
					<label for="email">Email</label> <input type="email" name="email">
				</div>
				<div>
					<label for="password">Password</label> <input type="password"
						name="password">
				</div>

				<div>
					<input type="submit" value="save">
				</div>
			</form>
			</div>
			</div>
</body>
</html>