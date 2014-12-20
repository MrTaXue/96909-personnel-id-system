<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<style>
/*setup*/
* {
	margin: 0;
	padding: 0;
}

@font-face {
	font-family: 'Monoton';
	font-style: normal;
	font-weight: 400;
}

@font-face {
	font-family: 'Iceland';
	font-style: normal;
	font-weight: 400;
}

@font-face {
	font-family: 'Pacifico';
	font-style: normal;
	font-weight: 400;
}

@font-face {
	font-family: 'PressStart';
	font-style: normal;
	font-weight: 400;
}

@font-face {
	font-family: 'Audiowide';
	font-style: normal;
	font-weight: 400;
}

@font-face {
	font-family: 'Vampiro One';
	font-style: normal;
	font-weight: 400;
}

body {
	background-color: #222222;
}

#container {
	width: 500px;
	margin: auto;
}

/*neeeeoooon*/
p {
	text-align: center;
	font-size: 3em;
	margin: 20px 0 20px 0;
}

a {
	text-decoration: none;
	-webkit-transition: all 0.5s;
	-moz-transition: all 0.5s;
	transition: all 0.5s;
}

p:nth-child(1) a {
	color: #FF1177;
	font-family: Monoton;
}

p:nth-child(1) a:hover {
	-webkit-animation: neon1 1.5s ease-in-out infinite alternate;
	-moz-animation: neon1 1.5s ease-in-out infinite alternate;
	animation: neon1 1.5s ease-in-out infinite alternate;
}

p:nth-child(2) a {
	font-size: 1.5em;
	color: #228DFF;
	font-family: Iceland;
}

p:nth-child(2) a:hover {
	-webkit-animation: neon2 1.5s ease-in-out infinite alternate;
	-moz-animation: neon2 1.5s ease-in-out infinite alternate;
	animation: neon2 1.5s ease-in-out infinite alternate;
}

p:nth-child(3) a {
	color: #FFDD1B;
	font-family: Pacifico;
}

p:nth-child(3) a:hover {
	-webkit-animation: neon3 1.5s ease-in-out infinite alternate;
	-moz-animation: neon3 1.5s ease-in-out infinite alternate;
	animation: neon3 1.5s ease-in-out infinite alternate;
}

p:nth-child(4) a {
	color: #B6FF00;
	font-family: PressStart;
	font-size: 0.8em;
}

p:nth-child(4) a:hover {
	-webkit-animation: neon4 1.5s ease-in-out infinite alternate;
	-moz-animation: neon4 1.5s ease-in-out infinite alternate;
	animation: neon4 1.5s ease-in-out infinite alternate;
}

p:nth-child(5) a {
	color: #FF9900;
	font-family: Audiowide;
}

p:nth-child(5) a:hover {
	-webkit-animation: neon5 1.5s ease-in-out infinite alternate;
	-moz-animation: neon5 1.5s ease-in-out infinite alternate;
	animation: neon5 1.5s ease-in-out infinite alternate;
}

p:nth-child(6) a {
	color: #BA01FF;
	font-family: Vampiro One;
}

p:nth-child(6) a:hover {
	-webkit-animation: neon6 1.5s ease-in-out infinite alternate;
	-moz-animation: neon6 1.5s ease-in-out infinite alternate;
	animation: neon6 1.5s ease-in-out infinite alternate;
}

p a:hover {
	color: #ffffff;
}

