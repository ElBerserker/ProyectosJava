
package controlador;

import clientews.ServicioEncuesta;
import clientews.ServicioEncuestaImplService;


public class Test {
    public static void main(String args[]){
    ServicioEncuesta servicioEncuesta = new ServicioEncuestaImplService().getServicioEncuestaImplPort();
    int acceso = servicioEncuesta.validarCredenciales("UsrWeb","passwd");
    System.out.print("Resultado: " + acceso);
    }
}
