
package org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetKaraKutu_ServiseHazirAracMetrobus_XMLResult" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;any/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getKaraKutuServiseHazirAracMetrobusXMLResult"
})
@XmlRootElement(name = "GetKaraKutu_ServiseHazirAracMetrobus_XMLResponse")
public class GetKaraKutuServiseHazirAracMetrobusXMLResponse {

    @XmlElement(name = "GetKaraKutu_ServiseHazirAracMetrobus_XMLResult")
    protected GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult getKaraKutuServiseHazirAracMetrobusXMLResult;

    /**
     * Gets the value of the getKaraKutuServiseHazirAracMetrobusXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult }
     *     
     */
    public GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult getGetKaraKutuServiseHazirAracMetrobusXMLResult() {
        return getKaraKutuServiseHazirAracMetrobusXMLResult;
    }

    /**
     * Sets the value of the getKaraKutuServiseHazirAracMetrobusXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult }
     *     
     */
    public void setGetKaraKutuServiseHazirAracMetrobusXMLResult(GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult value) {
        this.getKaraKutuServiseHazirAracMetrobusXMLResult = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;any/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class GetKaraKutuServiseHazirAracMetrobusXMLResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
