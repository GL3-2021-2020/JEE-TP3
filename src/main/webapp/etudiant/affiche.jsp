<%@ page import="web.etudiant.Etudiant" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>cin</th>
        <th>prenom<</th>
        <th>nom</th>
    </tr>
    <%
        ArrayList<Etudiant> list = (ArrayList<Etudiant>) request.getAttribute("data");
        for (Etudiant it : list) {%>

    <tr>
        <td><%=it.cin%>
        </td>
        <td><%=it.name%>
        </td>
        <td><%=it.lastName%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
