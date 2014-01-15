<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 09</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
	<img src="images/hh_logo.jpg" alt="HAAGA-HELIA" />
	<h1>Java EE</h1>
	<h2>DEMO 09</h2>

	<div id="contentbox">
		<h3>Sisältö</h3>
		<ul>
			<li>Salasanojen kryptaus</li>
			<li>Suola</li>
			<li>Rekisteröityminen</li>
			<li>WEB-INF/jsp</li>
		</ul>
		<h3>Toiminta</h3>
		<p>Servlet-ohjaa GET-pyynnöt lomakesivulle, joka on piilotettu
			suoralta kutsulta WEB-INF-kansion alle. Kun lomake lähetetään
			servletille, luodaan doPost-metodissa WebUser-olio, joka validoi
			itsensä, muodostaa suolan ja kryptaa salasanan. Mikäli validointi
			epäonnistuu, ohjataan käyttäjä takaisin lomakkeelle. Jos tiedot ovat
			valideja, DAO-luokkaa pyydetään lisäämään käyttäjä tietokantaan.
			Mikäli DAO-luokka havaitsee tietokannassa tietueen samalla
			käyttäjätunnuksella, ohjataan käyttäjä takaisin lomakkeelle. Mikäli
			käyttäjätunnus on vapaa, suoritetaan lisäys ja palataan lomakkeelle
			ilmoittaen, että rekisteröityminen onnistui.</p>
		<h3>Linkki</h3>
		<p>
			<a href="rekisteroidy">rekisteroidy</a>
		</p>
	</div>
</body>
</html>