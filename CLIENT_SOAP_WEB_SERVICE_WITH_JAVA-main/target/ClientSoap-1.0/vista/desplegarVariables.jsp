<!DOCTYPE html>
<html lang='es'>
    <head>
        <title>Menu</title>
        <!-- Por compatibilidad con antiguos navegadores-->
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link rel="stylesheet" href="css/menu.css"/>
    </head>
    <body>
        <div class='container'>
            <header class="header">                       
                <h1 class='titulo'>Menu</h1>
                <a class="a-close-session" href="${pageContext.request.contextPath}/index.jsp" class="cerrar_session">Cerrar session</a>
            </header>
           	 
            <nav class="nav"> 
            
            </nav>
            
            <main class="main">
                <section class="section"> </section>
					 <aside class="aside"> <h1>${usuario}</h1> </aside>
            </main>    
            
            <footer class="footer">
                
            </footer>
        </div>
    </body>
</html>
