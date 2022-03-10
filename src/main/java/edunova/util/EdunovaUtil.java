/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author mkordic
 */
public class EdunovaUtil {
    
  
    public static final String NAZIV_APP="Edunova app";
    
    /**
     * String naslov aplikacije koji se sastoji od naziva aplikacije, programa na kojem se nalazim i operatera koji radi
     * @param naslov To je naslov trenutnog programa
     * @return Puni naziv koji se pojavljuje u Naslovu programa
     */
   

    public static String generirajOib() {
        // DZ
        // Umjesto spajanja na web stranicu napraviti generiranje u java programskom jeziku
        // https://regos.hr/app/uploads/2018/07/KONTROLA-OIB-a.pdf
        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            url.openStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            Document d = Jsoup.parse(sb.toString());
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();
        } catch (Exception e) {
        }
        return "";
    }

}
