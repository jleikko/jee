<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 03</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
<img src="images/hh_logo.jpg" alt="HAAGA-HELIA"/>
<h1>Java EE</h1>
<h2>DEMO 03</h2>

<div id="contentbox">
<h3>Sisältö</h3>
<ul>
<li>HTML lomake</li>
<li>HTTP request method GET</li>
<li>Request parameter</li>
<li>XSS (Cross site scripting)</li>
</ul>
<h3>Toiminta</h3>
<p>Lomakkeelle syötetään nimi, joka lähetetään servletille. Servlet nappaa pyynnöstä parametrin ja muodostaa sivun, johon syötetty nimi tulostetaan.</p>
<h3>Linkit</h3>
<ul>
<li><a href="lomake.jsp">lomake.jsp</a></li>
<li><a href="nayta_syotetty_nimi?etunimi=Matti">nayta_syotetty_nimi?etunimi=Matti</a></li>
<li><a href="nayta_syotetty_nimi?etunimi=Matti<script>alert('OH NO!');</script>">nayta_syotetty_nimi?etunimi=Matti&lt;script&gt;alert('OH NO!');&lt;/script&gt;</a></li>
</ul>
</div>
</body>
</html>