<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out2.css"> <!-- css ��ũ �۾� -->
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script> <!-- JS ��ũ �۾� -->
<script type="text/javascript">

	$(function() {
		var titleValue = $('.title').val()
		alert('�ԷµǾ��ִ� ������ '+titleValue)
		
		var contentValue = $('.content').val()
		alert('�ԷµǾ��ִ� ������ '+contentValue)
		
		var writerValue = $('.writer').val()
		alert('�ԷµǾ��ִ� �ۼ����� '+writerValue)
		
	});


</script>
</head>
<body>

	���� <input type="text" name="title" class="title" value="spring"> <br>
	���� <input type="text" name="content" class="content" value="funspring"> <br>
	�ۼ��� <input type="text" name="writer" class="writer" value="park"> <br>

</body>
</html>