/*glow for webkit*/
@
-webkit-keyframes neon1 {from { text-shadow:0010px#fff, 0020px#fff,
	0030px#fff, 0040px#FF1177, 0070px#FF1177, 0080px#FF1177, 00100px#FF1177,
	00150px#FF1177;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FF1177, 0 0 35px #FF1177, 0 0 40px #FF1177, 0 0 50px #FF1177, 0 0
		75px #FF1177;
}

}
@
-webkit-keyframes neon2 {from { text-shadow:0010px#fff, 0020px#fff,
	0030px#fff, 0040px#228DFF, 0070px#228DFF, 0080px#228DFF, 00100px#228DFF,
	00150px#228DFF;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#228DFF, 0 0 35px #228DFF, 0 0 40px #228DFF, 0 0 50px #228DFF, 0 0
		75px #228DFF;
}

}
@
-webkit-keyframes neon3 {from { text-shadow:0010px#fff, 0020px#fff,
	0030px#fff, 0040px#FFDD1B, 0070px#FFDD1B, 0080px#FFDD1B, 00100px#FFDD1B,
	00150px#FFDD1B;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FFDD1B, 0 0 35px #FFDD1B, 0 0 40px #FFDD1B, 0 0 50px #FFDD1B, 0 0
		75px #FFDD1B;
}

}
@
-webkit-keyframes neon4 {from { text-shadow:0010px#fff, 0020px#fff,
	0030px#fff, 0040px#B6FF00, 0070px#B6FF00, 0080px#B6FF00, 00100px#B6FF00,
	00150px#B6FF00;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#B6FF00, 0 0 35px #B6FF00, 0 0 40px #B6FF00, 0 0 50px #B6FF00, 0 0
		75px #B6FF00;
}

}
@
-webkit-keyframes neon5 {from { text-shadow:0010px#fff, 0020px#fff,
	0030px#fff, 0040px#FF9900, 0070px#FF9900, 0080px#FF9900, 00100px#FF9900,
	00150px#FF9900;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FF9900, 0 0 35px #FF9900, 0 0 40px #FF9900, 0 0 50px #FF9900, 0 0
		75px #FF9900;
}

}
@
-webkit-keyframes neon6 {from { text-shadow:0010px#fff, 0020px#fff,
	0030px#fff, 0040px#ff00de, 0070px#ff00de, 0080px#ff00de, 00100px#ff00de,
	00150px#ff00de;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#ff00de, 0 0 35px #ff00de, 0 0 40px #ff00de, 0 0 50px #ff00de, 0 0
		75px #ff00de;
}

}

/*glow for mozilla*/
@
-moz-keyframes neon1 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#FF1177, 0070px#FF1177, 0080px#FF1177, 00100px#FF1177, 00150px#FF1177;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FF1177, 0 0 35px #FF1177, 0 0 40px #FF1177, 0 0 50px #FF1177, 0 0
		75px #FF1177;
}

}
@
-moz-keyframes neon2 {from { text-shadow :0010px#fff, 0020px#fff, 0030px#fff,
	0040px#228DFF, 0070px#228DFF, 0080px#228DFF, 00100px#228DFF, 00150px#228DFF;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#228DFF, 0 0 35px #228DFF, 0 0 40px #228DFF, 0 0 50px #228DFF, 0 0
		75px #228DFF;
}

}
@
-moz-keyframes neon3 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#FFDD1B, 0070px#FFDD1B, 0080px#FFDD1B, 00100px#FFDD1B, 00150px#FFDD1B;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FFDD1B, 0 0 35px #FFDD1B, 0 0 40px #FFDD1B, 0 0 50px #FFDD1B, 0 0
		75px #FFDD1B;
}

}
@
-moz-keyframes neon4 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#B6FF00, 0070px#B6FF00, 0080px#B6FF00, 00100px#B6FF00, 00150px#B6FF00;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#B6FF00, 0 0 35px #B6FF00, 0 0 40px #B6FF00, 0 0 50px #B6FF00, 0 0
		75px #B6FF00;
}

}
@
-moz-keyframes neon5 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#FF9900, 0070px#FF9900, 0080px#FF9900, 00100px#FF9900, 00150px#FF9900;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FF9900, 0 0 35px #FF9900, 0 0 40px #FF9900, 0 0 50px #FF9900, 0 0
		75px #FF9900;
}

}
@
-moz-keyframes neon6 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#ff00de, 0070px#ff00de, 0080px#ff00de, 00100px#ff00de, 00150px#ff00de;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#ff00de, 0 0 35px #ff00de, 0 0 40px #ff00de, 0 0 50px #ff00de, 0 0
		75px #ff00de;
}

}

