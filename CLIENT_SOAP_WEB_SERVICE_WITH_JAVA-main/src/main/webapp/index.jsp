<!DOCTYPE html>
<html lang='es'>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Enlace con la hoja de estilos.-->
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
        <!-- Los datos de este formulario son llevados un Servlet a traves del 
             metodo POST-->    
        <form name="form1" action="/ClientSoap-1.0/login" method="POST" class="login-form">
            <h2 class="titurlo"> Inicia sesion </h2>
            <input type="text" name="usuario" placeholder="usuario" required>            
            <input type="password" name="passwd" placeholder="contraenia" required>            
            <input type="submit" value="Login">                
        </form>
        </div>
    </body>
</html>