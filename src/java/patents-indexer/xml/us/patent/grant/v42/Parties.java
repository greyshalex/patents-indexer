//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:02:26 PM EST 
//


package xml.us.patent.grant.v42;

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
    "applicants",
    "inventors",
    "correspondenceAddress",
    "agents"
})
@XmlRootElement(name = "parties")
public class Parties {

    @XmlElement(required = true)
    protected Applicants applicants;
    protected Inventors inventors;
    @XmlElement(name = "correspondence-address")
    protected CorrespondenceAddress correspondenceAddress;
    protected Agents agents;

    /**
     * Gets the value of the applicants property.
     * 
     * @return
     *     possible object is
     *     {@link Applicants }
     *     
     */
    public Applicants getApplicants() {
        return applicants;
    }

    /**
     * Sets the value of the applicants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Applicants }
     *     
     */
    public void setApplicants(Applicants value) {
        this.applicants = value;
    }

    /**
     * Gets the value of the inventors property.
     * 
     * @return
     *     possible object is
     *     {@link Inventors }
     *     
     */
    public Inventors getInventors() {
        return inventors;
    }

    /**
     * Sets the value of the inventors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventors }
     *     
     */
    public void setInventors(Inventors value) {
        this.inventors = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceAddress }
     *     
     */
    public CorrespondenceAddress getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceAddress }
     *     
     */
    public void setCorrespondenceAddress(CorrespondenceAddress value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the agents property.
     * 
     * @return
     *     possible object is
     *     {@link Agents }
     *     
     */
    public Agents getAgents() {
        return agents;
    }

    /**
     * Sets the value of the agents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agents }
     *     
     */
    public void setAgents(Agents value) {
        this.agents = value;
    }

}
