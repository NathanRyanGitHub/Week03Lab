
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <header>
            <h1>Simple Note Keeper</h1>
        </header>
        <h2>Edit Note</h2>
        
        <form method="POST" action="note">
            <label>Title: </label>
            <br>
            <input type="text" name="title" value="">
            <br>
            <br>
            <label>Contents: </label>
            <br>
            <textarea rows="5" cols="16" name="contents" value=""></textarea>
            <br>
            <br>
            <input type="submit" name="submit" value="Save">
        </form>
    </body>
</html>
