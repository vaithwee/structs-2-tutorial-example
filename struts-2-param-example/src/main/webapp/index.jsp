<html>
<body>

<h2>Receive By Model</h2>
<form action="/param/receiveModel" method="post">
    Username:<input type="text" name="username" /><br />
    Password:<input type="text" name="password" /><br />
    <input type="submit" value="Login">
</form>

<h2>Receive By Property</h2>
<form action="/param/receiveProperty" method="post">
    Username:<input type="text" name="username" /><br />
    Password:<input type="text" name="password" /><br />
    <input type="submit" value="Login">
</form>

<h2>Receive By Name</h2>
<form action="/param/receiveName" method="post">
    Username:<input type="text" name="user.username" /><br />
    Password:<input type="text" name="user.password" /><br />
    <input type="submit" value="Login">
</form>
</body>
</html>
