
package _1._0._0._127.cwsdlgeneratordocument.syncservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="obj2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTest", propOrder = {
    "obj",
    "obj2"
})
public class GetTest {

    @XmlElement(required = true)
    protected String obj;
    @XmlElement(required = true)
    protected String obj2;

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObj(String value) {
        this.obj = value;
    }

    /**
     * Gets the value of the obj2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObj2() {
        return obj2;
    }

    /**
     * Sets the value of the obj2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObj2(String value) {
        this.obj2 = value;
    }

}
