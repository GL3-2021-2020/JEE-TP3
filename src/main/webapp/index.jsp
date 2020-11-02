<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>dynamic table</title>
  </head>
  <body>
    <form action="./vue.jsp" method="post">
      <div>
        <label for="nbLig">Number of lines:</label>
        <input id="nbLig" type="number" name="nbLig" />
      </div>
      <div>
        <label for="nbCol">Number of Cols:</label>
        <input id="nbCol" type="number" name="nbCol" />
      </div>
      <input type="submit" value="submit" />
    </form>
  </body>
</html>
