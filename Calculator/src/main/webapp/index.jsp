<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/9/2021
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style type="text/css">
          .login {
              height: 180px; width: 230px;
              margin: 0;
              padding: 10px;
              border: 1px #CCC solid;
          }
          .login input {
              padding: 5px;
              margin: 5px;
          }
      </style>
  </head>
  <body>
  <form action="CalculatorOperand.jsp" method="post">
  <h1>Simple Calculator</h1>
 <div class="login" >
     <label>Calculator</label><br>
     <label >First openrand: </label><br>
     <input type="text" name="txtFirst" placeholder="First Operand"/>
     <label>Operator :</label><br>
     <select name="cboption">
         <option>+</option>
         <option> -</option>
         <option>*</option>
         <option>/</option>
     </select><br>
     <label>Second operand</label> <br>
     <input type="text" name="txtSecound" placeholder="Secound Operand"> <br>
     <input type="submit" id="submit" value="Calculate">


 </div>
  </form>
  </body>
</html>
