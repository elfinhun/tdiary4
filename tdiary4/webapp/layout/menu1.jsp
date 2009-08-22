<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<SCRIPT src="/tdiary4/common/jquery/jquery.js" type=text/javascript></SCRIPT>

<SCRIPT type=text/javascript>
	$(document).ready(function(){
	
		$(".accordion h3:first").addClass("active");
		$(".accordion p:not(:first)").hide();
	
		$(".accordion h3").click(function(){
			$(this).next("p").slideToggle("slow")
			.siblings("p:visible").slideUp("slow");
			$(this).toggleClass("active");
			$(this).siblings("h3").removeClass("active");
		});

	});
</SCRIPT>

<STYLE type=text/css>BODY {
	MARGIN: 10px auto; FONT: 75%/120% Arial, Helvetica, sans-serif; WIDTH: 570px
}
.accordion {
	WIDTH: 480px; BORDER-BOTTOM: #c4c4c4 1px solid
}
.accordion H3 {
	BORDER-RIGHT: #c4c4c4 1px solid; PADDING-RIGHT: 15px; BORDER-TOP: #c4c4c4 1px solid; PADDING-LEFT: 15px; BACKGROUND: url(images/arrow-square.gif) #e9e7e7 no-repeat right -51px; PADDING-BOTTOM: 7px; MARGIN: 0px; FONT: bold 120%/100% Arial, Helvetica, sans-serif; BORDER-LEFT: #c4c4c4 1px solid; CURSOR: pointer; PADDING-TOP: 7px; BORDER-BOTTOM: #c4c4c4 1px
}
.accordion H3:hover {
	BACKGROUND-COLOR: #e3e2e2
}
.accordion H3.active {
	BACKGROUND-POSITION: right 5px
}
.accordion P {
	BORDER-RIGHT: #c4c4c4 1px solid; PADDING-RIGHT: 15px; PADDING-LEFT: 15px; BACKGROUND: #f7f7f7; PADDING-BOTTOM: 20px; MARGIN: 0px; BORDER-LEFT: #c4c4c4 1px solid; PADDING-TOP: 10px
}
</STYLE>

<META content="MSHTML 6.00.6000.16809" name=GENERATOR></HEAD>
<BODY>
<DIV class=accordion>
<H3>Question One Sample Text</H3>
<P>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi malesuada, 
ante at feugiat tincidunt, enim massa gravida metus, commodo lacinia massa diam 
vel eros. Proin eget urna. Nunc fringilla neque vitae odio. Vivamus vitae 
ligula.</P>
<H3>This is Question Two</H3>
<P>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi malesuada, 
ante at feugiat tincidunt, enim massa gravida metus, commodo lacinia massa diam 
vel eros. Proin eget urna. Nunc fringilla neque vitae odio. Vivamus vitae 
ligula.</P>
<H3>Another Questio here</H3>
<P>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi malesuada, 
ante at feugiat tincidunt, enim massa gravida metus, commodo lacinia massa diam 
vel eros. Proin eget urna. Nunc fringilla neque vitae odio. Vivamus vitae 
ligula.</P>
<H3>Sample heading</H3>
<P>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi malesuada, 
ante at feugiat tincidunt, enim massa gravida metus, commodo lacinia massa diam 
vel eros. Proin eget urna. Nunc fringilla neque vitae odio. Vivamus vitae 
ligula.</P>
<H3>Sample Question Heading</H3>
<P>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi malesuada, 
ante at feugiat tincidunt, enim massa gravida metus, commodo lacinia massa diam 
vel eros. Proin eget urna. Nunc fringilla neque vitae odio. Vivamus vitae 
ligula.</P></DIV></BODY></HTML>
