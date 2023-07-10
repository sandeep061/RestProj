 
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
  <frm:form action="register" method="POST" modelAttribute="to" >
    <table align="center">
    <tr>
     <td>Tourist  name:</td>
     <td> <frm:input type="text" path="name" /></td>
    </tr>
    <tr>
      <td>Tourist  Add:</td>
     <td> <frm:input type="text" path="city" /></td>
    </tr>
    <tr>
      <td>Tourist  PAckageType:</td>
      <td><frm:input type="text" path="packageType" /></td>
    </tr>
     <tr>
      <td>Tourist  budge:</td>
     <td> <frm:input type="text" path="budget" /></td>
    </tr>
    <tr>
    <td>
    <input type="submit" value="Register">
    <td>
    </tr>
    </table>
  
  </frm:form>