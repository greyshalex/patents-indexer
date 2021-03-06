//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "s1",
    "s2"
})
@XmlRootElement(name = "sequence-list-old-rules")
public class SequenceListOldRules {

    @XmlElement(name = "s-1", required = true)
    protected S1 s1;
    @XmlElement(name = "s-2", required = true)
    protected List<S2> s2;

    /**
     * Gets the value of the s1 property.
     * 
     * @return
     *     possible object is
     *     {@link S1 }
     *     
     */
    public S1 getS1() {
        return s1;
    }

    /**
     * Sets the value of the s1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1 }
     *     
     */
    public void setS1(S1 value) {
        this.s1 = value;
    }

    /**
     * Gets the value of the s2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S2 }
     * 
     * 
     */
    public List<S2> getS2() {
        if (s2 == null) {
            s2 = new ArrayList<S2>();
        }
        return this.s2;
    }

}