/*glow*/
@
keyframes neon1 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#FF1177, 0070px#FF1177, 0080px#FF1177, 00100px#FF1177, 00150px#FF1177;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FF1177, 0 0 35px #FF1177, 0 0 40px #FF1177, 0 0 50px #FF1177, 0 0
		75px #FF1177;
}

}
@
keyframes neon2 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#228DFF, 0070px#228DFF, 0080px#228DFF, 00100px#228DFF, 00150px#228DFF;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#228DFF, 0 0 35px #228DFF, 0 0 40px #228DFF, 0 0 50px #228DFF, 0 0
		75px #228DFF;
}

}
@
keyframes neon3 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#FFDD1B, 0070px#FFDD1B, 0080px#FFDD1B, 00100px#FFDD1B, 00150px#FFDD1B;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FFDD1B, 0 0 35px #FFDD1B, 0 0 40px #FFDD1B, 0 0 50px #FFDD1B, 0 0
		75px #FFDD1B;
}

}
@
keyframes neon4 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#B6FF00, 0070px#B6FF00, 0080px#B6FF00, 00100px#B6FF00, 00150px#B6FF00;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#B6FF00, 0 0 35px #B6FF00, 0 0 40px #B6FF00, 0 0 50px #B6FF00, 0 0
		75px #B6FF00;
}

}
@
keyframes neon5 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#FF9900, 0070px#FF9900, 0080px#FF9900, 00100px#FF9900, 00150px#FF9900;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#FF9900, 0 0 35px #FF9900, 0 0 40px #FF9900, 0 0 50px #FF9900, 0 0
		75px #FF9900;
}

}
@
keyframes neon6 {from { text-shadow:0010px#fff, 0020px#fff, 0030px#fff,
	0040px#ff00de, 0070px#ff00de, 0080px#ff00de, 00100px#ff00de, 00150px#ff00de;
	
}

to {
	text-shadow: 0 0 5px #fff, 0 0 10px #fff, 0 0 15px #fff, 0 0 20px
		#ff00de, 0 0 35px #ff00de, 0 0 40px #ff00de, 0 0 50px #ff00de, 0 0
		75px #ff00de;
}

}

/*REEEEEEEEEEESPONSIVE*/
@media ( max-width : 650px) {
	#container {
		width: 100%;
	}
	p {
		font-size: 3.5em;
	}
}

#container {
	-moz-border-radius: 50px;
	-webkit-border-radius: 50px;
	border-radius: 50px;
	/*IE 7 AND 8 DO NOT SUPPORT BORDER RADIUS*/
	-moz-box-shadow: 0px 0px 16px #000000;
	-webkit-box-shadow: 0px 0px 16px #000000;
	box-shadow: 0px 0px 16px #000000;
	/*IE 7 AND 8 DO NOT SUPPORT BLUR PROPERTY OF SHADOWS*/
	filter: progid:      DXImageTransform.Microsoft.gradient(startColorstr=
		 
		   '#21ff99', endColorstr=      '#ffc333' );
	/*INNER ELEMENTS MUST NOT BREAK THIS ELEMENTS BOUNDARIES*/
	/*Element must have a height (not auto)*/
	/*All filters must be placed together*/
	-ms-filter:
		"progid: DXImageTransform.Microsoft.gradient(startColorstr = '#21ff99', endColorstr = '#ffc333')";
	/*Element must have a height (not auto)*/
	/*All filters must be placed together*/
	background-image: -moz-linear-gradient(top, #21ff99, #ffc333);
	background-image: -ms-linear-gradient(top, #21ff99, #ffc333);
	background-image: -o-linear-gradient(top, #21ff99, #ffc333);
	background-image: -webkit-gradient(linear, center top, center bottom, from(#21ff99),
		to(#ffc333) );
	background-image: -webkit-linear-gradient(top, #21ff99, #ffc333);
	background-image: linear-gradient(top, #21ff99, #ffc333);
	-moz-background-clip: padding;
	-webkit-background-clip: padding-box;
	background-clip: padding-box;
	/*Use "background-clip: padding-box" when using rounded corners to avoid the gradient bleeding through the corners*/
	/*--IE9 WILL PLACE THE FILTER ON TOP OF THE ROUNDED CORNERS--*/
	opacity: 0.74;
	-ms-filter: progid:      DXImageTransform.Microsoft.Alpha(Opacity=      74
		);
	/*-ms-filter must come before filter*/
	filter: alpha(opacity =           74);
	/*INNER ELEMENTS MUST NOT BREAK THIS ELEMENTS BOUNDARIES*/
	/*All filters must be placed together*/
}
</style>
<div id="container" fit="true">
	<p>
		<a>96909社区服务中心</a>
	</p>
	<p>
		<a>欢迎您，${mylogin.accName }！</a>
	</p>
	<p>
		<a>请放心使用！</a>
	</p>
	<p>
		<a>部分功能待完善...</a>
	</p>
	<p>
		<a>开发环境：MyEclipse10</a>
	</p>
	<p>
		<a>开发人员：苑博</a>
	</p>
</div>


