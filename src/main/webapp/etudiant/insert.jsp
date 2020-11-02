<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Insert etudiant</title>
</head>

<body>
<form action="etudiantapi" method="post">
    <label for="Cin">cin</label>
    <input id="Cin" type="text" name="cin">
    <br>
    <label for="Name">Nom</label>
    <input id="Name" type="text" name="name">
    <br>
    <label for="LastName">Prenom</label>
    <input id="LastName" type="text" name="lastName">
    <br>
    <button type="submit">ajouter etudiant</button>
</form>
</body>
</html>