<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Athlete</title>
</head>
<body style="text-align: center; align-items: center;">
    <form method="POST">
        <table align="center" border="2">
            <tr>
                <th colspan="2">ATHLETE REGISTRATION FORM</th>
            </tr>
            <tr>
                <td>Athlete Name</td>
                <td><input @required maxlength="40" pattern="[A-Z][A-Z|a-z]*" name="name" type="text" title="The name must start with a CAPITAL LETTER e.g. Kashish" placeholder="First letter Captial"/></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>
                    <input required type="radio" name="gender" value="Male"/>Male
                    <input type="radio" name="gender" value="Female"/>Female
                </td>
            </tr>
            <tr>
                <td>Category</td>
                <td>
                    <select name="category">
                        <option value="Running">Running</option>
                        <option value="High Jump">High Jump</option>
                        <option value="Hurdles">Hurdles</option>
                        <option value="Relay">Relay</option>
                        <option value="Javelin Throw">Javelin Throw</option>
                        <option value="Shot put">Shot put</option>     
                    </select>
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <input @required type="email" name="email" placeholder="Enter a valid email"/>
                </td>
            </tr>
            <tr>
                <td>Mobile</td>
                <td>
                    <input type="tel" name="mobile" placeholder="Enter a valid mobile"/>
                </td>
            </tr>
            <tr>
                <td>
                     <button type="submit" formaction="addFormTag">ADD</button>
					 <button type="submit" formaction="welcome">CANCEL</button>
                </td>
                <td>
                    <a href="home">Home</a>
                </td>
            </tr>
        </table>
 </form>
    

</body>
</html>