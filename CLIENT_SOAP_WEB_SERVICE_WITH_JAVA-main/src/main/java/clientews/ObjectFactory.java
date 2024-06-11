
package clientews;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AplicarEncuesta_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "aplicarEncuesta");
    private final static QName _AplicarEncuestaResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "aplicarEncuestaResponse");
    private final static QName _MostrarNivelesDeSatisfaccion_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "mostrarNivelesDeSatisfaccion");
    private final static QName _RegistrarUsuario_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "registrarUsuario");
    private final static QName _RegistrarUsuarioResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "registrarUsuarioResponse");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "eliminarUsuarioResponse");
    private final static QName _AcualizarUsuario_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "acualizarUsuario");
    private final static QName _EliminarUsuario_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "eliminarUsuario");
    private final static QName _AcualizarUsuarioResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "acualizarUsuarioResponse");
    private final static QName _MostrarNivelesDeSatisfaccionResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "mostrarNivelesDeSatisfaccionResponse");
    private final static QName _ValidarCredencialesResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "validarCredencialesResponse");
    private final static QName _ListarUsuarios_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "listarUsuarios");
    private final static QName _ValidarCredenciales_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "validarCredenciales");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("http://servicios.sistemasatisfaccionws.lynx.com/", "listarUsuariosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AplicarEncuesta }
     * 
     */
    public AplicarEncuesta createAplicarEncuesta() {
        return new AplicarEncuesta();
    }

    /**
     * Create an instance of {@link AplicarEncuestaResponse }
     * 
     */
    public AplicarEncuestaResponse createAplicarEncuestaResponse() {
        return new AplicarEncuestaResponse();
    }

    /**
     * Create an instance of {@link MostrarNivelesDeSatisfaccion }
     * 
     */
    public MostrarNivelesDeSatisfaccion createMostrarNivelesDeSatisfaccion() {
        return new MostrarNivelesDeSatisfaccion();
    }

    /**
     * Create an instance of {@link RegistrarUsuario }
     * 
     */
    public RegistrarUsuario createRegistrarUsuario() {
        return new RegistrarUsuario();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioResponse }
     * 
     */
    public RegistrarUsuarioResponse createRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link AcualizarUsuario }
     * 
     */
    public AcualizarUsuario createAcualizarUsuario() {
        return new AcualizarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link AcualizarUsuarioResponse }
     * 
     */
    public AcualizarUsuarioResponse createAcualizarUsuarioResponse() {
        return new AcualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link MostrarNivelesDeSatisfaccionResponse }
     * 
     */
    public MostrarNivelesDeSatisfaccionResponse createMostrarNivelesDeSatisfaccionResponse() {
        return new MostrarNivelesDeSatisfaccionResponse();
    }

    /**
     * Create an instance of {@link ValidarCredencialesResponse }
     * 
     */
    public ValidarCredencialesResponse createValidarCredencialesResponse() {
        return new ValidarCredencialesResponse();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link ValidarCredenciales }
     * 
     */
    public ValidarCredenciales createValidarCredenciales() {
        return new ValidarCredenciales();
    }

    /**
     * Create an instance of {@link UsuarioDTO }
     * 
     */
    public UsuarioDTO createUsuarioDTO() {
        return new UsuarioDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarEncuesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "aplicarEncuesta")
    public JAXBElement<AplicarEncuesta> createAplicarEncuesta(AplicarEncuesta value) {
        return new JAXBElement<AplicarEncuesta>(_AplicarEncuesta_QNAME, AplicarEncuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarEncuestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "aplicarEncuestaResponse")
    public JAXBElement<AplicarEncuestaResponse> createAplicarEncuestaResponse(AplicarEncuestaResponse value) {
        return new JAXBElement<AplicarEncuestaResponse>(_AplicarEncuestaResponse_QNAME, AplicarEncuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarNivelesDeSatisfaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "mostrarNivelesDeSatisfaccion")
    public JAXBElement<MostrarNivelesDeSatisfaccion> createMostrarNivelesDeSatisfaccion(MostrarNivelesDeSatisfaccion value) {
        return new JAXBElement<MostrarNivelesDeSatisfaccion>(_MostrarNivelesDeSatisfaccion_QNAME, MostrarNivelesDeSatisfaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "registrarUsuario")
    public JAXBElement<RegistrarUsuario> createRegistrarUsuario(RegistrarUsuario value) {
        return new JAXBElement<RegistrarUsuario>(_RegistrarUsuario_QNAME, RegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "registrarUsuarioResponse")
    public JAXBElement<RegistrarUsuarioResponse> createRegistrarUsuarioResponse(RegistrarUsuarioResponse value) {
        return new JAXBElement<RegistrarUsuarioResponse>(_RegistrarUsuarioResponse_QNAME, RegistrarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcualizarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "acualizarUsuario")
    public JAXBElement<AcualizarUsuario> createAcualizarUsuario(AcualizarUsuario value) {
        return new JAXBElement<AcualizarUsuario>(_AcualizarUsuario_QNAME, AcualizarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcualizarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "acualizarUsuarioResponse")
    public JAXBElement<AcualizarUsuarioResponse> createAcualizarUsuarioResponse(AcualizarUsuarioResponse value) {
        return new JAXBElement<AcualizarUsuarioResponse>(_AcualizarUsuarioResponse_QNAME, AcualizarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarNivelesDeSatisfaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "mostrarNivelesDeSatisfaccionResponse")
    public JAXBElement<MostrarNivelesDeSatisfaccionResponse> createMostrarNivelesDeSatisfaccionResponse(MostrarNivelesDeSatisfaccionResponse value) {
        return new JAXBElement<MostrarNivelesDeSatisfaccionResponse>(_MostrarNivelesDeSatisfaccionResponse_QNAME, MostrarNivelesDeSatisfaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCredencialesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "validarCredencialesResponse")
    public JAXBElement<ValidarCredencialesResponse> createValidarCredencialesResponse(ValidarCredencialesResponse value) {
        return new JAXBElement<ValidarCredencialesResponse>(_ValidarCredencialesResponse_QNAME, ValidarCredencialesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCredenciales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "validarCredenciales")
    public JAXBElement<ValidarCredenciales> createValidarCredenciales(ValidarCredenciales value) {
        return new JAXBElement<ValidarCredenciales>(_ValidarCredenciales_QNAME, ValidarCredenciales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.sistemasatisfaccionws.lynx.com/", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
    }

}
