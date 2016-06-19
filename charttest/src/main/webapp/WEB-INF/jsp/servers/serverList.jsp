<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>序号</th>
			<th>ip</th>
			<th>服务器类型</th>
			<th></th>
		</tr>
		<c:forEach items="${serverInfos}" var="serverInfo" varStatus="ids">
			<tr>
				<td >${ids.count}</td>
				<td >${serverInfo.ip }</td>
				<td >
					<c:if test="${serverInfo.serverType==1 }">windows</c:if>
					<c:if test="${serverInfo.serverType==2 }">linux</c:if>
					<c:if test="${serverInfo.serverType==3 }">mac</c:if>
				</td>
				<td ><a href="">查看</a></td>
			</tr>
		
		</c:forEach>
	</table>

</body>
</html>