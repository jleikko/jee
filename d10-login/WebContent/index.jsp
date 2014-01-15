<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 10</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
	<img src="images/hh_logo.jpg" alt="HAAGA-HELIA" />
	<h1>Java EE</h1>
	<h2>DEMO 10</h2>

	<div id="contentbox">
		<h3>Sisältö</h3>
		<ul>
			<li>Sisäänkirjautuminen</li>
			<li>Uloskirjautuminen</li>
			<li>Käyttäjätiedot sessiossa</li>
			<li>Kryptattujen salasanojen vertaaminen toisiinsa</li>
		</ul>
		<h3>Toiminta</h3>
		<p>SiteServlet hoitaa ohjauksen joko etusivulle tai sisään
			järjestelmään. Sisäänkirjautumista, uloskirjautumista ja
			rekisteröitymistä varten on omat servlettinsä. Käyttäjän tiedot
			tallennetaan sisäänkirjauduttaessa sessioon atribuuttiin "käyttäjä".</p>
		<h3>Linkki</h3>
		<p>
			<a href="site">site</a>
		</p>
	</div>
</body>
</html>