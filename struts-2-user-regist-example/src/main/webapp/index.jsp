<html>
<body>
<h2>Register</h2>
<form method="post" action="/user/register">
    Username:<input type="text" name="username" /><br />
    Password:<input type="password" name="password" /><br />
    Birthday:<input type="date" name="birthday" /><br />
    Hobby:
    <input type="checkbox" name="hobby" value="Football" />Football
    <input type="checkbox" name="hobby" value="Basketball" />Basketball
    <input type="checkbox" name="hobby" value="Watch TV" />Watch TV<br />
    Married:<input type="checkbox" name="married" value="true" />Yes
    <input type="checkbox" name="married" value="false" />No<br />
    <input type="submit" value="Register"/>
</form>
</body>
</html>
