$(function() {
	$('#searchBtn').click(function() {
		$('#resultDiv').empty();

		$.ajax({
			type: 'post',
			url: '/user/getUser',
			data: 'id=' + $('#searchId').val(),
			success: function(data) {
				//Optional<UserDTO> 값이 있으면 JSON으로 오고 없으면 null로 온다.
				console.log(JSON.stringify(data));

				if (data == null) {
					$('#updateDiv').hide();

					$('#resultDiv').text('찾고자 하는 아이디가 없습니다');
					$('#resultDiv').css('color', 'red');
					$('#resultDiv').css('font-weight', 'red');
				} else {
					//삭제
					if (confirm('정말로 삭제하시겠습니까?')) {
						$.ajax({
							type: 'post',
							url: '/user/delete',
							data: 'id=' + $('#searchId').val(),
							success: function() {
								alert('삭제 완료');
								location.href = '/user/list';
							},
							error: function(err) {
								console.log(err);
							}

						});
					} //if(삭제하시겠습니까?)
				}
			},
			error: function(err) {
				console.log(err);
			}
		});
	});
});