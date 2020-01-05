<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<table class="table table-bordered">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">用户名称</th>
			<th scope="col">用户年龄</th>
			<th scope="col">用户生日</th>
		</tr>
	</thead>
	<tbody>
	<c:if test="${!empty userList}">
	<c:forEach items="${userList}" var="user" varStatus="status">
		<tr>
			<th scope="row">${status.index+1}</th>
			<td>${user.userName}</td>
			<td>${user.userAge}</td>
			<td><fmt:formatDate value="${user.userBirthday}" pattern="yyyy-MM-dd"/></td>
		</tr>
	</c:forEach>
	</c:if>
	</tbody>
</table>