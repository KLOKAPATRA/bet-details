<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LEADS</title>
</head>
<body>
    <h2>LEADS AND BETS</h2>
      <form action="savebets" method="post">
      <pre>   
           ID: <input type="text" name="id">    
        Numbets     <input type="text" name="numbets">
		 Game    <input type="text" name="game">
		   STAKE  <input type="text" name="stake">
		   RETURNS  <input type="text" name="returns">
		    CLEINTID <input type="text" name="clientid">
		    DATE <input type="text" name="date">
		     <input type="submit" value="save">
      </pre>
      </form>
</body>
</html>