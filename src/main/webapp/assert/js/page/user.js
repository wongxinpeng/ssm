$(document).ready(function(){
	//查询数据
	initUserData();
	//绑定新增按钮
	$('#btn_add').on('click',function(){
		$('#modal_user_add_edit').modal('show');
	});
	//对提交按钮绑定事件
	$('#btn_submit').on('click',function(){
		$.ajax({
			type:'post',
			url:'user/add',
			data:$('#form_user_add_edit').serialize(),
			success:function(result){
				//判断有值响应回来
				if(result){
					$('#modal_user_add_edit').modal('hide');
					//查询所有的数据
					initUserData();
				}
			}
		});
	});
});
/**
 * 查询所有的数据
 * @returns
 */
function initUserData(){
	$.ajax({
		url:'user/find',
		success:function(htmlData){
			$('#table-responsive').html(htmlData);
		}
	});
}