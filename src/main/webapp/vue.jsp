<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Insert Title Here</title>
</head>
<%
    String nbLig = request.getParameter("nbLig");
    String nbCol = request.getParameter("nbCol");
    int nbLigInt = Integer.parseInt(nbLig);
    int nbColInt = Integer.parseInt(nbCol);
%>
<body>

<div class="grid">
    <table>
        <% for (int i = 0; i < (nbLigInt); i++) {%>
        <tr>
            <% for (int j = 0; j < (nbColInt); j++) {%>
            <td> JSP ELEMENT</td>
            <% } %>
        </tr>
        <% } %>
    </table>
</div>
</body>
<style>
    table {
        border-collapse: collapse;
    }

    table, td, th {
        border: 1px solid black;
    }

    td {
        padding: 0.5rem;
    }
</style>
</html>