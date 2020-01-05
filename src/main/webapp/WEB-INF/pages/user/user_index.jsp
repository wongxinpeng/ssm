<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container-fluid">
	<!-- Breadcrumbs-->
	<!-- <ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
		<li class="breadcrumb-item active">Overview</li>
	</ol> -->
	<!-- DataTables Example -->
	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> 用户管理
			<button type="button" class="btn btn-success btn-sm float-right" id="btn_add">新增</button>
		</div>
		<div class="card-body">
			<div class="table-responsive" id="table-responsive">
				
			</div>
		</div>
	</div>
</div>
<!-- Modal -->
<div class="modal fade" id="modal_user_add_edit" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered modal-lg" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalCenterTitle">Modal title</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="form_user_add_edit">
				<div class="modal-body">
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">用户名称</label>
						<div class="col-sm-7">
							<input class="form-control" name="userName" id="userName">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">用户年龄</label>
						<div class="col-sm-7">
							<input class="form-control" name="userAge" id="userAge">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">用户生日</label>
						<div class="col-sm-7">
							<input class="form-control" name="userBirthday" id="userBirthday" type="date">
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="btn_submit">提交</button>
				</div>
			</form>
		</div>
	</div>
</div>
<script src="assert/js/page/user.js"></script>