//등록
$('#writeBtn').click(function(){
	$.ajax({
		type: 'post',
		url: '/user/write',
		data: $('#writeForm').serialize(), //문자열 'name=홍길동&id=hong&pwd=111'로 보낸다
		success: function(){
			alert('등록 완료');
		},
		error: function(err){
			console.log(err);
		}
	});
});