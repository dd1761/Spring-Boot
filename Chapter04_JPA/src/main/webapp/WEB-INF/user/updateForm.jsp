<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
	수정 할 아이디 입력 <input type="text" id="searchId">
	<input type="button" id="searchBtn" value="검색">
</p>
<div id="resultDiv"></div>

<div id="updateDiv">
<form id="updateForm">
	<table border="1">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>
				<input type="text" name="id" id="id" readonly>
				<div id="idDiv"></div>
			</td>
			
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="pwd" id="pwd"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="수정" id="updateBtn">
				<input type="reset" value="취소" id="resetBtn">
			</td>
		</tr>
	</table>
</form>
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="/js/update.js"></script>
</body>
</html>