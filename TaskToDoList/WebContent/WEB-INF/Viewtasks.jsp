<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="http://code.ionicframework.com/1.0.0/css/ionic.css" />
	<script src="http://code.ionicframework.com/1.0.0/js/ionic.bundle.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/TaskToDoList/index.html" id="link-1">Back to the home page</a>
<table data-role="table" id="table-1" class="ui-body-a ui-responsive table-stripe">
				<thead>
				
					<tr class="ui-bar-a">
						<th>Task Name</th>
						<th data-priority="1">Status</th>
						<th data-priority="2">Action</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="tasks" items="${alltask }">
				<c:set var="taskid" value="${tasks.taskid }" scope="request"/>
					<tr>
						<td><c:out value="${tasks.taskname }"/></td>
						<td><c:out value="${tasks.taskstatus }"/></td>
						<td>
						
							<a href=<c:url value="/mvc/deletetask/${taskid }"/> id="link-2">Delete</a>    
							<a href=<c:url value="/mvc/dataforeditTasks/${taskid }"/> id="link-3">Edit</a>
							<c:if test='${tasks.taskstatus == "Not Completed" }'>
							<a href=<c:url value="/mvc/marktask/${taskid }"/> id="link-3">Mark as complete</a>
							</c:if>
						
							
						</td>
					</tr>
					
					</c:forEach>
				</tbody>
			</table>
</body>
</html>