//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 05:13:01 PM EST 
//


package xml.us.patent.grant.vST32_025xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pdat"
})
@XmlRootElement(name = "SDOCR")
public class SDOCR {

    @XmlAttribute(name = "LA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String la;
    @XmlAttribute(name = "CY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cy;
    @XmlAttribute(name = "STATUS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlElement(name = "PDAT", required = true)
    protected PDAT pdat;

    /**
     * Gets the value of the la property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLA() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLA(String value) {
        this.la = value;
    }

    /**
     * Gets the value of the cy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCY() {
        return cy;
    }

    /**
     * Sets the value of the cy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCY(String value) {
        this.cy = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the pdat property.
     * 
     * @return
     *     possible object is
     *     {@link PDAT }
     *     
     */
    public PDAT getPDAT() {
        return pdat;
    }

    /**
     * Sets the value of the pdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDAT }
     *     
     */
    public void setPDAT(PDAT value) {
        this.pdat = value;
    }

}
