//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:43 PM EST 
//


package xml.us.patent.grant.v30;

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
    "bulletinGazette",
    "claimsOnlyAvailable",
    "laidOpenToPublic",
    "examinedWithoutGrant",
    "invalidationOfPatent",
    "printedAsAmended",
    "unexaminedNoGrant",
    "unexaminedWithoutGrant"
})
@XmlRootElement(name = "dates-of-public-availability")
public class DatesOfPublicAvailability {

    @XmlElement(name = "bulletin-gazette")
    protected BulletinGazette bulletinGazette;
    @XmlElement(name = "claims-only-available")
    protected ClaimsOnlyAvailable claimsOnlyAvailable;
    @XmlElement(name = "laid-open-to-public")
    protected LaidOpenToPublic laidOpenToPublic;
    @XmlElement(name = "examined-without-grant")
    protected ExaminedWithoutGrant examinedWithoutGrant;
    @XmlElement(name = "invalidation-of-patent")
    protected InvalidationOfPatent invalidationOfPatent;
    @XmlElement(name = "printed-as-amended")
    protected PrintedAsAmended printedAsAmended;
    @XmlElement(name = "unexamined-no-grant")
    protected UnexaminedNoGrant unexaminedNoGrant;
    @XmlElement(name = "unexamined-without-grant")
    protected UnexaminedWithoutGrant unexaminedWithoutGrant;

    /**
     * Gets the value of the bulletinGazette property.
     * 
     * @return
     *     possible object is
     *     {@link BulletinGazette }
     *     
     */
    public BulletinGazette getBulletinGazette() {
        return bulletinGazette;
    }

    /**
     * Sets the value of the bulletinGazette property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletinGazette }
     *     
     */
    public void setBulletinGazette(BulletinGazette value) {
        this.bulletinGazette = value;
    }

    /**
     * Gets the value of the claimsOnlyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsOnlyAvailable }
     *     
     */
    public ClaimsOnlyAvailable getClaimsOnlyAvailable() {
        return claimsOnlyAvailable;
    }

    /**
     * Sets the value of the claimsOnlyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsOnlyAvailable }
     *     
     */
    public void setClaimsOnlyAvailable(ClaimsOnlyAvailable value) {
        this.claimsOnlyAvailable = value;
    }

    /**
     * Gets the value of the laidOpenToPublic property.
     * 
     * @return
     *     possible object is
     *     {@link LaidOpenToPublic }
     *     
     */
    public LaidOpenToPublic getLaidOpenToPublic() {
        return laidOpenToPublic;
    }

    /**
     * Sets the value of the laidOpenToPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaidOpenToPublic }
     *     
     */
    public void setLaidOpenToPublic(LaidOpenToPublic value) {
        this.laidOpenToPublic = value;
    }

    /**
     * Gets the value of the examinedWithoutGrant property.
     * 
     * @return
     *     possible object is
     *     {@link ExaminedWithoutGrant }
     *     
     */
    public ExaminedWithoutGrant getExaminedWithoutGrant() {
        return examinedWithoutGrant;
    }

    /**
     * Sets the value of the examinedWithoutGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminedWithoutGrant }
     *     
     */
    public void setExaminedWithoutGrant(ExaminedWithoutGrant value) {
        this.examinedWithoutGrant = value;
    }

    /**
     * Gets the value of the invalidationOfPatent property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidationOfPatent }
     *     
     */
    public InvalidationOfPatent getInvalidationOfPatent() {
        return invalidationOfPatent;
    }

    /**
     * Sets the value of the invalidationOfPatent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidationOfPatent }
     *     
     */
    public void setInvalidationOfPatent(InvalidationOfPatent value) {
        this.invalidationOfPatent = value;
    }

    /**
     * Gets the value of the printedAsAmended property.
     * 
     * @return
     *     possible object is
     *     {@link PrintedAsAmended }
     *     
     */
    public PrintedAsAmended getPrintedAsAmended() {
        return printedAsAmended;
    }

    /**
     * Sets the value of the printedAsAmended property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintedAsAmended }
     *     
     */
    public void setPrintedAsAmended(PrintedAsAmended value) {
        this.printedAsAmended = value;
    }

    /**
     * Gets the value of the unexaminedNoGrant property.
     * 
     * @return
     *     possible object is
     *     {@link UnexaminedNoGrant }
     *     
     */
    public UnexaminedNoGrant getUnexaminedNoGrant() {
        return unexaminedNoGrant;
    }

    /**
     * Sets the value of the unexaminedNoGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnexaminedNoGrant }
     *     
     */
    public void setUnexaminedNoGrant(UnexaminedNoGrant value) {
        this.unexaminedNoGrant = value;
    }

    /**
     * Gets the value of the unexaminedWithoutGrant property.
     * 
     * @return
     *     possible object is
     *     {@link UnexaminedWithoutGrant }
     *     
     */
    public UnexaminedWithoutGrant getUnexaminedWithoutGrant() {
        return unexaminedWithoutGrant;
    }

    /**
     * Sets the value of the unexaminedWithoutGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnexaminedWithoutGrant }
     *     
     */
    public void setUnexaminedWithoutGrant(UnexaminedWithoutGrant value) {
        this.unexaminedWithoutGrant = value;
    }

}
