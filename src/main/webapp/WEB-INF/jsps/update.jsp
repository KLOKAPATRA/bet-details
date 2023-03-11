<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hiiiiiiiiiiiiii</h1>
   
   <form action="updatebets" method="post">
      <pre>
        ID:<input type="number" name="id" value="${bet.id }">
       NUMBETS: <input type="text" name="numbets" value="${bet.numbets }">
       GAME: <input type="text" name="game" value="${bet.game }">
        STAKE:<input type="text" name="stake" value="${bet.stake }">
       RETURNS: <input type="text" name="returns" value="${bet.returns }">
       CLIENTID <input type="text" name="clientid" value="${bet.clientid }">
       DATE <input type="text" name="date" value="${bet.date}">
        <input type="submit" value="save">
      </pre>
     
     
   </form>

</body>
</html>