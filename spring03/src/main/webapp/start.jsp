<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css"> <!-- css ��ũ �۾� -->
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script> <!-- JS ��ũ �۾� -->
<script type="text/javascript">
	//jquery�� �̿��Ѵ�.
	//body�� ���� �а� �ڹٽ�ũ��Ʈ�� ��������ּ���

	$(function() {
		//input�� �Է��� �� ������ ������!
		//var inputValue = $('input').val() //input, #id, .in�� ������
		//alert('�ԷµǾ��ִ� ���� '+inputValue)
		
		var idValue = $('#id').val()
		alert('�ԷµǾ� �ִ� id�� '+idValue)
		
		var pwValue = $('#pw').val()
		alert('�ԷµǾ� �ִ� pw�� '+pwValue)
		
		//var classValue = $('.in')
		
	});

</script>
</head>
<body>
	������ 3���� �Դϴ�. <br>
	���̵� �Է�: <input type="text" name="id" value="root" id="id" class="in"> <br> <!-- name�� ����, id�� JS -->
	�н����� �Է�: <input type="text" name="pw" value="1234" id="pw" class="in"> <br>
</body>
</html>