/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

import edunova.model.Djelatnik;
import edunova.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author mkordic
 */
public class Start {
    private Session session;
    public Start(){
        this.session = HibernateUtil.getSession();
        veze();
    }
     private void veze() {
            session.beginTransaction();
            
            Djelatnik djelatnik = new Djelatnik("Mirela", "Čulič", "Sljemenska 45", "Osijek", "HR", 31000);
            session.save(djelatnik);
             djelatnik = new Djelatnik("Ana", "Brdar", "Matije Gubca 56", "Valpovo","HR", 31322);
            session.save(djelatnik);
            
            session.getTransaction().commit();;
    }
    public static void main(String[] args) {
      new Start();  
    }

   
}
