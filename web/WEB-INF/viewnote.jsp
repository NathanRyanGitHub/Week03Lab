
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <header>
            <h1>Simple Note Keeper</h1>
        </header>
        <h2>View Note</h2>
        
        <!-- Display the title and contents of the note here -->
        <p>Title: ${note.title}</p>
        <p>Contents: 
            <br>${note.contents}</p>        
        <a href="note?edit" alt="Edit Note">Edit</a>
        
    </body>
</html>
