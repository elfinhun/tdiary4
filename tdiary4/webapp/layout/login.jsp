<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	String chkSession = "";
	String name	= "";
	if(session.getAttribute("user")!=null){
		chkSession = "login";
		com.tdiary.web.member.user.model.UserInfo userInfo = (com.tdiary.web.member.user.model.UserInfo)session.getAttribute("user");
		name = userInfo.getName();
		System.out.println(chkSession);
	}else{
		chkSession = "logOut";
		System.out.println(chkSession);
	}
%>    
<html>
	<head>
		<title>login</title>
		<SCRIPT type="text/javascript" src="/tdiary4/common/jquery/jquery-1.3.2.js" ></SCRIPT>
		<script type="text/javascript">
			jQuery(function($) {
				/*
				$('#loginB').click(function(){
					if($('#id').val()==''){
						alert('input id');
					}else if($('#pw').val()==''){
				 		alert('input pw');
				 	}else{				 		
				 	
				 	}
				 	
				});			
				*/
				$('#loginB').click(function(){
					$.ajax({
						url: '/tdiary4/loginCheck.action',
						data: {'userInfo.user_id': $('#id').val(),'userInfo.password': $('#pw').val()},
						type: 'post', 
						dataType: 'text', 
						beforeSend: function() {
							if($('#id').val() == '') {
								alert('insert userId '); return false;
							}else if($('#pw').val() == '') {
								alert('insert pw '); return false;
							}
						},
						error: function() {
							alert('Ajax failure');  
						},
						success: function(response) {
							//alert('status: '+response);
							if(response!='Y'){
								alert(response);														
							}else{
								//alert('goMypage'); 
								location.href="/tdiary4/mypageView.action?tdiary.create_user";
							}
						} 
					});
				
				
				});
				
				if('<%=chkSession%>'=='login'){
					$('#login_before').css("display","none");
					$('#login_after').css("display","block");
				}else{
					$('#login_before').css("display","block");
					$('#login_after').css("display","none");
				}
			
			});
		
		
			function login(){
				if(document.all.id.value){
					alert('input id');
				}else if(document.all.id.pw){
					alert('input pw');
				}
			}
			
		</script>
	</head>

	<body>
	
		<table id="login_before" > 
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" id="id"/></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="text" name="pw" id="pw"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="login" id="loginB"/>
					&nbsp;
					<input type="button" value="join" onclick='location.href="/tdiary4/member/memberJoin.jsp"'/>
				</td>
			</tr>
		</table>
		
		<table id="login_after" >
			<tr>				
				<td><%=name%>님</td>
			</tr>
			<tr>
				<td>환영합니다!</td>
				
			</tr>
			<tr>
				<td colspan="2" align="right">
					
				</td>
			</tr>
		</table>
		

	</body>
</html>
