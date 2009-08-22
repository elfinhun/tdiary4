<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<html>
	<head>
		<title><decorator:title default="Mysterious page..." /></title>
		<link href="<%= request.getContextPath() %>/layout/main.css" rel="stylesheet" type="text/css">		
		<decorator:head />
		
		<script type="text/javascript">
			function logOut(){
				if(confirm('logOut OK?')){
					location.href="/tdiary4/logOut.action"
				}
			}
		</script>
		
	</head>

	<body>
		 
		<table width="1024" height="580" border="1" bordercolor="red">
			<tr>
				<td colspan="2" width="100%" align="right">					
						<input type="button" value="logOut" onclick="logOut();" />		
				</td>				
			</tr>
			
			<tr>
				<td valign="top">
					<page:applyDecorator page="/layout/login.jsp" name="panel" />
					<page:applyDecorator page="/layout/acc1.html" name="panel" />
					<page:applyDecorator page="/layout/counter.jsp" name="panel" />
					<page:applyDecorator page="/layout/google.html" name="panel" />
					
					<%--page:applyDecorator page="/random.pl" name="panel" /--%>
				</td>
				<td width="100%">
					<table width="100%" height="100%">
						<tr>
							<td id="pageTitle" >
								<decorator:title />
							</td>
						</tr>
						<tr>
							<td valign="top" height="100%">
								<decorator:body />
							</td>
						</tr>
						<tr>
							<td id="footer" >
								<b>Disclaimer:</b>
								This site is an example site to demonstrate SiteMesh. It serves no other purpose.
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>

		<%-- Construct URL from page request and append 'printable=true' param --%>
		<decorator:usePage id="p" />
		<%
			StringBuffer printUrl = new StringBuffer();
			printUrl.append(request.getRequestURI());
			printUrl.append("?printable=true");
			if (request.getQueryString()!=null) {
				printUrl.append('&');
				printUrl.append(request.getQueryString());
			}
		%>
		<p align="right">[ <a href="<%= printUrl %>">printable version </a> ]</p>    

	</body>
</html>