<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jsp/common.jsp"%>
<title>DEMO</title>
<link href="${path}/resources/demo/dashboard.css" rel="stylesheet">
<script type="text/javascript">
	function appoint(bookId){
		$.ajax({
			url:'${path}/book/appoint',
			type:'POST',
			data:{
				bookId:bookId,
				studentId:'0538'
			},
			dataType:'text',
			success:function(result){
				alert(result);
				window.location.href = "${path}/book/list";
			}
		});
	}
	
	function queryBookByName(){
		$("#searchForm").submit();
	}
</script>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="javascript:void(0);" onclick="queryBookByName();">Query</a></li>
					<li><a href="#">Settings</a></li>
					<li><a href="#">Profile</a></li>
					<li><a href="#">Help</a></li>
				</ul>
				<form class="navbar-form navbar-right" id="searchForm" action="${path}/book/queryBookByName">
					<input type="text" name="name" class="form-control" placeholder="Search...">
				</form>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h2 class="sub-header">Section title</h2>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>#</th>
								<th>bookId</th>
								<th>bookName</th>
								<th>bookNum</th>
								<th>options</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="b" varStatus="s">
								<td>${s.count }</td>
								<td>${b.bookId }</td>
								<td>${b.name}</td>
								<td>${b.num }</td>
								<td><a href="javascript:void(0);" onclick="appoint('${b.bookId}')">appiont</a></td>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<script src="${path}/resources/demo/docs.min.js"></script>
</html>