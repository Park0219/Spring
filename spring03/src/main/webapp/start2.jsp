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
		
		//1. btnŬ������ ��ư�� ������
		$('.btn').click(function() {
			//2. id, pw Ŭ������ ���� ������ ������
			idValue = $('.id').val()
			pwValue = $('.pw').val()
			//3. id, pw�� Ȯ�� ���
			console.log('�Է��� ID>> '+idValue)
			console.log('�Է��� PW>> '+pwValue)
			console.log('�Է��� ID�� ���̴�>> '+idValue.length)
			
			if(idValue.length >= 5) {
				location.href="insert.do?id="+idValue+"&pw="+pwValue
			}
			else {
				//alert('�Է��� ID�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���')
				$('.d1').text('�Է��� ID�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���')
			}
			
			if(pwValue.length >= 5) {
				location.href="insert.do?id="+idValue+"&pw="+pwValue
			}
			else {
				//alert('�Է��� PW�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���')
				$('.d2').text('�Է��� PW�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���')
			}
			
		});
	});

</script>
</head>
<body>
	���̵� �Է�: <input type="text" name="id" class="id"> <br>
	<div class="d1" style="color: red;"></div> <br>
	�н����� �Է�: <input type="text" name="pw" class="pw"> <br>
	<div class="d2" style="color: blue;"></div> <br>
	<input type="button" value="�Է°� üũ" class="btn">
</body>
</html>