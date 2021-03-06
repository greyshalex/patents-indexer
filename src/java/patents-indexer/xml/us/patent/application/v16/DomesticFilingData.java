//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationNumber",
    "applicationNumberSeriesCode",
    "filingDate",
    "continuedProsecutionApplication",
    "rule47Flag"
})
@XmlRootElement(name = "domestic-filing-data")
public class DomesticFilingData {

    @XmlAttribute(name = "st32-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String st32Name;
    @XmlAttribute(name = "inid-code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inidCode;
    @XmlElement(name = "application-number", required = true)
    protected ApplicationNumber applicationNumber;
    @XmlElement(name = "application-number-series-code", required = true)
    protected ApplicationNumberSeriesCode applicationNumberSeriesCode;
    @XmlElement(name = "filing-date", required = true)
    protected FilingDate filingDate;
    @XmlElement(name = "continued-prosecution-application")
    protected ContinuedProsecutionApplication continuedProsecutionApplication;
    @XmlElement(name = "rule-47-flag")
    protected Rule47Flag rule47Flag;

    /**
     * Gets the value of the st32Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt32Name() {
        if (st32Name == null) {
            return "B200";
        } else {
            return st32Name;
        }
    }

    /**
     * Sets the value of the st32Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt32Name(String value) {
        this.st32Name = value;
    }

    /**
     * Gets the value of the inidCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInidCode() {
        return inidCode;
    }

    /**
     * Sets the value of the inidCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInidCode(String value) {
        this.inidCode = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationNumber }
     *     
     */
    public ApplicationNumber getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationNumber }
     *     
     */
    public void setApplicationNumber(ApplicationNumber value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the applicationNumberSeriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationNumberSeriesCode }
     *     
     */
    public ApplicationNumberSeriesCode getApplicationNumberSeriesCode() {
        return applicationNumberSeriesCode;
    }

    /**
     * Sets the value of the applicationNumberSeriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationNumberSeriesCode }
     *     
     */
    public void setApplicationNumberSeriesCode(ApplicationNumberSeriesCode value) {
        this.applicationNumberSeriesCode = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link FilingDate }
     *     
     */
    public FilingDate getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingDate }
     *     
     */
    public void setFilingDate(FilingDate value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the continuedProsecutionApplication property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuedProsecutionApplication }
     *     
     */
    public ContinuedProsecutionApplication getContinuedProsecutionApplication() {
        return continuedProsecutionApplication;
    }

    /**
     * Sets the value of the continuedProsecutionApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuedProsecutionApplication }
     *     
     */
    public void setContinuedProsecutionApplication(ContinuedProsecutionApplication value) {
        this.continuedProsecutionApplication = value;
    }

    /**
     * Gets the value of the rule47Flag property.
     * 
     * @return
     *     possible object is
     *     {@link Rule47Flag }
     *     
     */
    public Rule47Flag getRule47Flag() {
        return rule47Flag;
    }

    /**
     * Sets the value of the rule47Flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rule47Flag }
     *     
     */
    public void setRule47Flag(Rule47Flag value) {
        this.rule47Flag = value;
    }

}
