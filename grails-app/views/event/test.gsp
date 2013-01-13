<%@ page import="events.*" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>Test</title>
	</head>
	<body>

		<events:list events="${Event.list()}" />

	</body>
</html>