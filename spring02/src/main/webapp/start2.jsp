<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="insert2" method="get">
		���̵� <input type="text" name="id"> <br>
		���� <input type="text" name="title"> <br>
		���� <input type="text" name="content"> <br>
		�ۼ��� <input type="text" name="write"> <br>
		<input type="submit" value="������ ����">
	</form>
	<hr color="red">
	
	<form action="delete2" method="post">
		���̵� <input type="text" name="id"> <br>
		<input type="submit" value="ID�� ����">
	</form>
	<hr color="red">

	<form action="select2" method="post">
		���̵� <input type="text" name="id"> <br>
		<input type="submit" value="ID�� �˻�">
	</form>
	<hr color="red">

</body>
</html>