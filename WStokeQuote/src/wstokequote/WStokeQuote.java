/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wstokequote;

import java.util.Scanner;

/**
 *
 * @author falc0n
 */
public class WStokeQuote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the stock symbol");
        String symbol = scan.next();
        System.out.println("StokeQuote is: "+getQuote(symbol));
        
    }

    private static String getQuote(java.lang.String symbol) {
        net.webservicex.StockQuote service = new net.webservicex.StockQuote();
        net.webservicex.StockQuoteSoap port = service.getStockQuoteSoap();
        return port.getQuote(symbol);
    }
    
}
