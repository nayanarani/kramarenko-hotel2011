<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="true">
	<form name="loginForm" method="post" action="controller">
		<input type="hidden" name="command" value="login" />
			<input type="text" name="email" value="your@login.here">
			<br/>
			<input type="password" name="password" value="">
			<br/>
			<input type="submit" value="login">
	</form>
</c:if>