<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="insert" method="post">
		���̵� <input type="text" name="id"> <br>
		�н����� <input type="text" name="pw"> <br>
		�̸� <input type="text" name="name"> <br>
		��ȭ��ȣ <input type="text" name="tel"> <br>
		<input type="submit" value="������ ����">
	</form>
	<hr color="red">
	
	<form action="select" method="post">
		���̵� <input type="text" name="id"> <br>
		<input type="submit" value="ID�� �˻�">
	</form>
	<hr color="red">
	
	<form action="delete" method="post">
		���̵� <input type="text" name="id"> <br>
		<input type="submit" value="ID�� ����">
	</form>
	<hr color="red">
</body>
</html>