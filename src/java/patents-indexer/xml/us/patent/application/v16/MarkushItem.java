//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

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
    "claimText"
})
@XmlRootElement(name = "markush-item")
public class MarkushItem {

    @XmlElement(name = "claim-text", required = true)
    protected ClaimText claimText;

    /**
     * Gets the value of the claimText property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimText }
     *     
     */
    public ClaimText getClaimText() {
        return claimText;
    }

    /**
     * Sets the value of the claimText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimText }
     *     
     */
    public void setClaimText(ClaimText value) {
        this.claimText = value;
    }

}