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
		$('.answer').keyup(function() {
			
			idValue = $('.id').val()
			if(idValue.length >= 5) {
				$('.d1').text('�Է��� ID�� �����մϴ�')
			} //if
			else {
				$('.d1').text('�Է��� ID�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���')
			} //else
				
			answer = $('.answer').val()
			correct = 'apple'
			if(correct == answer){
				$('.d2').text('�����Դϴ�')
			}
			else{
				$('.d2').text('�����Դϴ�.')
			}
				
		}); //keyup
	}); //$

</script>
</head>
<body>
	���̵� �Է�: <input type="text" name="id" class="id"> <br>
	<div class="d1" style="color: red;"></div> <br>
	�����̸� �Է�: <input type="text" name="answer" class="answer"> <br>
	<div class="d2" style="color: blue;"></div> <br>
</body>
</html>