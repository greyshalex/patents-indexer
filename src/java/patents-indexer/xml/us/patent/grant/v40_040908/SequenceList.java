//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:06:28 PM EST 
//


package xml.us.patent.grant.v40_040908;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sequence-list")
public class SequenceList {

    @XmlAttribute(name = "country")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "file", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String file;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "carriers")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String carriers;
    @XmlAttribute(name = "seq-file-type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String seqFileType;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
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
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the carriers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarriers() {
        return carriers;
    }

    /**
     * Sets the value of the carriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarriers(String value) {
        this.carriers = value;
    }

    /**
     * Gets the value of the seqFileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqFileType() {
        return seqFileType;
    }

    /**
     * Sets the value of the seqFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqFileType(String value) {
        this.seqFileType = value;
    }

}