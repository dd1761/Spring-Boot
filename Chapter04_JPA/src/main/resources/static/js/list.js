$(function(){
	$.ajax({
		type: 'post',
		url: '/user/getUserList',
		success: function(data){
			console.log(data);
			console.log(JSON.stringify(data));
			$.each(data, function(index, item) {
                
                var html = `<tr>` +
                	   `<td align="center">` + item.name + `</td>` + 
                	   `<td align="center">` + item.id + `</td>` + 
                	   `<td align="center">` + item.pwd + `</td>` + 
                	   `</tr>`;
                	   
                	   $('#listTable').append(html);
            });
		},
		error: function(err){
			console.log(err);
		}
	});
});