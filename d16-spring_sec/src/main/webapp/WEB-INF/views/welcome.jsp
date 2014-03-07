<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 16</title>
<link rel="stylesheet" type="text/css"
	href="resources/styles/common.css">
</head>
<body>
	<img src="resources/images/hh_logo.jpg" alt="HAAGA-HELIA" />
	<h1>Java EE</h1>
	<h2>DEMO 16</h2>

	<div id="contentbox">
		<h3>Sisältö</h3>
		<ul>
			<li>Spring Security</li>
			<li>Todentaminen (Authentication)</li>
			<li>Valtuuttaminen (Authorization)</li>
			<li>Käyttäjätiedot XML-tiedostossa</li>
			<li>Käyttäjätiedot tietokannassa</li>
			<li>Web/HTTP Security</li>
			<li>Business Object (Method) Security</li>
		</ul>
		<h3>Toiminta</h3>
		<p><img src="resources/images/spring_security_demo_rakenne.png" alt="Rakennekuva"/></p>
		<p><i>Kokeile seuraavia käyttäjiä:</i><br/>
		matti:masanpassu (ROLE_USER) TAI aada:adminpassu (ROLE_USER, ROLE_ADMIN)</p>
		<h3>Linkit</h3>
		<p>
			<a href="loginpage">loginpage</a><br/>
			<a href="secure/main">secure/main</a><br/>
			<a href="secure/admin/tools">secure/admin/tools</a>
		</p>
		<p>
			Lisäsivut:<br/>
			<a href="misc/admineille">misc/admineille</a><br/>
			<a href="misc/sisaankirjautuneille">misc/sisaankirjautuneille</a><br/>
			<a href="misc/kaikille">misc/kaikille</a><br/>
		</p>
	</div>
</body>
</html>