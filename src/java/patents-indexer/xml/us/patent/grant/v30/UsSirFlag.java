//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:43 PM EST 
//


package xml.us.patent.grant.v30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "us-sir-flag")
public class UsSirFlag {

    @XmlAttribute(name = "sir-text")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sirText;

    /**
     * Gets the value of the sirText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSirText() {
        if (sirText == null) {
            return "A statutory invention registration is not a patent. It has the defensive attributes of a patent but does not have the enforceable attributes of a patent. No article or advertisement or the like may use the term patent, or any term suggestive of a patent, when referring to a statutory invention registration. For more specific information on the rights associated with a statutory invention registration see 35 U.S.C.157.";
        } else {
            return sirText;
        }
    }

    /**
     * Sets the value of the sirText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSirText(String value) {
        this.sirText = value;
    }

}
