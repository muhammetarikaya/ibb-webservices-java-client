
package org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PlanlananSeferSaatiSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PlanlananSeferSaatiSoap {


    /**
     * 
     * @param hatKodu
     * @return
     *     returns org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.GetPlanlananSeferSaatiXMLResponse.GetPlanlananSeferSaatiXMLResult
     */
    @WebMethod(operationName = "GetPlanlananSeferSaati_XML", action = "http://tempuri.org/GetPlanlananSeferSaati_XML")
    @WebResult(name = "GetPlanlananSeferSaati_XMLResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPlanlananSeferSaati_XML", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.GetPlanlananSeferSaatiXML")
    @ResponseWrapper(localName = "GetPlanlananSeferSaati_XMLResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.GetPlanlananSeferSaatiXMLResponse")
    public org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.GetPlanlananSeferSaatiXMLResponse.GetPlanlananSeferSaatiXMLResult getPlanlananSeferSaatiXML(
        @WebParam(name = "HatKodu", targetNamespace = "http://tempuri.org/")
        String hatKodu);

    /**
     * 
     * @param hatKodu
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPlanlananSeferSaati_json", action = "http://tempuri.org/GetPlanlananSeferSaati_json")
    @WebResult(name = "GetPlanlananSeferSaati_jsonResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPlanlananSeferSaati_json", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.GetPlanlananSeferSaatiJson")
    @ResponseWrapper(localName = "GetPlanlananSeferSaati_jsonResponse", targetNamespace = "http://tempuri.org/", className = "org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.GetPlanlananSeferSaatiJsonResponse")
    public String getPlanlananSeferSaatiJson(
        @WebParam(name = "HatKodu", targetNamespace = "http://tempuri.org/")
        String hatKodu);

}
