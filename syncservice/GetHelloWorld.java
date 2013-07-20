
package _1._0._0._127.cwsdlgeneratordocument.syncservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHelloWorld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHelloWorld">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Array2X" type="{http://127.0.0.1/CWSDLGeneratorDocument/syncService.php}Array2X"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHelloWorld", propOrder = {
    "array2X"
})
public class GetHelloWorld {

    @XmlElement(name = "Array2X", required = true)
    protected Array2X array2X;

    /**
     * Gets the value of the array2X property.
     * 
     * @return
     *     possible object is
     *     {@link Array2X }
     *     
     */
    public Array2X getArray2X() {
        return array2X;
    }

    /**
     * Sets the value of the array2X property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array2X }
     *     
     */
    public void setArray2X(Array2X value) {
        this.array2X = value;
    }

}
