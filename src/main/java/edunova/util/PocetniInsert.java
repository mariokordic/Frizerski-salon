/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Djelatnik;
import edunova.model.Korisnik;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author mkordic
 */
public class PocetniInsert {
    public static void izvedi(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();
        List<Djelatnik> djelatnici = generirajDjelatnike(faker,session);
        List<Korisnik> korisnici = generirajKorisnike(faker,session);
        session.getTransaction().commit();
        
    }

    private static List<Djelatnik> generirajDjelatnike(Faker faker, Session session) {
       List<Djelatnik> djelatnici = new ArrayList<>();
       Djelatnik d;
       
       for(int i=0;i<20;i++){
           d = new Djelatnik();
           d.setIme(faker.name().firstName());
           d.setPrezime(faker.name().lastName());
           d.setAdresa(faker.address().streetAddress());
           d.setGrad(faker.address().cityName());
           d.setDrzava(faker.address().country());
           d.setPostanskiBroj(faker.address().zipCode().toString());
           session.save(d);
           djelatnici.add(d);
       }
       return djelatnici;
       
    }

    private static List<Korisnik> generirajKorisnike(Faker faker, Session session) {
       List<Korisnik> korisnici = new ArrayList<>();
       Korisnik k;
    
        for(int i=0;i<300;i++){
           k = new Korisnik();
           k.setIme(faker.name().firstName());
           k.setPrezime(faker.name().lastName());
           k.setBrojMobitela(faker.phoneNumber().phoneNumber());
           k.setDrzava(faker.address().country());
           k.setGrad(faker.address().city());
           k.setAdresa(faker.address().streetAddress());
           k.setSpol(Math.random()<0.5 ? 'M' : 'Ž');
           k.setPostanskiBroj(faker.address().zipCode().toString());
           
           session.save(k);
           korisnici.add(k);
       }
       return korisnici;
       
    }
}
