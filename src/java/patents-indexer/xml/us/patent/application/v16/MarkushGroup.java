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
    "markushItem"
})
@XmlRootElement(name = "markush-group")
public class MarkushGroup {

    @XmlElement(name = "markush-item", required = true)
    protected List<MarkushItem> markushItem;

    /**
     * Gets the value of the markushItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markushItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkushItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkushItem }
     * 
     * 
     */
    public List<MarkushItem> getMarkushItem() {
        if (markushItem == null) {
            markushItem = new ArrayList<MarkushItem>();
        }
        return this.markushItem;
    }

}