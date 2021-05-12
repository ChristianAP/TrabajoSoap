
package upeu.edu.pe.casos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the upeu.edu.pe.casos package. 
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

    private final static QName _SueldoResponse_QNAME = new QName("http://casos.pe.edu.upeu/", "sueldoResponse");
    private final static QName _Sueldo_QNAME = new QName("http://casos.pe.edu.upeu/", "sueldo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: upeu.edu.pe.casos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SueldoResponse }
     * 
     */
    public SueldoResponse createSueldoResponse() {
        return new SueldoResponse();
    }

    /**
     * Create an instance of {@link Sueldo }
     * 
     */
    public Sueldo createSueldo() {
        return new Sueldo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SueldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://casos.pe.edu.upeu/", name = "sueldoResponse")
    public JAXBElement<SueldoResponse> createSueldoResponse(SueldoResponse value) {
        return new JAXBElement<SueldoResponse>(_SueldoResponse_QNAME, SueldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sueldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://casos.pe.edu.upeu/", name = "sueldo")
    public JAXBElement<Sueldo> createSueldo(Sueldo value) {
        return new JAXBElement<Sueldo>(_Sueldo_QNAME, Sueldo.class, null, value);
    }

}
