<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>sample</title>
<style>
.container{
	margin-top:100px;
	/* 위쪽 여백을 말한다. */
}

</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4">
				<div class="panel panel-info">
					<div class="panel-heading">로그인 폼</div>
					<div class="panel-body">

						<form method="post" action="loginprocess.jsp">
							<div class="form-group">
								<label>아이디</label> <input type="text" class="form-control"
									name="userid">
							</div>
							<div class="form-group">
								<label>비밀번호</label> <input type="password" class="form-control"
									name="userpwd">
							</div>
							<div class="form-group text-right">
								<button type="submit" class="btn btn-default">로그인</button>
							</div>
						</form>
					</div>

				</div>

			</div>


		</div>


	</div>
</body>
</html>