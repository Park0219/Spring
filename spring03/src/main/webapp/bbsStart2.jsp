<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script> <!-- JS ��ũ �۾� -->
<script type="text/javascript">

	$(function() {

		$('.btn').click(function() {
			
			titleValue = $('.title').val()
			contentValue = $('.content').val()
			writerValue = $('.writer').val()
			
			location.href="insert2.do?title="+titleValue+"&content="+contentValue+"&writer="+writerValue
			
		});
		
	});
	

</script>
</head>
<body>

	���� <input type="text" name="title" class="title"> <br>
	���� <input type="text" name="content" class="content"> <br>
	�ۼ��� <input type="text" name="writer" class="writer"> <br>
	<input type="button" value="�Է¿Ϸ�" class="btn">

</body>
</html>