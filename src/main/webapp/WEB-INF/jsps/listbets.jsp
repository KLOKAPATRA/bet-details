<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
     <table>
        <tr>
          <th>Id</th>
          <th>NumBets</th>
          <th>Game</th>
          <th>Stakes</th>
          <th>Returns</th>
          <th>ClientId</th>
          <th>Date</th>
        <tr>
        
        <c:forEach var="bet" items="${bets }">
        <tr>
        
        <td>${bet.id }</td>
        <td>${bet.numbets }</td>
        <td>${bet.game }</td>
        <td>${bet.stake }</td>
        <td>${bet.returns }</td>
        <td>${bet.clientid }</td>
        <td>${bet.date}</td>
        
         <td>
           <a href="delete?id=${bet.id }">delete</a>
          <a href="update?id=${bet.id }">update</a>
         </td>
         

        </tr>
        
        </c:forEach>
        
     </table>
     
     
</body>
</html>