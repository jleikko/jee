<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" type="text/css" href="resources/styles/common.css">
<link rel="stylesheet" type="text/css" href="resources/styles/list.css">
<title>Henkil&ouml;t</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
$(document).ready(function(){
	$.getJSON( "henkilot.json", function( data ) {
	  $.each( data, function( key, val ) {
		//käyntikortti
		var henk = $("<section class='Olio'/>").appendTo("#lista");
		//nimi
		$("<h2/>").text(val.etunimi + " " +val.sukunimi).appendTo(henk);
		//email
		var linkki = $("<a/>", {html: val.sahkoposti, href: "mailto:"+val.sahkoposti});
		$("<p/>").append(linkki).appendTo(henk);
		//osoite
		$("<p/>").append(val.lahiosoite + ", " + val.postinumero + " " + val.postitoimipaikka).appendTo(henk);
	  });
	});	
});
</script>
</head>
<body>
<h1>Henkil&ouml;t</h1>
<div id="lista" ></div>
</body>
</html>