
package _1._0._0._127.cwsdlgeneratordocument.syncservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _1._0._0._127.cwsdlgeneratordocument.syncservice package. 
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

    private final static QName _ExitAuthResponse_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "exitAuthResponse");
    private final static QName _Auth_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "auth");
    private final static QName _AuthResponse_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "authResponse");
    private final static QName _GetTestResponse_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "getTestResponse");
    private final static QName _ExitAuth_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "exitAuth");
    private final static QName _GetHelloWorldResponse_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "getHelloWorldResponse");
    private final static QName _GetTest_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "getTest");
    private final static QName _GetHelloWorld_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "getHelloWorld");
    private final static QName _GetHelloWorld2_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "getHelloWorld2");
    private final static QName _GetHelloWorld2Response_QNAME = new QName("http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", "getHelloWorld2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _1._0._0._127.cwsdlgeneratordocument.syncservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExitAuthResponse }
     * 
     */
    public ExitAuthResponse createExitAuthResponse() {
        return new ExitAuthResponse();
    }

    /**
     * Create an instance of {@link Array2X }
     * 
     */
    public Array2X createArray2X() {
        return new Array2X();
    }

    /**
     * Create an instance of {@link GetHelloWorld }
     * 
     */
    public GetHelloWorld createGetHelloWorld() {
        return new GetHelloWorld();
    }

    /**
     * Create an instance of {@link GetHelloWorldResponse }
     * 
     */
    public GetHelloWorldResponse createGetHelloWorldResponse() {
        return new GetHelloWorldResponse();
    }

    /**
     * Create an instance of {@link AuthResponse }
     * 
     */
    public AuthResponse createAuthResponse() {
        return new AuthResponse();
    }

    /**
     * Create an instance of {@link GetHelloWorld2 }
     * 
     */
    public GetHelloWorld2 createGetHelloWorld2() {
        return new GetHelloWorld2();
    }

    /**
     * Create an instance of {@link GetTestResponse }
     * 
     */
    public GetTestResponse createGetTestResponse() {
        return new GetTestResponse();
    }

    /**
     * Create an instance of {@link ExitAuth }
     * 
     */
    public ExitAuth createExitAuth() {
        return new ExitAuth();
    }

    /**
     * Create an instance of {@link GetTest }
     * 
     */
    public GetTest createGetTest() {
        return new GetTest();
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link GetHelloWorld2Response }
     * 
     */
    public GetHelloWorld2Response createGetHelloWorld2Response() {
        return new GetHelloWorld2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "exitAuthResponse")
    public JAXBElement<ExitAuthResponse> createExitAuthResponse(ExitAuthResponse value) {
        return new JAXBElement<ExitAuthResponse>(_ExitAuthResponse_QNAME, ExitAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "auth")
    public JAXBElement<Auth> createAuth(Auth value) {
        return new JAXBElement<Auth>(_Auth_QNAME, Auth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "authResponse")
    public JAXBElement<AuthResponse> createAuthResponse(AuthResponse value) {
        return new JAXBElement<AuthResponse>(_AuthResponse_QNAME, AuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "getTestResponse")
    public JAXBElement<GetTestResponse> createGetTestResponse(GetTestResponse value) {
        return new JAXBElement<GetTestResponse>(_GetTestResponse_QNAME, GetTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitAuth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "exitAuth")
    public JAXBElement<ExitAuth> createExitAuth(ExitAuth value) {
        return new JAXBElement<ExitAuth>(_ExitAuth_QNAME, ExitAuth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "getHelloWorldResponse")
    public JAXBElement<GetHelloWorldResponse> createGetHelloWorldResponse(GetHelloWorldResponse value) {
        return new JAXBElement<GetHelloWorldResponse>(_GetHelloWorldResponse_QNAME, GetHelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "getTest")
    public JAXBElement<GetTest> createGetTest(GetTest value) {
        return new JAXBElement<GetTest>(_GetTest_QNAME, GetTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "getHelloWorld")
    public JAXBElement<GetHelloWorld> createGetHelloWorld(GetHelloWorld value) {
        return new JAXBElement<GetHelloWorld>(_GetHelloWorld_QNAME, GetHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorld2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "getHelloWorld2")
    public JAXBElement<GetHelloWorld2> createGetHelloWorld2(GetHelloWorld2 value) {
        return new JAXBElement<GetHelloWorld2>(_GetHelloWorld2_QNAME, GetHelloWorld2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorld2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1/CWSDLGeneratorDocument/syncService.php", name = "getHelloWorld2Response")
    public JAXBElement<GetHelloWorld2Response> createGetHelloWorld2Response(GetHelloWorld2Response value) {
        return new JAXBElement<GetHelloWorld2Response>(_GetHelloWorld2Response_QNAME, GetHelloWorld2Response.class, null, value);
    }

}
