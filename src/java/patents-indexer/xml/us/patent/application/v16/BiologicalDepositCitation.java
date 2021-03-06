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
    "depositoryName",
    "depositAccessionNumber"
})
@XmlRootElement(name = "biological-deposit-citation")
public class BiologicalDepositCitation {

    @XmlElement(name = "depository-name", required = true)
    protected String depositoryName;
    @XmlElement(name = "deposit-accession-number", required = true)
    protected DepositAccessionNumber depositAccessionNumber;

    /**
     * Gets the value of the depositoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositoryName() {
        return depositoryName;
    }

    /**
     * Sets the value of the depositoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositoryName(String value) {
        this.depositoryName = value;
    }

    /**
     * Gets the value of the depositAccessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DepositAccessionNumber }
     *     
     */
    public DepositAccessionNumber getDepositAccessionNumber() {
        return depositAccessionNumber;
    }

    /**
     * Sets the value of the depositAccessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositAccessionNumber }
     *     
     */
    public void setDepositAccessionNumber(DepositAccessionNumber value) {
        this.depositAccessionNumber = value;
    }

}
