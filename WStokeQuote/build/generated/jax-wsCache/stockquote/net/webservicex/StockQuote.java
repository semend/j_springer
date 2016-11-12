
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StockQuote", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.com/stockquote.asmx?WSDL")
public class StockQuote
    extends Service
{

    private final static URL STOCKQUOTE_WSDL_LOCATION;
    private final static WebServiceException STOCKQUOTE_EXCEPTION;
    private final static QName STOCKQUOTE_QNAME = new QName("http://www.webserviceX.NET/", "StockQuote");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.com/stockquote.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STOCKQUOTE_WSDL_LOCATION = url;
        STOCKQUOTE_EXCEPTION = e;
    }

    public StockQuote() {
        super(__getWsdlLocation(), STOCKQUOTE_QNAME);
    }

    public StockQuote(WebServiceFeature... features) {
        super(__getWsdlLocation(), STOCKQUOTE_QNAME, features);
    }

    public StockQuote(URL wsdlLocation) {
        super(wsdlLocation, STOCKQUOTE_QNAME);
    }

    public StockQuote(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STOCKQUOTE_QNAME, features);
    }

    public StockQuote(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StockQuote(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StockQuoteSoap
     */
    @WebEndpoint(name = "StockQuoteSoap")
    public StockQuoteSoap getStockQuoteSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteSoap"), StockQuoteSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockQuoteSoap
     */
    @WebEndpoint(name = "StockQuoteSoap")
    public StockQuoteSoap getStockQuoteSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteSoap"), StockQuoteSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns StockQuoteSoap
     */
    @WebEndpoint(name = "StockQuoteSoap12")
    public StockQuoteSoap getStockQuoteSoap12() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteSoap12"), StockQuoteSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockQuoteSoap
     */
    @WebEndpoint(name = "StockQuoteSoap12")
    public StockQuoteSoap getStockQuoteSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteSoap12"), StockQuoteSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns StockQuoteHttpGet
     */
    @WebEndpoint(name = "StockQuoteHttpGet")
    public StockQuoteHttpGet getStockQuoteHttpGet() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteHttpGet"), StockQuoteHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockQuoteHttpGet
     */
    @WebEndpoint(name = "StockQuoteHttpGet")
    public StockQuoteHttpGet getStockQuoteHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteHttpGet"), StockQuoteHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns StockQuoteHttpPost
     */
    @WebEndpoint(name = "StockQuoteHttpPost")
    public StockQuoteHttpPost getStockQuoteHttpPost() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteHttpPost"), StockQuoteHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockQuoteHttpPost
     */
    @WebEndpoint(name = "StockQuoteHttpPost")
    public StockQuoteHttpPost getStockQuoteHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteHttpPost"), StockQuoteHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STOCKQUOTE_EXCEPTION!= null) {
            throw STOCKQUOTE_EXCEPTION;
        }
        return STOCKQUOTE_WSDL_LOCATION;
    }

}
