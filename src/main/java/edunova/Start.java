/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

import edunova.model.Djelatnik;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import java.awt.SplashScreen;
import org.hibernate.Session;

/**
 *
 * @author mkordic
 */
public class Start {
    private Session session;
    public Start(){
        this.session = HibernateUtil.getSession();

    }
    
      public static void main(String[] args) {
        new edunova.view.SplashScreen().setVisible(true);
          PocetniInsert.izvedi();
    }

   
}
