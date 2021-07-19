
package com.training;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherServiceImpl", targetNamespace = "http://services.training.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWeather", targetNamespace = "http://services.training.com/", className = "com.training.GetWeather")
    @ResponseWrapper(localName = "getWeatherResponse", targetNamespace = "http://services.training.com/", className = "com.training.GetWeatherResponse")
    @Action(input = "http://services.training.com/WeatherServiceImpl/getWeatherRequest", output = "http://services.training.com/WeatherServiceImpl/getWeatherResponse")
    public String getWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}