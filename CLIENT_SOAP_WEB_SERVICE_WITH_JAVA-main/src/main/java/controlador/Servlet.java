package controlador;

import clientews.ServicioEncuesta;
import clientews.ServicioEncuestaImplService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Importacion del objeto cliente de nuestro ws.
        ServicioEncuesta servicioEncuesta = new ServicioEncuestaImplService().getServicioEncuestaImplPort();
        // Esta parte solo aplica al else de nuestro if, especifica el tipo de 
        // respuesta que retornaremos.
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();        
        // Obtencion de los valores enviados por formulario.
        String usuario = request.getParameter("usuario");
        String passwd = request.getParameter("passwd");

        if (servicioEncuesta.validarCredenciales(usuario, passwd) == 1) {
            // Agregando varibales al alcance de request.
            request.setAttribute("usuario", usuario);
            request.setAttribute("passwd", passwd);
            
            //4.- Redireccionar a la vista seleccionada
            RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");        
            
            rd.forward(request, response);
        }else{
            out.print("<html>");
            out.print("<head> <title> ejemplo </title> </head>");
            out.print("<body> <h1>Acceso denegado</h1> </body>");
            out.print("</html>");
            out.close();
        }                   
    }
}
